package katalon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject


import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.util.CellRangeAddress

import java.nio.file.Files
import java.nio.file.Paths

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Excel {

	/*Write a katalon keyword function with @Keyword annotation. The function will read an excel spreadsheet and will apply filter on specified excel columns using apache poi. The excel worksheet, sheet name, row on which filter has to be applied and filtered criteria on different columns as map have to be passed as arguments. At the end the specified filter should be auto applied on the same excel spread sheet*/

	/*
	 *  This keyword function reads an excel spreadsheet and applies filters on specified excel columns.
	 *  The function takes the excel worksheet, sheet name, row on which filter has to be applied, and filtered criteria on different columns as a map.
	 *  The specified filter is auto applied on the same excel spreadsheet that was provided.
	 *
	 *  @param excelFilePath The path to the Excel spreadsheet
	 *  @param sheetName The name of the sheet in the Excel spreadsheet
	 *  @param filterRow The row number on which the filter has to be applied (starts with 1, as denoted on the Microsoft excel row number)
	 *  @param filterCriteriaMap A map containing column names as keys and filter criteria as values
	 */
	@Keyword
	def applyFilterOnExcelColumns(String excelFilePath, String sheetName, int filterRow, Map<String, String> filters) {
		FileInputStream file = new FileInputStream(excelFilePath)
		XSSFWorkbook workbook = new XSSFWorkbook(file)
		Sheet sheet = workbook.getSheet(sheetName)

		if (sheet == null) {
			println "Sheet $sheetName not found."
			workbook.close()
			return
		}

		// Get the header row (filterRow - 1 because POI is 0-based index)
		Row headerRow = sheet.getRow(filterRow - 1)
		if (headerRow == null) {
			println "Header row not found at row $filterRow"
			workbook.close()
			return
		}

		// Determine the last column index to set the AutoFilter range
		int lastColumnIndex = headerRow.getLastCellNum() - 1
		String startColumn = getExcelColumnName(0)
		String endColumn = getExcelColumnName(lastColumnIndex)
		String filterRange = "${startColumn}${filterRow}:${endColumn}${filterRow}"

		// Apply AutoFilter to the header row
		sheet.setAutoFilter(CellRangeAddress.valueOf(filterRange))

		// Apply the filters
		filters.each { columnName, filterValues ->
			int columnIndex = findColumnIndex(headerRow, columnName)
			if (columnIndex != -1) {
				// Iterate over each row after the header and hide rows that don't match filter criteria
				sheet.eachWithIndex { Row row, int idx ->
					if (idx >= filterRow) {
						// Skip header row
						Cell cell = row.getCell(columnIndex)
						if (cell == null || !filterValues.contains(cell.getStringCellValue())) {
							row.setZeroHeight(true) // Hide row if it doesn't match filter
						}
					}
				}
				println "Filter applied on column '$columnName' for values: $filterValues"
			} else {
				println "Column '$columnName' not found in the sheet."
			}
		}

		// Save the filtered Excel file
		FileOutputStream outFile = new FileOutputStream(excelFilePath)
		workbook.write(outFile)
		outFile.close()
		workbook.close()
		println "Filters applied and workbook saved."
	}

	def String getExcelColumnName(int index) {
		StringBuilder columnName = new StringBuilder();
		index++;
		while (index > 0) {
			int remainder = (index - 1) % 26;
			columnName.insert(0, (char) (((char)'A') + remainder));
			index = (index - 1) / 26;
		}
		return columnName.toString();
	}

	def int findColumnIndex(Row headerRow, String headerName) {
		headerRow.eachWithIndex { Cell cell, int index ->
			if (cell.getStringCellValue().equalsIgnoreCase(headerName)) {
				return index
			}
		}
		return -1 // Header not found
	}

	//	def int findColumnIndex(Worksheet sheet, int headerRowIndex, String headerName) {
	//		Cells cells = sheet.getCells();
	//		Row headerRow = cells.getRows().get(headerRowIndex);
	//
	//		for (int col = 0; col <= cells.getMaxColumn(); col++) {
	//			Cell cell = cells.get(headerRowIndex, col);
	//			if (cell != null && cell.getStringValue().equalsIgnoreCase(headerName)) {
	//				return col;
	//			}
	//		}
	//		return -1;
	//	}

	@Keyword
	def String getExcelColumnName(String excelPath) {
		def data = ExcelKeywords.getExcelSheet(excelPath, 0)

		def headerRow = data[0]

		ArrayList<XSSFRow> filteredRows = new ArrayList<XSSFRow>()

		int formuleIndex = -1
		headerRow.eachWithIndex {
			headerValue, index -> 
				if (headerValue.getStringCellValue() == "FORMULE") {
				formuleIndex = index
				return
			}
		}

		int garantieIndex = -1

		headerRow.eachWithIndex {
			headerValue, index ->
			if (headerValue.getStringCellValue() == "GAD_LIBELLE") {
				garantieIndex = index
				return // Exit the loop once found
			}
		}
		data.each {
			XSSFRow row ->
			boolean matches = false
			if(!garant.equals("") && row[garantieIndex].getStringCellValue().equals(garant) && row[formuleIndex].getStringCellValue().equals(formule)) {
				matches = true
			}
			if (matches) {
				filteredRows.add(row)
			}
		}
		int   size1 = filteredRows.size()

		Integer rand_num = new Random().nextInt(size1)
		XSSFRow rown = filteredRows[rand_num]

		Cell formule=rown.getCell(formuleIndex)

		Cell garantie=rown.getCell(garantieIndex)

		WriteExcel.dataExcel(folder+output,ligne,'Input_output',formule.getStringCellValue(),'Formule')

		WriteExcel.dataExcel(folder+output,ligne,'Input_output',garantie.getStringCellValue(),'Garantie')
	}
}
