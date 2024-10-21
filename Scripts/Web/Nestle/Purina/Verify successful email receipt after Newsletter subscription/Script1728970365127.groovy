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

WebUI.navigateToUrl('https://www.purina.de/')

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_PURINA  Dein Haustier, unsere Leidenschaft/button_Zustimmen'))

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_PURINA  Dein Haustier, unsere Leidenschaft/a_Newsletter'))

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_Anrede_title'))

WebUI.setText(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_Vorname_firstname'), 
    'Pravin')

WebUI.setText(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_Nachname_lastname'), 
    'R')

WebUI.setText(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_E-Mail Adresse_e_mail'), 
    'pravinrajpaul@gmail.com')

WebUI.setText(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_E-Mail Adresse wiederholen_e_mail_confirm'), 
    'pravinrajpaul@gmail.com')

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/label_Katze  Hund'))

WebUI.scrollToElement(findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/label_PURINA ONE'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/label_PURINA ONE'))

WebUI.scrollToElement(findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/label_ADVENTUROS'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/label_ADVENTUROS'))

WebUI.scrollToElement(findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_Einwilligung_consent_d'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_Einwilligung_consent_d'))

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_consent_g_consent_g'))

WebUI.scrollToElement(findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_consent_three_consent_three'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_consent_three_consent_three'))

WebUI.scrollToElement(findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/label_Captcha'), 0)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'katalon.Web.moveToElement'(findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_CAPTCHA_op'))

WebUI.delay(60, FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'katalon.Web.moveToCaptchaAndClick'(findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_recaptcha1'), 
    findTestObject('Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/iframe_CAPTCHA'))

not_run: WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_recaptcha'))

WebUI.click(findTestObject('Object Repository/Web/Purina/Page_Bleibe mit uns im Kontakt PURINA Club _832cb0/input_CAPTCHA_op'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/Purina/Page_Newsletter Dankeseite  PURINA/h1_Vielen Dank fr dein Interesse'), 
    'Vielen Dank für dein Interesse!')

String email = CustomKeywords.'email.Keywords.getLatestGmail'('pravinrajpaul@gmail.com', 'ewhgkrkpzfuziblf', 'EmailVerification/Purina')

expected = 'Bitte bestätige deine Newsletter-Bestellung durch Klick auf den unten stehenden Link. Deine Daten werden verwendet, um dir folgende Newsletter und Services zukommen zu lassen:'

assert email.contains(expected)

