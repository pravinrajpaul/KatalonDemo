package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Charts {

	@Keyword
	def List<String> getChartPlotValues(TestObject to, List<WebElement> plotPoints) {
		WebDriver wd = DriverFactory.getWebDriver()
		wd.switchTo().defaultContent()
		WebUiCommonHelper.switchToParentFrame(to)
		Actions action = new Actions(wd)
		def plots = []
		plotPoints.each { WebElement point ->
			action.moveToElement(point).perform()
			//WebUI.delay(1)
			def plotText = getWebElement(to).getText()
			plots.add(plotText)
		}
		wd.switchTo().defaultContent()
		return plots
	}

	def List<WebElement> getWebElements(TestObject tobj) {
		WebDriver wd = DriverFactory.getWebDriver()
		WebUiCommonHelper.switchToParentFrame(tobj)
		String method = tobj.getSelectorMethod()
		String selector = tobj.getSelectorCollection().get(tobj.getSelectorMethod()) //.getXpaths()
		println selector
		List<WebElement> wes = null
		switch (method) {
			case 'CSS':
				wes = wd.findElements(By.cssSelector(selector))
				break
			case 'XPATH':
				wes = wd.findElements(By.xpath(selector))
				break
		}
		wd.switchTo().defaultContent()
		if (wes == null) KeywordUtil.markFailed("Unable get locator")
		return wes
	}
	

	def WebElement getWebElement(TestObject tobj) {
		WebDriver wd = DriverFactory.getWebDriver()
		String method = tobj.getSelectorMethod()
		String selector = tobj.getSelectorCollection().get(tobj.getSelectorMethod()) //.getXpaths()
		WebElement we = null
		switch (method) {
			case 'CSS':
				we = wd.findElement(By.cssSelector(selector))
				break
			case 'XPATH':
				we = wd.findElement(By.xpath(selector))
				break
		}
		if (we == null) KeywordUtil.markFailed("Unable get locator")
		return we
	}
}

