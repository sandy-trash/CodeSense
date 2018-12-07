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

WebUI.navigateToUrl('https://www.wikipedia.org/')

WebUI.setText(findTestObject('Page_Wikipedia/input_Search Wikipedia_search'), 'France')

WebUI.click(findTestObject('Page_Wikipedia/button_Search'))

WebUI.scrollToElement(findTestObject('Page_India - Wikipedia/th_Population'), 30)

try
{
text = WebUI.getText(findTestObject('Object Repository/Page_India - Wikipedia/td_132417135412 (2nd)'))
System.out.println(text)
}
catch(Exception e)
{
		System.out.println("Population is not defined for country")
}
WebUI.closeBrowser()

