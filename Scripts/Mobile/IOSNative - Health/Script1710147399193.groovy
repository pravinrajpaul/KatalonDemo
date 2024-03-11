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

Mobile.startExistingApplication('com.apple.Health')

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeStaticText - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeStaticText - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeTextField - DOB'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypePickerWheel - Month'), 'June')

Mobile.sendKeys(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypePickerWheel - Date'), '12')

Mobile.sendKeys(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypePickerWheel - Year'), '1990')

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeButton - Done'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeTextField - Optional (1)'), 'Pravin')

Mobile.sendKeys(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeTextField - Optional (2)'), 'R')

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeTextField - Optional'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypePickerWheel - Not Set'), 'Male')

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeTextField - Optional (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeTextField - Optional (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeStaticText - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeSwitch - UIA.Health.FeatureEnablement.Trend.Switch'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile/IOSNative - Health/XCUIElementTypeStaticText - Continue (1)'), 0)

Mobile.closeApplication()

