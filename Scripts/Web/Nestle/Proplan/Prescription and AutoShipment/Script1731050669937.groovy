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

WebUI.navigateToUrl('https://preprod.proplanvetdirect.com/customer/account/login/')

WebUI.setText(findTestObject('Object Repository/Web/Proplan/Page_Pet Owner Sign In/input_Email_loginusername'), 'nestle.purina.dpqa.nd2+2024@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Proplan/Page_Pet Owner Sign In/input_Password hidden_loginpassword'), 
    '5RADyv702oRQcHpzpHgy340C4Xox5c+r')

WebUI.click(findTestObject('Object Repository/Web/Proplan/Page_Pet Owner Sign In/span_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/Proplan/Page_Purina Prescription Dog and Cat Food  _bb5bec/span_Your prescription(s) for Canine - DH -_110199'), 
    'Your prescription(s) for Canine - DH - Dental Health has expired. Your associated auto-shipment orders won\'t be processed. Please renew this PRESCRIPTION(S) or cancel your AUTO-SHIPMENT.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Web/Proplan/Page_Purina Prescription Dog and Cat Food  _bb5bec/a_auto-shipment'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/Proplan/Page_My Subscriptions/div_DH Dental Health Canine Formula - 16.5 lb bag'), 
    'DH Dental Health Canine Formula - 16.5 lb bag')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Proplan/Page_My Subscriptions/span_My Auto-Shipments'), 'My Auto-Shipments')

WebUI.back()

WebUI.delay(5)

WebUI.closeBrowser()

