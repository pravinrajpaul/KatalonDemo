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

'2cb56193-de84-4659-8f70-3c679c90fe29'
Mobile.startApplication('Resources/Mobile/Apk/Telegram.apk', true)

Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - Telegram/android.widget.TextView - Start Messaging'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - Telegram/android.widget.ImageView'), 0)

Mobile.scrollToText('Benin')

Mobile.tap(findTestObject('Object Repository/Mobile/AndroidNative - Telegram/android.widget.TextView -  Benin'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile/AndroidNative - Telegram/android.widget.TextView - Your phone number'), 
    'Your phone number')

Mobile.takeScreenshotAsCheckpoint('Summary Page', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

