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

WebUI.navigateToUrl('https://myfancyfeast.com/')

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Customized Fancy Feast Variety Packs  _4bd609/svg_Search_icon icon-account'))

WebUI.setText(findTestObject('Object Repository/Web/Myfancyfeast/Page_Account  My Fancy Feast/input_Login_customeremail'), 
    'pravinrajpaul@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Myfancyfeast/Page_Account  My Fancy Feast/input_Email_customerpassword'), 
    'fJfSCPMMNStOFxmDHq2mgQ==')

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Account  My Fancy Feast/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Challenge  My Fancy Feast/div_I am human_checkbox'))

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Challenge  My Fancy Feast/canvas'))

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Challenge  My Fancy Feast/div_Next'))

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Challenge  My Fancy Feast/canvas'))

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Challenge  My Fancy Feast/div_Verify'))

WebUI.click(findTestObject('Object Repository/Web/Myfancyfeast/Page_Challenge  My Fancy Feast/input_Cart_shopify-challenge__button btn'))

WebUI.closeBrowser()

