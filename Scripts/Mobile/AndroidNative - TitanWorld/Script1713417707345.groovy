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

Mobile.startExistingApplication('com.titancompany.tx37consumerapp')

not_run: Mobile.setText(findTestObject('Object Repository/Mobile/AndroidNative - TitanWorld/android.widget.EditText - Enter Mobile Number'), 
    '8754450054', 0)

not_run: Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - TitanWorld/android.widget.Button - REQUEST OTP'), 
    0)

not_run: Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - TitanWorld/android.widget.Button - VERIFY OTP'), 
    0)

Mobile.scrollToText('Titan Men\'s Timeless')

Mobile.tap(findTestObject('Web/TitanWorld/Page_Titan The Official Website for Titan W_a22814/android.widget.TextView - Titan Mens Timeless Style Watch Refined Black Dial and Metal Strap'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - TitanWorld/android.widget.TextView - ADD TO CART'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - TitanWorld/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - TitanWorld/android.widget.TextView - PROCEED TO CHECKOUT'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile/AndroidNative - TitanWorld/android.widget.TextView - Please add your delivery address to proceed to checkout'), 
    'Please add your delivery address to proceed to checkout')

Mobile.closeApplication()

