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

WebUI.navigateToUrl('https://www.nestle.de/info/nutzungsbedingungen')

WebUI.click(findTestObject('Object Repository/Page_Nutzungsbedingungen  Nestl/button_Zustimmen'))

WebUI.waitForElementVisible(findTestObject('Page_Nutzungsbedingungen  Nestl/span_'), 60)

WebUI.click(findTestObject('Object Repository/Page_Nutzungsbedingungen  Nestl/span_'))

WebUI.click(findTestObject('Object Repository/Page_Nutzungsbedingungen  Nestl/a_Bitte melde uns dein Anliegen'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Teilen Sie uns Ihr Anliegen mit  Nestl/p_Unsere Grundstze sind zentraler Bestandte_082ca7'), 
    'Unsere Grundsätze sind zentraler Bestandteil einer auf unverhandelbaren Prinzipien und Werten beruhenden Unternehmenskultur („Compliance-Kultur“).')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Teilen Sie uns Ihr Anliegen mit  Nestl/p_Unsere Grundstze sind zentraler Bestandte_082ca7'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Teilen Sie uns Ihr Anliegen mit  Nestl/a_LkSG - Rules of procedure (EN)'))

WebUI.click(findTestObject('Object Repository/Page_Teilen Sie uns Ihr Anliegen mit  Nestl/a_Hier geht es zum Verbraucherservice'))

