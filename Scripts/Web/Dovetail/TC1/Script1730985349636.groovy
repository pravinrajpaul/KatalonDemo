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

WebUI.navigateToUrl('https://team-workspace-vymj.dovetail.com/')

WebUI.waitForElementVisible(findTestObject('Object Repository/Web/Dovetail/Page_Log in  Dovetail/div_Continue with Google'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('Web/Dovetail/Page_Log in  Dovetail/div_Continue with Google'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('Sign in - Google Accounts')

WebUI.setText(findTestObject('Object Repository/Web/Dovetail/Page_Sign in - Google Accounts/input_Dovetail_identifier'), 
    'pravin.raveendran@katalon.com')

WebUI.click(findTestObject('Object Repository/Web/Dovetail/Page_Sign in - Google Accounts/span_Next'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Dovetail/Page_Sign in - Google Accounts/input_Too many failed attempts_Passwd'), 
    'PCKNlYFQetr9GCAkANxONA==')

WebUI.click(findTestObject('Object Repository/Web/Dovetail/Page_Sign in - Google Accounts/span_Next_1'))

WebUI.switchToWindowTitle('Home – Dovetail')

WebUI.click(findTestObject('Object Repository/Web/Dovetail/Page_Home  Dovetail/div_Your work'))

WebUI.click(findTestObject('Object Repository/Web/Dovetail/Page_Pravin Raveendrans profile - All  Dovetail/div_My first project'))

WebUI.click(findTestObject('Object Repository/Web/Dovetail/Page_My first project  Dovetail/div_Import'))

WebUI.click(findTestObject('Object Repository/Web/Dovetail/Page_My first project  Dovetail/button_Google Drive'))

WebUI.closeBrowser()

