package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import java.awt.Graphics2D
import java.awt.Rectangle
import java.awt.Robot
import java.awt.image.BufferedImage
import java.io.File;

import javax.imageio.ImageIO

import internal.GlobalVariable
import net.sourceforge.tess4j.ITesseract
import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.Tesseract1
import net.sourceforge.tess4j.TesseractException

public class Mainframe {

	def captureScreen() {
		Robot robot = new Robot();
		
		BufferedImage screenShot = robot.createScreenCapture(new Rectangle())
		Graphics2D graphics = screenShot.createGraphics();
		
		ImageIO.save(screenShot, "png", new File("myScreenShot.png"));
	}
	
	
	@Keyword
	def verifyTextPresent(String imagePath) {
		File imageFile = new File(imagePath);
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:\\Users\\pravi\\Downloads\\tessdata")
		try {
			String result = instance.doOCR(imageFile);
			println result;
			return ""
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
			return "Error on screen, try again";
		}
	}
	
	@Keyword
	def waitUntilTextPresentOnScreen(String imagePath) {
		File imageFile = new File(imagePath);
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:\\Users\\pravi\\Downloads\\tessdata")
		try {
			String result = instance.doOCR(imageFile);
			println result;
			return ""
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
			return "Error on screen, try again";
		}
	}
	
	@Keyword
	def countTextOnScreen(String imagePath) {
		File imageFile = new File(imagePath);
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:\\Users\\pravi\\Downloads\\tessdata")
		try {
			String result = instance.doOCR(imageFile);
			println result;
			return ""
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
			return "Error on screen, try again";
		}
	}
}
