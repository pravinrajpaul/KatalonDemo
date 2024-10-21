package katalon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class Kendo {


	//date format dd MMM YYYY

	@Keyword
	def setDateKendoCalendar(String date) {
		String[] dateSplit = date.split(" ")
		String day = dateSplit[0]
		String month = dateSplit[1]
		String year = dateSplit[2]

		WebUI.findWebElement(findTestObject('Web/Kendo/Calendar/Calendar'), 0)

		String calMonYear = WebUI.getText(findTestObject('Web/Kendo/Calendar/Parent')).split(" ")
		String calMonth = calMonYear[0]
		String calYear = calMonYear[1]
		String todaysDate = WebUI.getText(findTestObject('Web/Kendo/Calendar/Today'))

		if (year.equals(calYear) &&  month.equalsIgnoreCase(calMonth) && day.equals(todaysDate)) WebUI.click(findTestObject('Web/Kendo/Calendar/Today'))
		else if (year.equals(calYear) &&  month.equalsIgnoreCase(calMonth)) WebUI.click(findTestObject('Web/Kendo/Calendar/Date',[('date'):day]))

		else if (year.equals(calYear)) {
			WebUI.click(findTestObject('Web/Kendo/Calendar/Parent'))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Month',[('month'):month.capitalize()]))
		}
		else if (year.substring(0,2).equals("20")) {
			WebUI.click(findTestObject('Web/Kendo/Calendar/Parent'))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Parent'))
			WebUI.delay(1)
			String fromtoYear = WebUI.getText(findTestObject('Web/Kendo/Calendar/Parent')).split(" - ")
			String fromYear = fromtoYear[0]
			String toYear = fromtoYear[1]
			if (year>=fromYear && year<=toYear) WebUI.click(findTestObject('Web/Kendo/Calendar/Year',[('year'):year]))
			else {
				WebUI.click(findTestObject('Web/Kendo/Calendar/Parent'))
				WebUI.delay(1)
				WebUI.click(findTestObject('Web/Kendo/Calendar/Year',[('year'):year.substring(0,3)+"0"]))
				WebUI.delay(1)
				WebUI.click(findTestObject('Web/Kendo/Calendar/Year',[('year'):year]))
			}
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Month',[('month'):month.capitalize()]))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Date',[('date'):day]))
		}
		else if (year.substring(0,2).equals("19")) {
			WebUI.click(findTestObject('Web/Kendo/Calendar/Parent'))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Parent'))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Parent'))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Century',[('century'):"1900"]))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Year',[('year'):year.substring(0,3)+"0"]))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Year',[('year'):year]))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Month',[('month'):month.capitalize()]))
			WebUI.delay(1)
			WebUI.click(findTestObject('Web/Kendo/Calendar/Date',[('date'):day]))
		}
	}
}
