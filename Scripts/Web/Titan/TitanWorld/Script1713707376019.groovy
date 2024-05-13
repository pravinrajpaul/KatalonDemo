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

WebUI.navigateToUrl('https://www.titan.co.in/')

WebUI.waitForElementVisible(findTestObject('Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/button_Allow'), 
    30)

WebUI.click(findTestObject('Object Repository/Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/button_Allow'))

WebUI.waitForElementVisible(findTestObject('Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/span_Track order_close-icon'), 
    60)

WebUI.click(findTestObject('Object Repository/Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/span_Track order_close-icon'))

WebUI.mouseOver(findTestObject('Object Repository/Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/a_Men'))

WebUI.mouseOver(findTestObject('Object Repository/Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/a_Shop by Collection'))

WebUI.click(findTestObject('Object Repository/Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/a_Neo Splash'))

WebUI.click(findTestObject('Web/TitanWorld/Page_Buy Online Titan Neo Splash Green Dial_4a0829/Page_Buy Neo Splash watches for men online/h5_Titan Neo Splash Brown Dial Analog with Date'))

WebUI.click(findTestObject('Object Repository/Web/TitanWorld/Page_Buy Online Titan Neo Splash Green Dial_4a0829/span_Pincode'))

WebUI.setText(findTestObject('Object Repository/Web/TitanWorld/Page_Buy Online Titan Neo Splash Green Dial_4a0829/input_Pincode_check-entry'), 
    '600119')

WebUI.click(findTestObject('Object Repository/Web/TitanWorld/Page_Buy Online Titan Neo Splash Green Dial_4a0829/button_Check'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/TitanWorld/Page_Buy Online Titan Neo Splash Green Dial_4a0829/div_Available for CHENNAI, India 600119'), 
    'Available for CHENNAI, India 600119')

WebUI.closeBrowser()

