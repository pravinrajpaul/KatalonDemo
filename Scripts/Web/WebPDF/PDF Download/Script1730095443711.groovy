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

WebUI.navigateToUrl('http://foersom.com/en/FaseSpin.html')

WebUI.click(findTestObject('Object Repository/Web/WebPDF/Page_SPIN/strong_brochure (PDF)'))

not_run: WebUI.switchToWindowUrl('http://foersom.com/space4environment/data/SPIN_brochure.pdf')

not_run: WebUI.delay(3)

not_run: CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.pressHoldSpecialKey'('CTRL')

not_run: CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.typeText'('s')

not_run: CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.releaseHeldKey'('CTRL')

not_run: WebUI.delay(3)

not_run: CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.typeSpecialKey'('ENTER')

WebUI.delay(5)

WebUI.closeBrowser()

