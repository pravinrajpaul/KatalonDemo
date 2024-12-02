package katalon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.Activity
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent


import org.openqa.selenium.interactions.PointerInput

import java.nio.file.Paths
import java.time.Duration
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.TapOptions
import io.appium.java_client.touch.offset.PointOption
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.By
import org.openqa.selenium.Dimension
import org.openqa.selenium.ElementNotInteractableException
import org.openqa.selenium.Rectangle
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Sequence


public class Mobile {



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
	def getDeviceDimensions() {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		Dimension screenSize = driver.manage().window().getSize()
		int width = screenSize.getWidth()
		int height = screenSize.getHeight()
		return [width: width, height: height]
	}

	@Keyword
	def getDeviceWidth() {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		Dimension screenSize = driver.manage().window().getSize()
		int width = screenSize.getWidth()
		return width
	}

	@Keyword
	def getDeviceHeight() {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		Dimension screenSize = driver.manage().window().getSize()
		int height = screenSize.getHeight()
		return height
	}

	@Keyword
	def getAttribute(TestObject mo, String attribute) {
		AppiumDriver driver = MobileDriverFactory.getDriver()

		MobileElement mobileElement = (MobileElement) driver.findElement(By.xpath(mo.getSelectorCollection().get('XPATH')))

		String contentDesc = mobileElement.getAttribute(attribute)
	}


	@Keyword
	def getBoundingRectangle(TestObject mobileObject, int timeout) {

		if (timeout == 0) timeout = 60

		MobileElement element = MobileElementCommonHelper.findElement(mobileObject, timeout)

		Rectangle rect = element.getRect()

		def boundingRect = [
			'x': rect.getX(),
			'y': rect.getY(),
			'width': rect.getWidth(),
			'height': rect.getHeight()
		]

		return boundingRect
	}

	@Keyword
	def MobileElement waitForElementWithRetry(TestObject mobileObject, int timeoutsec, int pollmillisec) {
		AppiumDriver md = MobileDriverFactory.getDriver()
		if (timeoutsec == 0) timeoutsec = 30
		if (pollmillisec == 0) pollmillisec = 500
		MobileElement element = null
		int elapsed = 0



		while (element == null && elapsed < timeoutsec * 1000) {

			String command = "adb shell am start -n com.samsung.android.dialer/com.samsung.android.dialer.incall.InCallActivity";
			Runtime.getRuntime().exec(command);

			try {
				// Try to find the element
				element = MobileElementCommonHelper.findElement(mobileObject, 1) // Short wait to immediately check
			} catch (NoSuchElementException | ElementNotInteractableException e) {
				// If element not found or not interactable, retry
				println("Element not found or not interactable, retrying...")
			} catch (StaleElementReferenceException e) {
				// If the element reference is stale, re-find the element and retry
				println("Stale element reference detected, re-locating the element and retrying...")
			}

			// Wait before retrying
			Thread.sleep(pollmillisec)
			elapsed += pollmillisec
			if (element != null) break
		}

		if (element == null) {
			println("Element could not be located")
		}
		println "Elapsed time:" + elapsed
		return element
	}

	@Keyword
	def Map getBoundingRectangleWithRetry(TestObject mobileObject, int timeout = 30, int pollingInterval = 500) {
		MobileElement element = null
		Rectangle rect = null
		int elapsed = 0

		// Loop until bounding rectangle is retrieved or timeout is reached
		while (elapsed < timeout * 1000) {
			try {
				// Try finding the element
				element = MobileElementCommonHelper.findElement(mobileObject, 1) // Short timeout to avoid delay

				// Check if the element is interactable
				if (element != null && element.isDisplayed() && element.isEnabled()) {
					// Get the bounding rectangle if element is interactable
					rect = element.getRect()
					break // Exit loop once rectangle is retrieved
				}
			} catch (NoSuchElementException | ElementNotInteractableException e) {
				// If element not found or not interactable, retry
				println("Element not found or not interactable, retrying...")
			} catch (StaleElementReferenceException e) {
				// If the element reference is stale, re-find the element and retry
				println("Stale element reference detected, re-locating the element and retrying...")
			}

			// Wait before retrying
			Thread.sleep(pollingInterval)
			elapsed += pollingInterval
		}

		if (rect == null) {
			throw new Exception("Failed to get the bounding rectangle within ${timeout} seconds.")
			return null
		}

		// Return bounding rectangle properties as a map
		def boundingRect = [
			'x': rect.getX(),
			'y': rect.getY(),
			'width': rect.getWidth(),
			'height': rect.getHeight()
		]

		println("Bounding Rectangle - X: ${boundingRect.x}, Y: ${boundingRect.y}, Width: ${boundingRect.width}, Height: ${boundingRect.height}")
		return boundingRect
	}

	@Keyword
	def androidTypeKeyboardDigits(String text) {
		AndroidDriver driver = MobileDriverFactory.getDriver()
		for (char c : text.toCharArray()) {
			AndroidKey key = getKeyEventForDigit(c)
			driver.pressKey(new KeyEvent(key));
		}
	}

	@Keyword
	def String getTestObjectProperty(TestObject testObject, String propertyName) {
		String projectDir = RunConfiguration.getProjectDir()

		String objectId = testObject.getObjectId()

		String rsFilePath = Paths.get(projectDir, objectId + '.rs').toString()

		println "RS File Path: $rsFilePath"

		File rsFile = new File(rsFilePath)
		if (!rsFile.exists()) {
			println "Test object not found"
			return null
		}

		// Use the XmlParser to read the XML file
		def parser = new XmlParser()
		def rootNode = parser.parse(rsFile)

		def propertyNode = rootNode.'**'.find { it.name() == 'webElementProperties' && it.'name'?.text() == propertyName }

		if (propertyNode) {
			return propertyNode.'value'?.text()
		} else {
			println "Property '$propertyName' not found"
			return null
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