import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/search?source=hp&ei=8NUIXI2kMtCr5wK3kaJw&q=population')

WebUI.clearText(findTestObject('Page_a - Google Search/input_Sign in_q'))

WebUI.setText(findTestObject('Object Repository/Page_a - Google Search/input_Sign in_q'), 'Hawaii population')

WebUI.click(findTestObject('Object Repository/Page_a - Google Search/button_Sign in_Tg7LZd'))

try
{
text = WebUI.getText(findTestObject('Page_India population - Google Sear/div_133.92 crores (2017)'))
System.out.println(text)
}
catch(Exception e)
{
	System.out.println("Population is not defined for country")
}

WebUI.closeBrowser()

