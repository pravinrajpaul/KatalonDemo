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

WebUI.navigateToUrl('https://www.axa.com.ph/products/car-insurance')

WebUI.click(findTestObject('Page_Buy Comprehensive Car Insurance Philip_ae4727/button_I ACCEPT'))

WebUI.click(findTestObject('Page_Buy Comprehensive Car Insurance Philip_ae4727/input__isPrivateUse'))

WebUI.click(findTestObject('Page_Buy Comprehensive Car Insurance Philip_ae4727/i__icon-expand_less fs-xl'))

WebUI.click(findTestObject('Page_Buy Comprehensive Car Insurance Philip_ae4727/div_2024'))

WebUI.click(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/div_Select Brand_css-19bb58m'))

WebUI.click(findTestObject('Page_Buy Comprehensive Car Insurance Philip_ae4727/div_BMW'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/h1_Vehicle Information'), 
    'Vehicle Information')

WebUI.closeBrowser()

