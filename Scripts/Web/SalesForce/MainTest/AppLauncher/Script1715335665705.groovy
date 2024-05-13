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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-inc--demo.sandbox.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Web/SalesForce/Page_Login  Salesforce/input_Username_username'), 'mohit.kumar@katalon.com.demo')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/SalesForce/Page_Login  Salesforce/input_Password_pw'), 'HWHXedaqLCdga/pq1EsgRw==')

WebUI.click(findTestObject('Object Repository/Web/SalesForce/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/Web/SalesForce/Page_Home  Salesforce/div_App Launcher'))

WebUI.setText(findTestObject('Web/SalesForce/Page_Home  Salesforce/div_Search'), 'Contacts')

WebUI.waitForElementVisible(findTestObject('Web/SalesForce/Page_Home  Salesforce/div_Contacts'), 5)

WebUI.click(findTestObject('Object Repository/Web/SalesForce/Page_Home  Salesforce/div_Contacts'))

WebUI.waitForElementVisible(findTestObject('Web/SalesForce/Page_Recently Viewed  Contacts  Salesforce/span_Contacts'), 0)

WebUI.setText(findTestObject('Web/SalesForce/Page_Recently Viewed  Contacts  Salesforce/input_Search this list_Contact-search-input'), 
    'Pravin')

WebUI.delay(5)

WebUI.closeBrowser()

