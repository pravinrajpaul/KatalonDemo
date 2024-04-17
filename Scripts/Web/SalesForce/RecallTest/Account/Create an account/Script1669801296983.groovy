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

WebUI.enhancedClick(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Recently Viewed  Leads  Salesforce/span_Accounts'))

WebUI.waitForElementPresent(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Recently Viewed  Accounts  Salesforce/div_New'), 
    5)

CustomKeywords.'web.ApplicationFunction.moveToElement'(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Recently Viewed  Accounts  Salesforce/div_New'))

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account  Salesforce/span_For business customers_slds-radio--faux'))

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account  Salesforce/span_Next'))

WebUI.waitForElementVisible(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/a_--None--'), 
    0)

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/a_--None--'))

WebUI.delay(3)

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/a_Mr'))

WebUI.setText(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/input_First Name_35960'), 
    'Mohit')

WebUI.setText(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/input__36160'), 
    'Katalon')

WebUI.setText(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/input_Email_36850'), 
    'mohit.kumar@katalon.com')

WebUI.setText(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/input_Phone_37010'), 
    '24635653465643')

WebUI.scrollToElement(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/div_Platforms'), 
    10)

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/span_Web'))

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/lightning-primitive-icon'))

WebUI.scrollToElement(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/div_Operating Systems'), 
    10)

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/span_Mac'))

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/lightning-primitive-icon - Mac'))

WebUI.sendKeys(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/input_Expected number of users_45410'), 
    '5')

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_New Account Person Account  Salesforce/span_Save'))

not_run: accountCreated = WebUI.getText(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Mohit Katalon  Salesforce/span_toastMessage slds-text-heading--small _f3870d'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Mohit Katalon  Salesforce/button_Delete'), 
    0)

WebUI.click(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Mohit Katalon  Salesforce/button_Delete'))

WebUI.verifyElementText(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Mohit Katalon  Salesforce/h2_Delete Person Account'), 
    'Delete Person Account')

WebUI.enhancedClick(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Mohit Katalon  Salesforce/span_Delete'))

not_run: WebUI.verifyElementText(findTestObject('Web/SalesForce/OR_Salesforce New/Account/Page_Recently Viewed  Accounts  Salesforce/span_Account Mohit Katalon was deleted. Undo'), 
    'Account "Mohit Katalon" was deleted. Undo')

