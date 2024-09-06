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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplication('D:\\Development\\Flutter\\expenses\\build\\windows\\x64\\runner\\Release\\expenses.exe')

Windows.switchToWindowTitle('expenses')

index = 0

title = CustomKeywords.'flutter.Keywords.getText'(findTestObject('Mobile/Flutter/ExpensesSummaryPage/ExpenseCardTitle', 
        [('index') : index]))

println(title)

CustomKeywords.'flutter.Keywords.performTap'(findTestObject('Mobile/Flutter/ExpensesSummaryPage/AddExpenseButton'))

description = 'My Expense'

CustomKeywords.'flutter.Keywords.setText'(findTestObject('Mobile/Flutter/AddExpensePage/ExpenseDescriptionInput'), description)

CustomKeywords.'flutter.Keywords.setText'(findTestObject('Mobile/Flutter/AddExpensePage/ExpenseAmountInput'), '1.25')

CustomKeywords.'flutter.Keywords.setText'(findTestObject('Mobile/Flutter/AddExpensePage/ExpenseDateInput'), '01 Aug 2024')

CustomKeywords.'flutter.Keywords.performTap'(findTestObject('Mobile/Flutter/AddExpensePage/ExpenseCategoryDropdown'))

CustomKeywords.'flutter.Keywords.performTap'(findTestObject('Mobile/Flutter/AddExpensePage/LeisureCategoryMenuItem'))

CustomKeywords.'flutter.Keywords.performTap'(findTestObject('Mobile/Flutter/AddExpensePage/SubmitButton'))

index = 2

title = CustomKeywords.'flutter.Keywords.getText'(findTestObject('Mobile/Flutter/ExpensesSummaryPage/ExpenseCardTitle', 
        [('index') : index]))

assert title == description

Mobile.closeApplication()

