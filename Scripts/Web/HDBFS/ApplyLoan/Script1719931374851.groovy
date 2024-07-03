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

WebUI.navigateToUrl('https://www.hdbfs.com/')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Object Repository/Web/HDBFS/Page_About HDBFS HDB Financial Services Ind_ac9fb4/a_Products'))

WebUI.click(findTestObject('Object Repository/Web/HDBFS/Page_About HDBFS HDB Financial Services Ind_ac9fb4/span_All Loans'))

WebUI.click(findTestObject('Object Repository/Web/HDBFS/Page_HDBFS- Banking Products  Services/div_Used Car Loan'))

WebUI.clearText(findTestObject('Object Repository/Web/HDBFS/Page_Auto Loan OnlineCar Loan for Used Cars_6f4e4c/input_Loan Amount_loanamount'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_Auto Loan OnlineCar Loan for Used Cars_6f4e4c/input_Loan Amount_loanamount'), 
    '2000000')

WebUI.clearText(findTestObject('Object Repository/Web/HDBFS/Page_Auto Loan OnlineCar Loan for Used Cars_6f4e4c/input_Loan Tenure_loanterm'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_Auto Loan OnlineCar Loan for Used Cars_6f4e4c/input_Loan Tenure_loanterm'), 
    '36')

WebUI.click(findTestObject('Object Repository/Web/HDBFS/Page_Auto Loan OnlineCar Loan for Used Cars_6f4e4c/button_Apply'))

String alpha3 = CustomKeywords.'utils.Strings.randomStringOf'(3, 4)

String alpha1 = CustomKeywords.'utils.Strings.randomStringOf'(1, 'CPHFATBLJG')

String char1 = CustomKeywords.'utils.Strings.randomStringOf'(1, 4)

String alpha5 = alpha3 + alpha1 + char1

String dig4 = CustomKeywords.'utils.Strings.randomStringOf'(4, 1)

char1 = CustomKeywords.'utils.Strings.randomStringOf'(1, 4)

String pan = alpha5 + dig4 + char1

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_PAN NUMBER_pan'), pan)

WebUI.click(findTestObject('Web/HDBFS/Page_HDB Financial Services/label_I have read and agree with all the  T_d2374d'))

WebUI.click(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_Terms  Conditions_submit'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/img'), 0)

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_Mobile_mobile_number'), '8765435364')

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_Father Name_father_name'), 'Ravi')

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_Email Id_email'), 'tagri@gmail.com')

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/textarea_Residence Address_current_add'), 
    '1st Street, Yellow Mountain, Blue City, India')

WebUI.setText(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_Pincode_pincode'), '643004')

WebUI.click(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_Pincode_button1'))

WebUI.click(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/input_seconds_button1'))

WebUI.verifyElementText(findTestObject('Object Repository/Web/HDBFS/Page_HDB Financial Services/label_Please enter the correct OTP'), 
    'PLEASE ENTER THE CORRECT OTP!')

WebUI.closeBrowser()

