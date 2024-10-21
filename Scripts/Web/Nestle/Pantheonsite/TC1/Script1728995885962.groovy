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

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__first_name'), 'Pravin - & ')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__middle_initial'), 
    '')

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__middle_initial'))

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__last_name'), 'R')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -CatDogBoth'), 
    'both', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -I have a cattery.Does Not Apply'), 
    'yes', true)

WebUI.scrollToElement(findTestObject('Web/Pantheonsite/Page_Member Enrollment  Merrick/input__primary_phone'), 0)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__cattery_business_name'), 
    'Business Name --')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -I have a kennel.Does Not Apply'), 
    'yes', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__kennel_business_name'), 
    'Business Name Kennel')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__addressaddress'), 
    '3000')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__addressaddress_2'), 
    'Clark Street')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__addresscity'), 'Arlington')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AlabamaAlaskaAmerican Samo_082b03'), 
    'VA', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__addresspostal_code'), 
    '22202')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__primary_phone'), 
    '9785764343')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__email_addressmail_1'), 
    'pravinrajpaul@gmail.com')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__email_addressmail_2'), 
    'pravinrajpaul@gmail.com')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__reference_code'), 
    '000000')

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__agree'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__op'))

errorMessage = WebUI.getText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/div_Error message                    Pravin_2a9bda'), 
    FailureHandling.STOP_ON_FAILURE)

expectedErrorMessage = 'Error message\nPravin - & contains illegal special characters or spaces.'

assert errorMessage.equals(expectedErrorMessage)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__first_name'), 'Pravin')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__op'), 0)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__op'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_breeder_involvement'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -SHOWSPORTINGPERFORMANCESER_761e59'), 
    'SHOW', true)

WebUI.scrollToElement(findTestObject('Web/Pantheonsite/Page_Member Enrollment  Merrick/input_dog_breed_table_add'), 0)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/label_Groomer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- None -SHOWSPORTINGPERFORMANCESERVI_281e7e'), 
    'PERFORMANCE', true)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_secondary_segment_performance'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AffenpinscherAfghan HoundA_ef929c'), 
    'American Rabbit Hound', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_breeditems0dog_primary_number_of_adults'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_breeditems0dog_primary_number_of_f1f29a'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_breeditems0dog_primary_number_of_b8805c'), 
    '1')

WebUI.click(findTestObject('Web/Pantheonsite/Page_Member Enrollment  Merrick/input_dog_breed_table_add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AffenpinscherAfghan HoundA_ef929c_1'), 
    'Afghan Hound', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_breeditems1dog_primary_number_of_adults'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_breeditems1dog_primary_number_of_a1c534'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_breeditems1dog_primary_number_of_1dafa8'), 
    '1')

WebUI.scrollToElement(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__op_1'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AcanaAlpoAnnamaetBil-JacBl_cc4de1'), 
    'Evangers', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AcanaAlpoAnnamaetBil-JacBl_cc4de1_1'), 
    'Enhance', true)

WebUI.selectOptionByValue(findTestObject('Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AcanaAlpoAnnamaetBil-JacBl_cc4de1_2'), 
    'Enhance', true)

WebUI.selectOptionByValue(findTestObject('Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AcanaAlpoAnnamaetBil-JacBl_cc4de1_3'), 
    'Eagle', true)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/label_Primary brand of dog food I feed my adults'))

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__dog_primary_breed_clubitems0_item_'), 
    'Club')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- None -Affenpinscher Club of Americ_18c155'), 
    'American Chesapeake Club, Inc.', true)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__op_1'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/label_Breeding Cattery'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -AbyssinianAmerican Bobtail_defdb8'), 
    'Colorpoint Shorthair', true)

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__cat_breeditems0cat_primary_number_of_adults'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__cat_breeditems0cat_primary_number_of_e5e8f4'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__cat_breeditems0cat_primary_number_of_c2b1c3'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320'), 
    'Black Gold', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320_1'), 
    'Artemis', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320_1_2'), 
    'Atta Cat', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -7Th Heaven9 LivesA N F (Un_c7f320_1_2_3'), 
    'Alpo Cat Food', true)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/div_Add more items                    more items'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input__op_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/select_- Select -Purina Representative (ple_29890f'), 
    'Purina-sponsored event', true)

WebUI.scrollToElement(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input_Terms and Conditions_op'), 
    0)

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input_Purina Pro Club Program Terms_confirm_f2ac89'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input_I agree to receive email and other ma_214654'))

WebUI.click(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/input_Terms and Conditions_op'))

errorMessage = WebUI.getText(findTestObject('Object Repository/Web/Pantheonsite/Page_Member Enrollment  Merrick/div_Error message                    ERROR _56e80f'), 
    FailureHandling.STOP_ON_FAILURE)

expectedErrorMessage = 'Error message\nERROR: 400 Bad Request Address does not exist'

assert errorMessage.equals(expectedErrorMessage)

WebUI.closeBrowser()

