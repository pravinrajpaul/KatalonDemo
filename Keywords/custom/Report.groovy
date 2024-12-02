package custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.Dimension
import java.awt.GraphicsEnvironment
import java.awt.Insets
import java.awt.Rectangle
import java.awt.Robot
import java.awt.Toolkit
import java.awt.image.BufferedImage

import javax.imageio.ImageIO

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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Report {
	
	@Keyword
	def takeScreenShot() {
		def screenName = (new Random()).nextLong(1000000000).toString()
		def screenPath = RunConfiguration.getReportFolder() + "/" + screenName + ".png"
		
		try {
			// Get the full screen size
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
			// Get the insets (taskbar, dock, etc.)
			Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(
					GraphicsEnvironment.getLocalGraphicsEnvironment()
					.getDefaultScreenDevice()
					.getDefaultConfiguration());
	
			// Calculate the usable area excluding the taskbar
			int usableHeight = screenSize.height - screenInsets.bottom;
			int usableWidth = screenSize.width - screenInsets.right;
	
			// Define the capture area (excluding the taskbar height)
			Rectangle captureRect = new Rectangle(0, 0, usableWidth, usableHeight);
	
			// Capture the screen
			Robot robot = new Robot();
			BufferedImage screenCapture = robot.createScreenCapture(captureRect);
	
			// Save the screenshot to a file
			File outputfile = new File(screenPath);
			outputfile.mkdirs()
			ImageIO.write(screenCapture, "png", outputfile);
			return screenPath
		} catch (Exception e) {
			KeywordUtil.markFailed("Error getting screen")
		}
	} 
}
