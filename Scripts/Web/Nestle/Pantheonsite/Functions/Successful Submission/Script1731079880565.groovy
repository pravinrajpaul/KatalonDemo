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

WebUI.verifyElementText(findTestObject('Object Repository/Web/Pantheonsite/Page_Membership Thank you  SSB/p_Corned beef tri-tip bresaola chicken done_37e35c'), 
    'Corned beef tri-tip bresaola chicken doner porchetta. Short loin pastrami tail beef ribs pork rump. Bresaola tail sirloin meatball pork pancetta brisket doner turkey venison ham. Salami boudin cow bacon pig, ground round venison kielbasa short ribs doner. Chislic buffalo tongue sirloin pork chop, kevin bresaola strip steak boudin capicola pork belly filet mignon pork picanha. Pork loin bacon salami fatback. Shoulder picanha brisket jerky prosciutto biltong shank porchetta strip steak doner chicken turducken.')

WebUI.verifyElementText(findTestObject('Object Repository/Web/Pantheonsite/Page_Membership Thank you  SSB/p_Pastrami picanha pork belly pork loin ton_da5665'), 
    'Pastrami picanha pork belly pork loin tongue brisket ball tip bacon meatloaf biltong ham hock swine pork chop beef ribs jerky. Pork belly tri-tip tenderloin ham hock. Porchetta turkey shankle t-bone drumstick buffalo. Tri-tip meatball short ribs beef tail buffalo pig frankfurter pork loin strip steak cupim picanha brisket hamburger shankle. Cupim kevin alcatra strip steak spare ribs cow biltong meatloaf hamburger doner fatback. Picanha fatback meatloaf, corned beef tail short ribs cupim pork chop swine spare ribs burgdoggen capicola pig pastrami.')

WebUI.closeBrowser()

