package custom

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

import internal.GlobalVariable

public class MyKeyWords {

	@Keyword
	def process() {
		def command = [
			"cmd",
			"/c",
			"python",
			"C:\\Users\\pravi/AppData/Local/Temp/Compare.py",
			"C:\\Users\\pravi\\Desktop\\records-header.csv",
			"C:\\Users\\pravi\\Desktop\\records-header-somemismatch.csv",
			"--status-folder="+"\"D:/Development/Katalon Studio/KatalonDemo/Reports/Status\"",
			"--composite-keys=''"
		]
		println command
		ProcessBuilder pb = new ProcessBuilder(command).redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT)
		Process p = pb.start()
		int i = p.waitFor()
		if (i==0) println "pass"+i
		else println "fail"+i
	}
}
