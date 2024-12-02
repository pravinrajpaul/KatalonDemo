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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.Rectangle as Rectangle

CustomKeywords.'custom.MyKeyWords.startDefaultWinAppDriver'()

//Windows.switchToDesktop(FailureHandling.STOP_ON_FAILURE)
Windows.startApplicationWithTitle('C:\\Users\\pravi\\AppData\\Local\\Microsoft\\WindowsApps\\mspaint.exe', 'Untitled - Paint')

Windows.click(findWindowsObject('Object Repository/Desktop/MSPaint/Image(3)'))

canvasPos = Windows.getElementPosition(findWindowsObject('Desktop/MSPaint/Group(1)'))

Rectangle canvasSize = Windows.getElementRect(findWindowsObject('Desktop/MSPaint/Group(1)'))

canvasCenterX = (canvasPos.x + (canvasSize.width / 2)).toInteger()

canvasCenterY = (canvasPos.y + (canvasSize.height / 2)).toInteger()

drawFactor = 50

drawStartX = (canvasCenterX - drawFactor)

drawStartY = (canvasCenterY - drawFactor)

drawEndX = (canvasCenterX + drawFactor)

drawEndY = (canvasCenterY + drawFactor)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawStartX, drawStartY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Down')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawEndX, drawEndY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Up')

Windows.delay(2)

Windows.click(findWindowsObject('Object Repository/Desktop/MSPaint/Image(4)'))

drawFactor = 30

drawStartX = (canvasCenterX - drawFactor)

drawStartY = (canvasCenterY - drawFactor)

drawEndX = (canvasCenterX + drawFactor)

drawEndY = (canvasCenterY + drawFactor)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawStartX, drawStartY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Down')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawEndX, drawEndY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Up')

Windows.delay(2)

Windows.click(findWindowsObject('Object Repository/Desktop/MSPaint/Image(5)'))

drawFactor = 60

drawStartX = canvasCenterX

drawStartY = (canvasCenterY - drawFactor)

drawEndX = canvasCenterX

drawEndY = (canvasCenterY + drawFactor)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawStartX, drawStartY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Down')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawEndX, drawEndY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Up')

Windows.delay(2)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.typeText'('s')

drawFactor = 70

drawStartX = (canvasCenterX - drawFactor)

drawStartY = (canvasCenterY - drawFactor)

drawEndX = (canvasCenterX + drawFactor)

drawEndY = (canvasCenterY + drawFactor)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawStartX, drawStartY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Down')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(drawEndX, drawEndY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Button Up')

Windows.delay(2)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.pressHoldSpecialKey'('CTRL')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.typeText'('x')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.releaseHeldKey'('CTRL')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.pressHoldSpecialKey'('CTRL')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.typeText'('v')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.releaseHeldKey'('CTRL')

Windows.delay(2)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseMove'(canvasCenterX, canvasCenterY)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.mouseClick'('Left Click')

Windows.delay(2)

randomSuffix = CustomKeywords.'utils.Strings.randomStringOf'(4, 4)

saveName = ('Image' + randomSuffix)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.pressHoldSpecialKey'('CTRL')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.typeText'('s')

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.releaseHeldKey'('CTRL')

Windows.delay(2)

CustomKeywords.'com.katalon.plugin.keyword.actions.RobotActions.typeText'(saveName)

Windows.click(findWindowsObject('Object Repository/Desktop/MSPaint/Button'))

diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline.png', ('C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + 
    saveName) + '.png')

if (diffPercentage <= 0.15) {
    KeywordUtil.markPassed('Images Match')
} else {
    KeywordUtil.markFailed('Images don\'t match')
}

diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline3.png', ('C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + 
    saveName) + '.png')

if (diffPercentage <= 0.15) {
    KeywordUtil.markPassed('Images Match')
} else {
    KeywordUtil.markFailed('Images don\'t match')
}

//diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline1.png', 'C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + saveName + ".png")
//println (diffPercentage)
//diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline2.png', 'C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + saveName + ".png")
//println (diffPercentage)
//diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline3.png', 'C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + saveName + ".png")
//println (diffPercentage)
//diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline4.png', 'C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + saveName + ".png")
//println (diffPercentage)
//diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline5.png', 'C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + saveName + ".png")
//println (diffPercentage)
//diffPercentage = CustomKeywords.'image.Actions.compareImages'('Resources/Desktop/MSPaint/Images/Baseline6.png', 'C:\\Users\\pravi\\Downloads\\AutomationScreens\\' + saveName + ".png")
//println (diffPercentage)
Windows.closeApplication()

