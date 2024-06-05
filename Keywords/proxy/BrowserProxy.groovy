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
import net.lightbody.bmp.filters.ResponseFilter
import net.lightbody.bmp.proxy.CaptureType
import net.lightbody.bmp.util.HttpMessageContents
import net.lightbody.bmp.util.HttpMessageInfo

import org.littleshoot.proxy.impl.DefaultHttpProxyServer
import org.littleshoot.proxy.HttpFiltersSourceAdapter
import org.littleshoot.proxy.HttpFiltersAdapter;
import io.netty.handler.codec.http.HttpObject;


public class BrowserProxy {

	@Keyword
	def String setHeadersViaProxy(int port, Map<String,String> requestHeaders, Map<String,String> responseHeaders) {
		BrowserMobProxy server = new BrowserMobProxyServer();
		server.setTrustAllServers(true)
		server.enableHarCaptureTypes(CaptureType.REQUEST_HEADERS)
		Map<String, String>headers = server.getAllHeaders()
		for(String header:headers) {
			println(header+":"+headers.get(header))
		}
		if (requestHeaders != null && !requestHeaders.isEmpty()) {
			server.addRequestFilter(new RequestFilter() {
						@Override
						public HttpResponse filterRequest(HttpRequest req, HttpMessageContents cont, HttpMessageInfo info) {
							requestHeaders.each{key,value -> req.headers().add(key, value)}
							return null
						}
					})
		}
		server.addResponseFilter(new ResponseFilter() {
					@Override
					public void filterResponse(HttpResponse res, HttpMessageContents cont, HttpMessageInfo info) {
						responseHeaders.each{key,value -> res.headers().add(key, value)}
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
	def startProxy() {
		DefaultHttpProxyServer.bootstrap()
				.withAddress(new InetSocketAddress("127.0.0.1", 8080))
				.withFiltersSource(new HttpFiltersSourceAdapter() {
					@Override
					public HttpFiltersAdapter filterRequest(HttpRequest originalRequest) {
						return new HttpFiltersAdapter(originalRequest) {
									@Override
									public HttpResponse clientToProxyRequest(HttpObject httpObject) {
										println("Added custom header to request: 1");
										// Intercept and modify client to proxy requests here
										if (httpObject instanceof HttpRequest) {
											println("Added custom header to request: 2");
											HttpRequest request = (HttpRequest) httpObject;
											// Add custom headers
											HttpHeaders headers = request.headers();
											headers.add("X-Added-Header", "HeaderValue");
											println("Added custom header to request: "+ request.uri());
										}
										return null;  // Return null to continue processing
									}

									@Override
									public HttpObject serverToProxyResponse(HttpObject httpObject) {
										// Intercept and modify server to proxy responses here
										if (httpObject instanceof HttpResponse) {
											HttpResponse response = (HttpResponse) httpObject;
											println("Intercepted response with status: " + response.status());
										}
										return httpObject;  // Return the httpObject to continue processing
									}
								};
					}
				})
				.start();

		Proxy proxy = new Proxy()
		proxy.setHttpProxy("127.0.0.1:8080")
		proxy.setSslProxy("127.0.0.1:8080")

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Downloads\\chromedriver.exe")

		ChromeOptions co = new ChromeOptions()
		co.setProxy(proxy)

		WebDriver wd = new ChromeDriver(co)
		DriverFactory.changeWebDriver(wd)
		wd.get("https://www.w3schools.com/")
	}
}
