package katalon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import java.awt.Robot
import java.awt.event.InputEvent
import java.awt.Point
import java.awt.MouseInfo
import java.util.concurrent.ThreadLocalRandom


public class Web {

	/**
	 * Get WebElement from TestObject
	 * @param testObject The TestObject
	 * @return WebElement The WebElement corresponding to the TestObject
	 */
	@Keyword
	def WebElement getWebElementFromTestObject(TestObject testObject) {

		WebDriver driver = DriverFactory.getWebDriver()
		SelectorMethod method = testObject.getSelectorMethod()
		String locator = testObject.getSelectorCollection().get(method)

		switch (method) {
			case SelectorMethod.BASIC:
				return driver.findElement(By.xpath(locator))
			case SelectorMethod.XPATH:
				WebElement we = null
				try {
					we = driver.findElement(By.xpath(locator))
				}
				catch(Exception e) {
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we);
				}
				return we

			case SelectorMethod.CSS:
				return driver.findElement(By.cssSelector(locator))
			default:
				throw new IllegalArgumentException("Unsupported selector method: " + method)
		}
	}

	void moveMouseHumanLikeDistorted(int startX, int startY, int endX, int endY, int durationMillis) {
		Robot robot = new Robot()
		int steps = 100
		double stepX = (endX - startX) / (double) steps
		double stepY = (endY - startY) / (double) steps

		double amplitude = ThreadLocalRandom.current().nextDouble(10, 50)
		double frequency = ThreadLocalRandom.current().nextDouble(0.1, 0.3)

		double currentX = startX
		double currentY = startY

		for (int i = 0; i <= steps; i++) {
			double distortion = Math.sin(i * frequency) * amplitude
			currentX += stepX
			currentY += stepY + distortion

			double randomOffsetX = ThreadLocalRandom.current().nextDouble(-2, 2)
			double randomOffsetY = ThreadLocalRandom.current().nextDouble(-2, 2)

			robot.mouseMove((int) (currentX + randomOffsetX), (int) (currentY + randomOffsetY))
			Thread.sleep(10) // Adjust the speed of movement here
		}
	}
	
	@Keyword
	def void uploadOnWindowsOpenWindow(String uploadExePath, String filePath, String  fileName, String fileType) {
		def command = uploadExePath + " " + filePath + " " + fileName + " " + fileType
		def process = command.execute()
		process.waitFor()
	}

	// Function to move the mouse to the reCAPTCHA checkbox using WebDriver and then simulate a distorted move and click
	@Keyword
	def void moveToCaptchaAndClick(TestObject checkbox, TestObject iframe) {
		// Step 1: Switch to the iframe containing the reCAPTCHA checkbox
		WebUI.switchToFrame(iframe, 10)

		// Step 2: Find the checkbox WebElement
		WebElement checkboxElement = WebUI.findWebElement(checkbox)

		// Step 3: Get the WebDriver instance
		WebDriver driver = DriverFactory.getWebDriver()

		// Step 4: Use WebDriver Actions to move the mouse over the checkbox element
		Actions actions = new Actions(driver)
		actions.moveToElement(checkboxElement).perform()

		// Step 5: Capture the current mouse pointer position using Robot (after WebDriver has moved it)
		Robot robot = new Robot()
		Point currentMousePosition = MouseInfo.getPointerInfo().getLocation()
		int currentX = currentMousePosition.x
		int currentY = currentMousePosition.y

		println currentX
		println currentY

		/**    
		 // Get the coordinates of the checkbox (relative to the screen)
		 int checkboxX = checkboxElement.getLocation().getX()
		 int checkboxY = checkboxElement.getLocation().getY()
		 int checkboxWidth = checkboxElement.getSize().getWidth()
		 int checkboxHeight = checkboxElement.getSize().getHeight()
		 // Calculate a random point inside the checkbox boundaries
		 int randomXWithinCheckbox = checkboxX + ThreadLocalRandom.current().nextInt(0, checkboxWidth)
		 int randomYWithinCheckbox = checkboxY + ThreadLocalRandom.current().nextInt(0, checkboxHeight)
		 // Step 6: Simulate human-like distorted mouse movement to the random point inside the checkbox
		 moveMouseHumanLikeDistorted(currentX, currentY, randomXWithinCheckbox, randomYWithinCheckbox, 1000)
		 // Step 7: Click on the checkbox using Robot
		 robot.mouseMove(randomXWithinCheckbox, randomYWithinCheckbox)
		 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
		 Thread.sleep(100)  // Hold the click for a short time
		 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
		 println('Checkbox clicked successfully!')
		 **/    
		// Switch back to the default content after clicking
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def void moveToElement(TestObject element) {
		WebElement webElement = WebUI.findWebElement(element)

		// Step 2: Get the location and size of the element
		int elementX = webElement.getLocation().getX()
		int elementY = webElement.getLocation().getY()
		int elementWidth = webElement.getSize().getWidth()
		int elementHeight = webElement.getSize().getHeight()

		// Step 3: Calculate the center of the element
		int centerX = elementX + (elementWidth / 2)
		int centerY = elementY + (elementHeight / 2)

		// Step 4: Get the browser window's position
		int[] browserPosition = getBrowserWindowPosition()
		int browserX = browserPosition[0]
		int browserY = browserPosition[1]

		// Step 5: Calculate the absolute position of the checkbox
		int absoluteX = browserX + centerX
		int absoluteY = browserY + centerY

		// Step 6: Use Robot to move the mouse to the calculated position
		moveMouseTo(absoluteX, absoluteY)
	}

	void moveMouseTo(int x, int y) {
		Robot robot = new Robot()
		robot.mouseMove(x, y)
	}

	// Function to get the browser's window position
	@Keyword
	def int[] getBrowserWindowPosition() {
		// Execute JavaScript to get the position of the browser window
		String script = "return [window.screenX, window.screenY];"
		JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverFactory.getWebDriver()
		Object[] position = (Object[]) jsExecutor.executeScript(script)

		return [
			(int) position[0],
			(int) position[1]
		]
	}

	@Keyword
	int[] getElementPosition(TestObject element) {
		// Step 1: Find the WebElement
		WebElement webElement = WebUI.findWebElement(element)

		// Step 2: Get the location and size of the element
		int elementX = webElement.getLocation().getX()
		int elementY = webElement.getLocation().getY()
		int elementWidth = webElement.getSize().getWidth()
		int elementHeight = webElement.getSize().getHeight()

		return [
			elementX,
			elementY,
			elementWidth,
			elementHeight
		]
	}

	// Function to move the mouse to an element and click
	void moveToElementAndClick(TestObject element) {

		int[] elPos = getElementPosition(element)
		// Step 3: Calculate the center of the element
		int centerX = elPos[0] + (elPos[2] / 2)
		int centerY = elPos[1] + (elPos[3] / 2)

		// Step 4: Get the browser window's position
		int[] browserPosition = getBrowserWindowPosition()
		int browserX = browserPosition[0]
		int browserY = browserPosition[1]

		// Step 5: Calculate the absolute position of the checkbox
		int absoluteX = browserX + centerX
		int absoluteY = browserY + centerY

		// Step 6: Use Robot to move the mouse to the calculated position
		moveMouseTo(absoluteX, absoluteY)

		// Step 7: Click on the element using Robot
		Robot robot = new Robot()
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
		Thread.sleep(100)  // Hold the click for a short time
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)

		println('Element clicked successfully!')
	}
}
