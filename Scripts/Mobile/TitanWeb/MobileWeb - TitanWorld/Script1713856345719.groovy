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

WebUI.navigateToUrl('https://www.titan.co.in/')

WebUI.waitForElementVisible(findTestObject('Mobile/MobileWeb - TitanWorld/Page_Titan The Official Website for Titan W_a22814/span_Track order_close-icon'), 
    30)

WebUI.click(findTestObject('Object Repository/Mobile/MobileWeb - TitanWorld/Page_Titan The Official Website for Titan W_a22814/span_Track order_close-icon'))

WebUI.click(findTestObject('Object Repository/Mobile/MobileWeb - TitanWorld/Page_Titan The Official Website for Titan W_a22814/div_Allow'))

WebUI.click(findTestObject('Object Repository/Mobile/MobileWeb - TitanWorld/Page_Titan The Official Website for Titan W_a22814/img_Get upto 10 cashback on payment via Mob_f034d2'))

WebUI.click(findTestObject('Object Repository/Mobile/MobileWeb - TitanWorld/Page_Titan The Official Website for Titan W_a22814/span_Track Order'))

WebUI.click(findTestObject('Object Repository/Mobile/MobileWeb - TitanWorld/Page_Titan The Official Website for Titan W_a22814/button_Track order'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile/MobileWeb - TitanWorld/Page_Titan The Official Website for Titan W_a22814/div_Please enter valid email Id'), 
    'Please enter valid email Id')

WebUI.closeBrowser()

