import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

workbook = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook'('TestData/MasterData-ExcelReadWrite.xlsx')

tab = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet'(workbook, 'AddAddress')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress'(tab, 'A2', 'Address Line 1')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress'(tab, 'B2', 'Address Line 2')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress'(tab, 'C2', '+917865459394')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress'(tab, 'D2', 'Mumbai')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress'(tab, 'E2', 'Maharastra')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress'(tab, 'F2', '113323')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress'(tab, 'G2', 'India')

CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook'('TestData/MasterData-ExcelReadWrite.xlsx', workbook)

address1 = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress'(tab, 'A2')

address2 = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress'(tab, 'B2')

phone = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress'(tab, 'C2')

city = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress'(tab, 'D2')

state = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress'(tab, 'E2')

postcode = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress'(tab, 'F2')

country = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress'(tab, 'G2')

address = ((((((((((((address1 + ', ') + address2) + ', ') + city) + ', ') + state) + ', ') + country) + ', ') + postcode) + 
'\n') + phone)

println(address)

not_run: content = CustomKeywords.'msword.MsWord.readTextFromWord'('TestData\\DataWord.docx')

not_run: println(content)

