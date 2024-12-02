package custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword

import org.apache.commons.lang.RandomStringUtils

import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class StudioAssist {

	/*Generate a Katalon Studio keyword with @Keyword annotation and function to connect to a postgresql database then query with sql query and finally return the first row as a map object with jdbc driver*/

	/*Genarate a Katalon Studio keyword with @Keyword annotation and function a using apache poi to fetch data from specified cell in a xlsx file*/

	/*Genarate a Katalon Studio keyword with @Keyword annotation and function for javascript way of set text to input field in katalon object repository*/

	/*Generate a Katalon Studio keyword with @Keyword annotation and function to transform an json node element to another and return the json object*/

	/*Generate a Katalon Studio keyword with @Keyword annotation and function to extract specific data from pdf file using pdfbox apache library*/

	/*Generate a Katalon Studio keyword with @Keyword annotation and function to upload a image file to webportal*/

	/*Generate 2 Katalon Studio keywords with @Keyword annotation and the respective functions : one that saves cookies from existing browser session before close browser and second keyword that subsequently uses the saved cookie in the test case*/

	/*Generate a Katalon Studio keyword with @Keyword annotation and function in groovy to run a batch file from a specific path as administrator in windows*/

	/*Generate a Katalon Studio keyword with @Keyword annotation and function to invoke camera app and then snap a picture from Android mobile camera using ADB*/

	/*Generate a Katalon Studio keyword with @Keyword that can extract text from word document using Apache Poi library*/

	/*Generate a Katalon Studio keyword with @Keyword annotation, give relevant function name, arguments and return type, finally add all the imports required for the keyword.*/

	/**
	 * Given I am already in a Katalon Keyword public groovy/java class. Generate the entire code. Do not use existing custom keywords - Generate a single Katalon Studio keywowrd in groovy/java with @Keyword annotation that can be used to 
	 * Generate 10 random email that ends with katalon.com domain, Generate 10 random phone numbers and finally write the generated emails and phone numbers to an xlsx file under "TestData/DataGenerator.xlsx" and sheet "SA" (create the file and sheet if it doesn't exist. If the file exists overwrite it).
	 */


	@Keyword
	def generateTestData() {
		// Generate 10 random email addresses ending with katalon.com domain
		for (int i = 0; i < 10; i++) {
			String randomEmail = RandomStringUtils.randomAlphabetic(5) + "@katalon.com";
			println("Generated email: " + randomEmail);
		}

		// Generate 10 random phone numbers
		for (int i = 0; i < 10; i++) {
			String randomPhoneNumber = RandomStringUtils.randomNumeric(10);
			println("Generated phone number: " + randomPhoneNumber);
		}

		// Write the generated emails and phone numbers to an xlsx file
		String filePath = "TestData/DataGenerator.xlsx";
		String sheetName = "SA";

		// Create a new Excel file if it doesn't exist
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);

		// Write the headers
		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("Email");
		headerRow.createCell(1).setCellValue("Phone Number");

		// Write the generated data
		for (int i = 0; i < 10; i++) {
			Row dataRow = sheet.createRow(i + 1);
			dataRow.createCell(0).setCellValue(RandomStringUtils.randomAlphabetic(5) + "@katalon.com");
			dataRow.createCell(1).setCellValue(RandomStringUtils.randomNumeric(10));
		}

		// Write the workbook to the file
		FileOutputStream fileOut = new FileOutputStream(filePath);
		workbook.write(fileOut);
		fileOut.close();
	}
}