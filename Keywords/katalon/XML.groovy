package katalon

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.parsers.ParserConfigurationException

import org.xml.sax.SAXException

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
import groovy.xml.XmlParser
import groovy.xml.XmlUtil

public class XML {




	@Keyword
	String getXmlNodeValue(String xmlFilePath, String xmlPath) {
		def xmlFile = new File(xmlFilePath)

		if (!xmlFile.exists()) {
			throw new FileNotFoundException("XML file not found: " + xmlFilePath)
		}

		def parser = new XmlParser().parse(xmlFile)

		def pathElements = xmlPath.split("/")

		def currentNode = parser
		pathElements.each { pathElement ->
			currentNode = currentNode[pathElement][0]
			if (!currentNode) {
				throw new IllegalArgumentException("Invalid XML path: " + xmlPath)
			}
		}

		return currentNode.text()
	}

	@Keyword
	void setXmlNodeValue(String xmlFilePath, String xmlPath, String newValue) {
		def xmlFile = new File(xmlFilePath)

		if (!xmlFile.exists()) {
			throw new FileNotFoundException("XML file not found: " + xmlFilePath)
		}

		def parser = new XmlParser().parse(xmlFile)

		def pathElements = xmlPath.split("/")

		def currentNode = parser
		pathElements.each { pathElement ->
			currentNode = currentNode[pathElement][0]
			if (!currentNode) {
				throw new IllegalArgumentException("Invalid XML path: " + xmlPath)
			}
		}

		currentNode.value = newValue

		def updatedXml = XmlUtil.serialize(parser)
		xmlFile.write(updatedXml)
	}
}
