package com.katalon.testcloud

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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;
import io.appium.java_client.AppiumDriver;
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword;
import internal.GlobalVariable;
import org.openqa.selenium.html5.Location

public class GeolocationExecutor {
	/**
	 * Set GPS geolocation for the mobile device.
	 *
	 * @param latitude the latitude of the location
	 * @param longitude the longitude of the location
	 * @param altitude the altitude of the location
	 */
	@Keyword
	void setMobileGeoLocation(double latitude, double longitude, double altitude) {
		AppiumDriver ad = MobileDriverFactory.getDriver()
		ad.setLocation(new Location(latitude, longitude, altitude))
	}
}
