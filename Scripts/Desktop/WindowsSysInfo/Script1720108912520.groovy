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

not_run: CustomKeywords.'custom.MyKeyWords.startDefaultWinAppDriver'()

Windows.startApplicationWithTitle('C:\\Windows\\System32\\msinfo32.exe', 'System Information')

Windows.doubleClick(findWindowsObject('Object Repository/Desktop/MSInfo/TreeItem(1)'))

Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/TreeItem(4)'))

//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(3)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(4)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(5)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(6)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(7)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(8)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(9)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(10)'))
//
//Windows.click(findWindowsObject('Object Repository/Desktop/MSInfo/Text(11)'))

row = 1

col = 1

text = Windows.getText(findWindowsObject('Desktop/MSInfo/ListViewItem', [('row') : row, ('column') : col]))

println(text)

row = 2

col = 2

text = Windows.getText(findWindowsObject('Desktop/MSInfo/ListViewItem', [('row') : row, ('column') : col]))

println(text)


Point pos = Windows.getElementPosition(findWindowsObject('Object Repository/Desktop/MSInfo/Window'))

rect = Windows.getAttribute(findWindowsObject('Desktop/MSInfo/Window'), 'BoundingRectangle')

rectco = rect.split(' ')

left = ((rectco[0]).split(':')[1]).toInteger()

top = ((rectco[1]).split(':')[1]).toInteger()

winwidth = ((rectco[2]).split(':')[1]).toInteger()

winheight = ((rectco[3]).split(':')[1]).toInteger()

right = (winwidth + left)

bottom = (winheight + top)

resizePercent = 30

rwinwidth = ((winwidth * resizePercent) / 100).toInteger()

rwinheight = ((winheight * resizePercent) / 100).toInteger()

rright = (rwinwidth + left)

rbottom = (rwinheight + top)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(right - 5, bottom - 5)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Down')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(rright, rbottom)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Up')

Windows.delay(3)

rectTitleBar = Windows.getAttribute(findWindowsObject('Desktop/MSInfo/TitleBar'), 'BoundingRectangle')

recttb = rectTitleBar.split(' ')

tbwidth = (((recttb[2]).split(':')[1]).toInteger() / 2).toInteger()

tbheight = (((recttb[3]).split(':')[1]).toInteger() / 2).toInteger()

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(left + tbwidth, top + tbheight)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Down')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(0 + tbwidth, 0 + tbheight)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Up')

Windows.delay(5)

Windows.closeApplication()
