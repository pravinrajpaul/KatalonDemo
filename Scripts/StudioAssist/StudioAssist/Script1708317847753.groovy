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
/*
Navigate to the login page at https://opensource-demo.orangehrmlive.com/web/index.php/auth/login	The login page is displayed
Enter valid username 'Admin' and valid password 'admin123'	Username and password are entered in their respective fields
Click on the 'Login' button	User is redirected to the dashboard page
*/
// Navigate to the login page
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// Enter valid username 'Admin'
WebUI.setText(findTestObject('Web/OrangeHR/Page_OrangeHRM/input_username'), 'Admin')

// Enter valid password 'admin123'
WebUI.setText(findTestObject('Web/OrangeHR/Page_OrangeHRM/input_password'), 'admin123')

// Click on the 'Login' button
WebUI.click(findTestObject('Web/OrangeHR/Page_OrangeHRM/button_Login'))

