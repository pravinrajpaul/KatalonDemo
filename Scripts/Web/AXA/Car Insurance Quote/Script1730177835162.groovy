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

WebUI.navigateToUrl('https://www.axa.com.ph/products/car-insurance')

WebUI.click(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/button_I ACCEPT'))

WebUI.scrollToElement(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__isPrivateUse'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__isPrivateUse'))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Selects', [('label') : 'Year']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Select Options', [('text') : '2023']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Selects', [('label') : 'Brand']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Select Options', [('text') : 'BMW']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Selects', [('label') : 'Model']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Select Options', [('text') : '420i']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Selects', [('label') : 'Variant']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Select Options', [('text') : 'M Sport 2.00L Gas A/T 4x2 Coupe']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Selects', [('label') : 'Location']))

WebUI.click(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/Select Options', [('text') : 'South Luzon']))

WebUI.scrollToElement(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input_Yes_roadAssistance'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__actOfNature'))

WebUI.click(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input_Yes_roadAssistance'))

WebUI.scrollToElement(findTestObject('Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/button_Compute'), 
    0)

WebUI.setText(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__firstName'), 
    'Pravin')

WebUI.setText(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__lastName'), 
    'R')

WebUI.setText(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__mobileNumber'), 
    '+639000223210')

WebUI.takeFullPageScreenshot('Screen')

WebUI.setText(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__emailAddress'), 
    'pravin@gmail.com')

WebUI.click(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/input__consent'))

WebUI.click(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/button_Compute'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/AXA Insurance/Page_Buy Comprehensive Car Insurance Philip_ae4727/h1_Your Quotation'), 
    'Your Quotation')

WebUI.closeBrowser()

