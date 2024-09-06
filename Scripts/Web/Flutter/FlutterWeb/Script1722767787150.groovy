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

WebUI.navigateToUrl('http://192.168.68.62/')

WebUI.click(findTestObject('Object Repository/Web/WebFlutter/Page_/flt-semantics_Expense Tracker_flt-semantic-node-12'))

WebUI.click(findTestObject('Web/WebFlutter/Page_/input'))

WebUI.setText(findTestObject('Object Repository/Web/WebFlutter/Page_/input'), 'My Expense')

WebUI.delay(1)

WebUI.click(findTestObject('Web/WebFlutter/Page_/input_1'))

WebUI.setText(findTestObject('Object Repository/Web/WebFlutter/Page_/input_1'), '10.25')

WebUI.delay(1)

WebUI.click(findTestObject('Web/WebFlutter/Page_/input_1_2'))

WebUI.setText(findTestObject('Object Repository/Web/WebFlutter/Page_/input_1_2'), '01 Aug 2024')

WebUI.click(findTestObject('Object Repository/Web/WebFlutter/Page_/flt-semantics_HOME'))

WebUI.click(findTestObject('Object Repository/Web/WebFlutter/Page_/flt-semantics_LEISURE'))

WebUI.click(findTestObject('Object Repository/Web/WebFlutter/Page_/flt-semantics_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/WebFlutter/Page_/flt-semantics_My Expense10.2501 Aug 2024'), 
    'My Expense $10.25 01 Aug 2024')

