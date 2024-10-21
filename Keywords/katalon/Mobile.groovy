package katalon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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


import org.openqa.selenium.interactions.PointerInput


import java.time.Duration
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.TapOptions
import io.appium.java_client.touch.offset.PointOption
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Sequence


public class Mobile {

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

	@Keyword
	def tapAtPosition(int x, int y) {
		def driver = MobileDriverFactory.getDriver()
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tapSequence = new Sequence(finger, 0)
				.addAction(finger.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), x, y))
				.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(tapSequence));
	}

	@Keyword
	def tapAndHoldAtPosition(int x, int y, int seconds) {
		def driver = MobileDriverFactory.getDriver()
		Duration holdDuration = Duration.ofSeconds(seconds);
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence holdSequence = new Sequence(finger, 0)
				.addAction(finger.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), x, y))
				.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger, holdDuration))
				.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

		driver.perform(Collections.singletonList(holdSequence));
	}

	@Keyword
	def performSwipe(int startX, int startY, int endX, int endY) {
		def driver = MobileDriverFactory.getDriver()
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipeSequence = new Sequence(finger, 0)
				.addAction(finger.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), startX, startY)) // Move to start point
				.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())) // Finger down
				.addAction(finger.createPointerMove(Duration.ofMillis(500),
				PointerInput.Origin.viewport(), endX, endY)) // Move to end point (Swipe)
				.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); // Finger up

		driver.perform(Collections.singletonList(swipeSequence));
	}

	@Keyword
	def performSwipeNTimes(int startX, int startY, int endX, int endY, int timestoSwipe) {
		def driver = MobileDriverFactory.getDriver()
		timestoSwipe.times { i ->
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
			Sequence swipeSequence = new Sequence(finger, 0)
					.addAction(finger.createPointerMove(Duration.ofMillis(0),
					PointerInput.Origin.viewport(), startX, startY)) // Move to start point
					.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
					.addAction(finger.createPointerMove(Duration.ofMillis(500),
					PointerInput.Origin.viewport(), endX, endY))
					.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			driver.perform(Collections.singletonList(swipeSequence));
		}
	}

	@Keyword
	def getAttribute(TestObject mo, String attribute) {
		AppiumDriver driver = MobileDriverFactory.getDriver()

		MobileElement mobileElement = (MobileElement) driver.findElement(By.xpath(mo.getSelectorCollection().get('XPATH')))

		String contentDesc = mobileElement.getAttribute(attribute)
	}
}