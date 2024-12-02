package web

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.edge.EdgeOptions
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class ApplicationFunction {



	@Keyword(keywordObject='WEB')
	def static enhanced_SetViewportSize(int width, int height) {
		WebDriver webDriver = DriverFactory.getWebDriver()
		int browserWidthGap = webDriver.manage().window().getSize().width - Integer.parseInt(WebUI.executeJavaScript('return (window.innerWidth || 0)', null).toString())
		int browserHeightGap = webDriver.manage().window().getSize().height - Integer.parseInt(WebUI.executeJavaScript('return (window.innerHeight || 0)', null).toString())
		float ratio = Float.parseFloat(WebUI.executeJavaScript('return (window.devicePixelRatio || 1)', null).toString())
		int actualWidth = Math.round((width + browserWidthGap * ratio) / ratio)
		int actualHeight = Math.round((height + browserHeightGap * ratio) / ratio)
		WebUI.setViewPortSize(actualWidth, actualHeight)
	}

	@Keyword(keywordObject='WEB')
	def moveToElementClick(TestObject to) {
		WebDriver wd = DriverFactory.getWebDriver()
		WebElement we = WebUiCommonHelper.findWebElement(to, 30)
		Actions act = new Actions(wd);
		act.moveToElement(we).click().build().perform()
	}

	@Keyword(
	keywordObject='WEB'
	)
	def advancedClick(TestObject to) {
		WebDriver wd = DriverFactory.getWebDriver()
		JavascriptExecutor js = (JavascriptExecutor) wd
		Map<SelectorMethod,String> map = to.getSelectorCollection()
		String locator = map.get(SelectorMethod.XPATH)
		WebElement we = wd.findElement(By.xpath(locator))
		js.executeScript("arguments[0].click();", we)
	}

	@Keyword(
	keywordObject='WEB'
	)
	def executeJavaScript(String script) {
		WebDriver wd = DriverFactory.getWebDriver()
		JavascriptExecutor js = (JavascriptExecutor) wd
		js.executeScript(script)
	}

	def Map<String, List<String>> getAllSelectors(TestObject to) {
		// Map to store the selection methods and their corresponding selectors
		Map<String, List<String>> selectorsMap = new HashMap<>()

		// Iterate through each selection method (e.g., XPath, CSS)
		for (SelectorMethod method : to.getSelectorMethods()) {
			List<TestObjectProperty> properties = to.getSelectorProperties(method)
			List<String> selectors = properties.collect { it.getValue() }
			selectorsMap.put(method.getMethodName(), selectors)
		}

		return selectorsMap
	}

	@Keyword
	def openCustomEdgeBrowser(String edgeDriverPath, String browserPath) {


		EdgeOptions options = new EdgeOptions()
		options.setCapability("binary", browserPath)

		System.setProperty("webdriver.edge.driver", edgeDriverPath)
		WebDriver wd = new EdgeDriver(options)
		DriverFactory.changeWebDriver(wd)
	}

	@Keyword
	def scrollToElement(TestObject testObject) {
		try {
			WebElement element = WebUiCommonHelper.findWebElement(testObject, 30)
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
			js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element)
			WebUI.delay(1) // optional delay to ensure scrolling is complete
		} catch (Exception e) {
			WebUI.comment("Error scrolling to element: " + e.getMessage())
		}
	}
}
