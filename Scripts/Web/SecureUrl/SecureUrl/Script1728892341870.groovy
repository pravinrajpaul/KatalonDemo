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

not_run: encPass = CustomKeywords.'web.WebAdditives.encryptSecret'('admin abc')

not_run: println(encPass)

WebUI.openBrowser('')

//CustomKeywords.'web.WebAdditives.navigateToSecureURL'('https://the-internet.herokuapp.com/basic_auth', 'admin', '+AKm3sXxIk1FAA58ShB0+w==:pnGAV1NQsPdlF+m5byqI2Q==')
CustomKeywords.'web.WebAdditives.navigateToSecureURL'('http://localhost:3000/protected', 'domain\\admin', 'MLrSMY7p5iow9D23vfvweA==:OV69ug2mbqMgtkaCH1RK6w==')

