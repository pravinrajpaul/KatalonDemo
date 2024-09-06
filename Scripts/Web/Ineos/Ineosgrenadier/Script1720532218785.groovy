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

WebUI.navigateToUrl('https://ineosgrenadier.com/')

WebUI.waitForElementVisible(findTestObject('Object Repository/Web/Ineos/Page_Country Selector  INEOS Grenadier/button_Accept All Cookies'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Country Selector  INEOS Grenadier/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Country Selector  INEOS Grenadier/div'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Country Selector  INEOS Grenadier/li_Germany'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Country Selector  INEOS Grenadier/span_Continue'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Der INEOS Grenadier 4X4 Gelndewagen  I_b39709/span_Buche deine Probefahrt'))

WebUI.setText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/input_Bitte gib Deine Postleitzahl, Region _31f5d3'), 
    'Hello')

WebUI.click(findTestObject('Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/selectpop'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/div'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/li_Quartermaster'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/svg_Mein bevorzugtes Fahrzeug fr die Probef_750bec'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/span_19'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/li_Nachmittag'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/li_Vormittag'))

WebUI.setText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/input_Vorname_personalInfo.firstName'), 
    'R')

WebUI.setText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/input_Nachname_personalInfo.lastName'), 
    'Prav')

WebUI.setText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/input_E-Mail_personalInfo.email'), 
    'prav@prav.com')

WebUI.setText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/input_E-Mail-Adresse besttigen_personalInfo_be026d'), 
    'prav@prav.com')

WebUI.setText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/input_Telefonnummer_personalInfo.phoneNumber'), 
    '8765432100')

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/span_Telefonnummer_jss1079 jss1082'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/span_Ja, ich mchte mehr ber Finanzierungsop_b28d0a'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/div_Deine Mitteilung_MuiInputBase-root MuiI_e69bf1'))

WebUI.setText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/textarea_Comment'), 
    'Comment')

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/span_Comment_jss1079 jss1082'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/span_Ich bin damit einverstanden, Mitteilun_79471c'))

WebUI.click(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/button_Anfrage absenden'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/Ineos/Page_Buche deine Grenadier Probefahrt  INEO_ac2e51/span_Nothing has been found. Please try ano_1625db'), 
    'Nothing has been found. Please try another query')

WebUI.closeBrowser()

