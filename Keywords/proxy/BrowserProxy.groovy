package proxy

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.Proxy
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import io.netty.handler.codec.http.HttpHeaders
import io.netty.handler.codec.http.HttpRequest
import io.netty.handler.codec.http.HttpResponse
import net.lightbody.bmp.BrowserMobProxy
import net.lightbody.bmp.BrowserMobProxyServer
import net.lightbody.bmp.client.ClientUtil
import net.lightbody.bmp.filters.RequestFilter
import net.lightbody.bmp.proxy.CaptureType
import net.lightbody.bmp.util.HttpMessageContents
import net.lightbody.bmp.util.HttpMessageInfo



public class BrowserProxy {

	BrowserMobProxy server = new BrowserMobProxyServer();

	@Keyword
	def String setProxy(int port) {
		server.setTrustAllServers(true)
		server.enableHarCaptureTypes(CaptureType.REQUEST_HEADERS)
		Map<String, String>headers = server.getAllHeaders()
		for(String header:headers) {
			println(header+":"+headers.get(header))
		}
		server.addRequestFilter(new RequestFilter() {
			@Override
			public HttpResponse filterRequest(HttpRequest req, HttpMessageContents cont, HttpMessageInfo info) {
				println("I am in request processing")
				req.headers().add("my-custom-header", "lkjsfdhne")
				return null
			}
		})
		server.start(port)
		//		Proxy seleniumProxy = ClientUtil.createSeleniumProxy(server);
		//
		//		Proxy proxy = new Proxy()
		//		proxy.setHttpProxy(Inet4Address.getLocalHost().getHostAddress() + ":" + server.getPort())
		//		proxy.setSslProxy(Inet4Address.getLocalHost().getHostAddress() + ":" + server.getPort())
		//
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Downloads\\chromedriver.exe")
		//
		//		ChromeOptions co = new ChromeOptions()
		//		co.setProxy(seleniumProxy)
		//
		//		WebDriver wd = new ChromeDriver(co)
		//		DriverFactory.changeWebDriver(wd)
		//		wd.get("https://www.w3schools.com/")

		return server.getPort()
	}

	@Keyword
	def stopProxy() {
		server.stop()
	}
}
