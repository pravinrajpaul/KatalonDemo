package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait

import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;


import internal.GlobalVariable

public class CDP {


	@Keyword
	def runAppJavaScript(String url) throws IOException {
		// Set the path to your ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", RunConfiguration.getProjectDir()+"\\Resources\\BrowserDrivers\\chromedriver126.exe");

		// Set up ChromeOptions to enable remote debugging
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-debugging-port=9222");

		// Start ChromeDriver
		ChromeDriver driver = new ChromeDriver(options);

		// Get the DevTools URL
		String devToolsUrl = getDevToolsUrl(driver);

		// Example: Run a CDP command to get the browser version
		JsonObject command = new JsonObject();
		command.addProperty("id", 1);
		command.addProperty("method", "Runtime.evaluate");
		JsonObject params = new JsonObject();
		params.addProperty("expression", "console.log(\"Hello from pravin\")"); //const shadowDOM = document.querySelector('flt-glass-pane').shadowRoot; const hiddenButton = shadowDOM.querySelector('[aria-label=\"Enable accessibility\"]'); hiddenButton.click();");
		params.addProperty("awaitPromise", true);
		params.addProperty("returnByValue", true);
		command.add("params", params);
		println command
		driver.get(url)
		new WebDriverWait(driver, 600).until({  WebDriver webDriver ->
			((JavascriptExecutor) webDriver).executeScript("return document.readyState") == 'complete'
		});
		sendDevToolsCommand(devToolsUrl, command.toString());

		DriverFactory.changeWebDriver(driver)
	}

	def String getDevToolsUrl(ChromeDriver driver) {
		String baseUrl = "http://localhost:9222/json";
		try {
			URL url = new URL(baseUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");

			if (connection.getResponseCode() == 200) {
				String response = new String(connection.getInputStream().readAllBytes());
				String webSocketDebuggerUrl = response.split("webSocketDebuggerUrl\": \"")[1].split("\"")[0];
				return webSocketDebuggerUrl.replace("/devtools/page/", "/json/");
			} else {
				throw new RuntimeException("Failed to get DevTools URL");
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to get DevTools URL", e);
		}
	}

	//	def void connectToDevToolsAndRunScript(WebDriver driver) {
	//		try {
	//			// Get WebSocket Debug URL
	//			String webSocketUrl = getWebSocketDebuggerUrl();
	//
	//			// Connect to DevTools
	//			WebSocketClient client = setupWebSocketClient(new URI(webSocketUrl));
	//			client.connectBlocking();
	//
	//			// Send a console command with arguments
	//			sendConsoleCommand(client, "console.log('Result:', function test(a, b) { return a + b; }(5, 3));");
	//
	//			// Wait to ensure the message appears in the console
	//			Thread.sleep(5000);
	//
	//			// Close the WebSocket connection
	//			client.close();
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		} finally {
	//			driver.quit();
	//		}
	//	}


	def void sendDevToolsCommand(String devToolsUrl, String command) {
		try {
			URL url = new URL(devToolsUrl);
			println devToolsUrl
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			OutputStream os = connection.getOutputStream()
			byte[] input = command.getBytes("utf-8");
			os.write(input, 0, input.length);
			def respCode = connection.getResponseCode()
			println respCode
			if (respCode >= 200 && respCode<300) {
				String response = new String(connection.getInputStream().readAllBytes());
				System.out.println("Response: " + response);
			} else {
				throw new RuntimeException("Failed to send DevTools command");
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to send DevTools command", e);
		}
	}
}
