import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Random rand = new Random()

otp = rand.nextInt(100001, 999999).toString()

currentTime =  (Long) System.currentTimeMillis()/1000

ResponseObject smsSendResponse = WS.sendRequest(findTestObject('API/TelerivetOTP/SendMessage', [('otp') : otp, ('number') : number]))

JsonSlurper json = new JsonSlurper()

parsedResponse = json.parseText(smsSendResponse.getResponseText())

sendResponseMessage = (parsedResponse.message[0])

if (sendResponseMessage.equals('SMS sent successfully.')) {
    KeywordUtil.markPassed('SMS sent successfully')
} else {
    KeywordUtil.markFailedAndStop('SMS send failed')
}

WebUI.delay(30)

//currentTime = 1715710560
//otp = "122633"
//JsonSlurper json = new JsonSlurper()

println(currentTime)

ResponseObject smsGetMessages = WS.sendRequest(findTestObject('API/TelerivetOTP/GetMessages', [('starttime') : currentTime
            , ('endtime') : currentTime + 30]))

parsedResponse = json.parseText(smsGetMessages.getResponseText())

getMessage = parsedResponse.data[0].content

recOtp = ''

if ((getMessage == null) || (getMessage == '')) {
    println('message null')
} else {
    recOtp = (getMessage.split('OTP: ')[1])
}

if (recOtp.equals(otp)) {
    KeywordUtil.markPassed('OTP matched')
} else {
    KeywordUtil.markFailed('OTP did not match; Expected:'+otp+'; Actual:'+recOtp)
}

