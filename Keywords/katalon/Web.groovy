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
}
