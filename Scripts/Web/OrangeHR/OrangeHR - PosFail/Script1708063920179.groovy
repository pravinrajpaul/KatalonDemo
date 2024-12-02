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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.switchToWindowTitle('OrangeHRM')

WebUI.setText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/input_Username_username'), 'admini')

WebUI.click(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/p_Invalid credentials'), 'Invalid credentials')

WebUI.setText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/input_Username_username'), 'a')

WebUI.setText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/input_Username_username_1'), '')

WebUI.setText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/input_Username_username'), 'admin123')

WebUI.click(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/Demo/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')

WebUI.closeBrowser()

