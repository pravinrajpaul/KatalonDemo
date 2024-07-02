import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Point as Point
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

Windows.startApplicationWithTitle('C:\\Windows\\System32\\msinfo32.exe', 'System Information')

Windows.doubleClick(findWindowsObject('Object Repository/Desktop/MSInfo/TreeItem(1)'))

Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/TreeItem(4)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(3)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(4)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(5)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(6)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(7)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(8)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(9)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(10)'))

not_run: Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(11)'))

//row = 1
//col = 1
//text = Windows.getText(findWindowsObject('Desktop/MSInfo/ListViewItem',[('row'):row,('column'):col]))
//
//println(text)
Point pos = Windows.getElementPosition(findWindowsObject('Object Repository/Desktop/MSInfo/Window'))

println(pos.x + ' ' + pos.y)

rect = Windows.getAttribute(findWindowsObject('Desktop/MSInfo/Window'), 'BoundingRectangle')

rectco = rect.split(" ")
left = rectco[0].split(":")[1].toInteger()
top = rectco[1].split(":")[1].toInteger()
width = rectco[2].split(":")[1].toInteger()
height = rectco[3].split(":")[1].toInteger()
right = width + left
bottom = height + top



not_run: Windows.clickElementOffset(findWindowsObject('Object Repository/Desktop/MSInfo/Window'), 800, 600)

not_run: Windows.clickElementOffset(findWindowsObject('Object Repository/Desktop/MSInfo/TitleBar'), 50, 50)

Windows.closeApplication()

