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

Windows.startApplicationWithTitle('D:\\PortableSoft\\Autoit\\Aut2Exe\\Aut2exe_x64.exe', 'Aut2Exe - v3.3.16.1 (AutoIt Script to EXE Converter)')

Windows.setText(findWindowsObject('Object Repository/Desktop/WPF App/Edit'), 'D:\\PortableSoft\\Autoit\\Aut2Exe')

Windows.click(findWindowsObject('Object Repository/Desktop/WPF App/RadioButton'))

Windows.setText(findWindowsObject('Desktop/WPF App/Edit(1)'), 'D:\\PortableSoft\\Autoit\\Aut2Exe\\out')

Windows.click(findWindowsObject('Object Repository/Desktop/WPF App/Button'))

Windows.switchToWindowTitle(errorText)

text = Windows.getText(findWindowsObject('Object Repository/Desktop/WPF App/Text'), FailureHandling.STOP_ON_FAILURE)

println(text)

assert text == text

Windows.click(findWindowsObject('Desktop/WPF App/Button(1)'))

isDisabled = Windows.getAttribute(findWindowsObject('Desktop/WPF App/Button(1)'), 'IsDisabled')

assert isDisabled

Windows.switchToWindowTitle('Aut2Exe - ')

Windows.closeApplication()

