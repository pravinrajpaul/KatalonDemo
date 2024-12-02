package katalon

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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MobileCall {

	@Keyword
	def makeCall(String toMobileNo) {
		def process = ("adb shell am start -a android.intent.action.CALL -d tel:" + toMobileNo).execute()
		process.waitFor()
	}

	@Keyword
	def acceptCall(int waitSecs) {
		def callAccepted = false
		if (waitSecs == 0) waitSecs = 30
		while (!callAccepted && waitSecs >= 0) {
			println ((!callAccepted).toString() + " "+ waitSecs)
			Thread.sleep(1000)
			--waitSecs
			if (isIncomingCall()) callAccepted = true
		}
		if (!callAccepted) KeywordUtil.markError("Call not received and accept operation timedout")
	}

	@Keyword
	def airPlaneMode(boolean mode) {
		def command = ""
		mode ? command = "adb shell settings put global airplane_mode_on 1" : "adb shell settings put global airplane_mode_on 0"

		def process = "adb shell dumpsys telephony.registry | grep 'mCallState'".execute()
		process.waitFor()
	}

	def isIncomingCall() {
		def process = "adb shell dumpsys telephony.registry | grep 'mCallState'".execute()
		process.waitFor()

		if (process.text.contains("mCallState=1")) {
			def exeAccept = "adb shell input keyevent KEYCODE_CALL".execute()
			process.waitFor()
			return true
		}
		return false
	}
}
