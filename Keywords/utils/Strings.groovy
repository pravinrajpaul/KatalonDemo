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

import internal.GlobalVariable

public class Strings {

	/**
	 * 
	 * @param length : Length of the random string
	 * @param type :
	 * 				0 - for only alphabets (Small and Capital mixed)
	 * 				1 - for only digit strings
	 * 				2 - for both alphabets (small and capital) and digits
	 * 				3 - for only small alphabets
	 * 				4 - for only capital alphabets
	 * 				5 - for both small alphabets and digits
	 * 				6 - for both capital alphabets and digits 	 
	 * @return
	 */
	@Keyword
	def java.lang.String randomStringOf(int length, int type = 0) {
		java.lang.String characters = ""
		switch(type) {
			case 0 :
				characters = ('ABCDEFGHIJKLMNOPQRSTUVWXYZ')+('abcdefghijklmnopqrstuvwxyz')
				break
			case 1 :
				characters = ('0123456789')
				break
			case 2 :
				characters = ('ABCDEFGHIJKLMNOPQRSTUVWXYZ')+('abcdefghijklmnopqrstuvwxyz')+('0123456789')
				break
			case 3 :
				characters = ('abcdefghijklmnopqrstuvwxyz')
				break
			case 4 :
				characters = ('ABCDEFGHIJKLMNOPQRSTUVWXYZ')
				break
			case 5 :
				characters = ('abcdefghijklmnopqrstuvwxyz')+('001234567899')
				break
			case 6 :
				characters = ('ABCDEFGHIJKLMNOPQRSTUVWXYZ')+('0123456789')
				break
			default :
				characters = ('ABCDEFGHIJKLMNOPQRSTUVWXYZ')+('abcdefghijklmnopqrstuvwxyz')+('0123456789')
		}

		return new Random().with {
			(1..length).collect {characters[nextInt(characters.length())]}.join()
		}
	}

	/**
	 *
	 * @param length : Length of the random string
	 * @param type :
	 * 				0 - for only alphabets (Small and Capital mixed)
	 * 				1 - for only digit strings
	 * 				2 - for both alphabets (small and capital) and digits
	 * 				3 - for only small alphabets
	 * 				4 - for only capital alphabets
	 * 				5 - for both small alphabets and digits
	 * 				6 - for both capital alphabets and digits
	 * @return
	 */
	@Keyword
	def java.lang.String randomStringOf(int length, String characters) {
		return new Random().with {
			(1..length).collect {characters[nextInt(characters.length())]}.join()
		}
	}
}
