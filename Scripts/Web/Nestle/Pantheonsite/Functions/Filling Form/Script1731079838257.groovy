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

WebUI.navigateToUrl('https://dev-ssb-demo.pantheonsite.io/member/enrollment')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__first_name'), 'Pravin')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__middle_initial'), 'R')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__last_name'), 'R')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -CatDogBoth'), 
    'cat', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -I have a cattery.Does Not Apply'), 
    'no', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__addressaddress'), '1223 Lakes st')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__addresscity'), 'Minneapolis')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -AlabamaAlaskaAmerican Samo_082b03'), 
    'MN', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__addresspostal_code'), 
    '55408')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__primary_phone'), '3332221235')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__email_addressmail_1'), 
    email)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__email_addressmail_2'), 
    email)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__reference_code'), '000000')

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__agree'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__op'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__cat_involvement'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -AbyssinianAmerican Bobtail_defdb8'), 
    'American Curl', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__cat_breeditems0cat_primary_number_of_adults'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__cat_breeditems0cat_primary_number_of_e5e8f4'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__cat_breeditems0cat_primary_number_of_c2b1c3'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320'), 
    'ANF', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320_1'), 
    '9 Lives', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320_1_2'), 
    'Acana', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320_1_2_3'), 
    'Bil Jac', true)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input__op'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/select_- Select -Purina Representative (ple_29890f'), 
    'Magazine Ad', true)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input_Purina Pro Club Program Terms_confirm_f2ac89'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input_I agree to receive email and other ma_214654'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  SSB/input_Terms and Conditions_op'))

