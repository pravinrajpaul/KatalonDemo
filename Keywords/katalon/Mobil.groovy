package katalon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent

public class Mobil {

	@Keyword
	def androidTypeKeyboardDigits(String text) {
		AndroidDriver driver = MobileDriverFactory.getDriver()
		for (char c : text.toCharArray()) {
			AndroidKey key = getKeyEventForDigit(c)
			driver.pressKey(new KeyEvent(key));
		}
	}

	def AndroidKey getKeyEventForDigit(char digit) {
		switch (digit) {
			case '0': return AndroidKey.DIGIT_0;
			case '1': return AndroidKey.DIGIT_1;
			case '2': return AndroidKey.DIGIT_2;
			case '3': return AndroidKey.DIGIT_3;
			case '4': return AndroidKey.DIGIT_4;
			case '5': return AndroidKey.DIGIT_5;
			case '6': return AndroidKey.DIGIT_6;
			case '7': return AndroidKey.DIGIT_7;
			case '8': return AndroidKey.DIGIT_8;
			case '9': return AndroidKey.DIGIT_9;
			default: return null;
		}
	}
}
