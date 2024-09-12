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

/**
 Test Steps for Web
 
 Open browser
 Maximize browser window
 Navigate to google.com
 Type "today's news" in the search box
 Click the search button
 Navigate to the first result
 */
// Open browser
WebUI.openBrowser('')

// Maximize browser window
WebUI.maximizeWindow()

// Navigate to google.com
WebUI.navigateToUrl('https://www.google.com')

// Type "today's news" in the search box
WebUI.setText(findTestObject('Button'), 'today\'s news')

// Click the search button
WebUI.click(findTestObject('Demo/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

// Navigate to the first result
WebUI.click(findTestObject('first_search_result'))

