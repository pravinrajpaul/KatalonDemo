package db

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

import static com.mongodb.client.model.Filters.eq

import java.sql.Connection
import java.sql.DriverManager

import org.bson.Document
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase

import internal.GlobalVariable

public class Functions {

	@Keyword
	def connectPostgresDB(String host, String port, String database, String schema, String username, String password) {
		def uri = "jdbc:postgresql://${host}:${port}/${database}?currentSchema=${schema}"
		Class.forName("org.postgresql.Driver")
		def connection = null
		try {
			connection = DriverManager.getConnection(uri, username, password)
		}
		catch (Exception e) {
			println("Exception occured : " + e.getMessage())
		}
		finally {
			if (connection != null) return connection
		}
	}
	
	
}
