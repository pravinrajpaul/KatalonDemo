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

WebUI.navigateToUrl('https://steve.1mg.com/')

WebUI.click(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/div_Update'))

WebUI.setText(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/input_Zunhebotto_name'), 
    'Dolo 650')

WebUI.click(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/div_Dolo 650 Tablet'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Web/1Mg/Page_Dolo 650 Tablet View Uses, Side Effect_90d47c/div_Dolo 650 Tablet_drug_sound_icon_on'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/1Mg/Page_Dolo 650 Tablet View Uses, Side Effect_90d47c/div_Add to cart'))

WebUI.click(findTestObject('Object Repository/Web/1Mg/Page_Dolo 650 Tablet View Uses, Side Effect_90d47c/li_PROCEED TO CART'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/div_Apply coupon'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/input_Enter Your mobile number or email_phone'), 
    '9889989889')

WebUI.click(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/button_Send OTP'))

WebUI.setText(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/input_One Time Password_InputField__inputBo_d9773b'), 
    '214263')

WebUI.click(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/button_Done'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'web.ApplicationFunction.advancedClick'(findTestObject('Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/1Mg/Page_Online Pharmacy India  Buy Medicines f_4a034a/div_Error'), 
    'Error...')

WebUI.closeBrowser()

WebUI.switchToWindowIndex(null)
