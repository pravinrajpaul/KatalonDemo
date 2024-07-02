import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.logging.KeywordLogger
import groovy.xml.MarkupBuilder



//class StepLevelHTMLReportListener {
//	
//	@BeforeTestCase
//	def beforeTestCase(TestCaseContext testCaseContext) {
//		String testCaseId = testCaseContext.getTestCaseId()
//		println "Before : " + testCaseId
//	}
//	
//	@AfterTestCase
//	def afterTestCase(TestCaseContext testCaseContext) {
//		String testCaseId = testCaseContext.getTestCaseId()
//		println "After : " + testCaseId
//	}
//	
//}




//	private static final KeywordLogger logger = KeywordLogger.getInstance(StepLevelHTMLReportListener.class)
//	private StringBuilder htmlContent = new StringBuilder()
//	private String reportFile = "Reports/StepLevelCustomReport.html"
//	private Map<String, Object> testCaseVariables = [:]
//	private static List<Map<String, String>> stepDetails = []
//
//	@BeforeTestSuite
//	def beforeTestSuite(TestSuiteContext testSuiteContext) {
//		htmlContent.append("<html><head><title>Test Suite Report</title></head><body>")
//		htmlContent.append("<h1>Test Suite: ${testSuiteContext.getTestSuiteId()}</h1>")
//		htmlContent.append("<table border='1'><tr><th>Test Case</th><th>Step Description</th><th>Status</th><th>Message</th></tr>")
//	}
//
//	@AfterTestSuite
//	def afterTestSuite(TestSuiteContext testSuiteContext) {
//		htmlContent.append("</table></body></html>")
//		saveReport(htmlContent.toString())
//	}
//
//	@BeforeTestCase
//	def beforeTestCase(TestCaseContext testCaseContext) {
//		testCaseVariables = testCaseContext.getTestCaseVariables()
//		stepDetails.clear()  // Clear previous step details
//	}
//
//	@AfterTestCase
//	def afterTestCase(TestCaseContext testCaseContext) {
//		String testCaseId = testCaseContext.getTestCaseId()
//		stepDetails.each { step ->
//			htmlContent.append("<tr>")
//			htmlContent.append("<td>${testCaseId}</td>")
//			htmlContent.append("<td>${step.description}</td>")
//			htmlContent.append("<td>${step.status}</td>")
//			htmlContent.append("<td>${step.message}</td>")
//			htmlContent.append("</tr>")
//		}
//	}
//
//	private void saveReport(String content) {
//		File file = new File(reportFile)
//		file.getParentFile().mkdirs()
//		file.write(content)
//		//logger.logPassed("HTML report saved to: ${reportFile}")
//	}
//	
//	public static void logStepDetail(String description, String status, String message) {
//		stepDetails << [description: description, status: status, message: message]
//	}
//}