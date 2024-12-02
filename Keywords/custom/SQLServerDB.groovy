package custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.sql.DriverManager

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

public class SQLServerDB {

	/*I want write a custom Katalon Keyword to connect with SQL Server DB and fetch records from a table using JDBC*/
// This custom keyword connects to a SQL Server database using JDBC and fetches records from a table
@Keyword
def fetchRecordsFromSQLServer(String url, String username, String password, String query) {
    // Load the SQL Server JDBC driver
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
    
    // Establish a connection to the database
    def connection = DriverManager.getConnection(url, username, password)
    
    // Create a statement object to execute the query
    def statement = connection.createStatement()
    
    // Execute the query to fetch records from the table
    def resultSet = statement.executeQuery(query)
    
    // Iterate through the result set and print the records
    while (resultSet.next()) {
        println(resultSet.getString(1)) // Assuming the first column is a string type, change the index as per your table structure
    }
    
    // Close the result set, statement, and connection
    resultSet.close()
    statement.close()
    connection.close()
}

}
