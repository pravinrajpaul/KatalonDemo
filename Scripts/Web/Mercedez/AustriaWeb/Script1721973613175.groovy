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

WebUI.navigateToUrl('https://www.mercedes-benz.at/')

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Mercedes-Benz Personenwagen/button_button-5ea-dde-679'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Mercedes-Benz Personenwagen/a_Mehr erfahren-gen-6c2-659'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/a_Angebot anfordern-enz-186-d38'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/div_indicator-37f-785-892'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/label_wrapper-37f-d0e-7c6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/select_Bitte whlenC-Klasse T-ModellGLE SUVE_53685a'), 
    'GLE', true)

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_firstname-37f-72a-14f'), 
    'Prav')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_lastname-37f-409-7f9'), 
    'Rrr')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_mobilePhone-37f-369-f2b'), 
    '1234543234')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_email-37f-86f-84b'), 'p')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_mobilePhone-37f-369-f2b'), 
    '1234543234')

WebUI.setText(findTestObject('Page_Milestars I Mercedes-Benz/input_street-37f-5f7-d46'), 'adw')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_houseNumber-37f-bc1-f3e'), 
    'St st')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_zipCode-37f-39c-163'), 
    '8036')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/input_city-37f-463-619'), 'ATSZG')

WebUI.setText(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/textarea_leadDescription-37f-8f6-ae6'), 
    'Comment')

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/button_button-37f-b01-c6c'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/div_form-dealer-section__selector-widget-en_b08c55'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/circle-37f-1ca-1d4'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/path-1ca-e8b-1e5'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/button_button-1ca-9a1-8e0'))

WebUI.click(findTestObject('Object Repository/Web/Mercedez/Page_Milestars I Mercedes-Benz/button_button-37f-16f-720'))

WebUI.closeBrowser()

