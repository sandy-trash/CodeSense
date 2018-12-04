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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/qa/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/qa/Page_CURA Healthcare Service/a_Home'))

WebUI.click(findTestObject('Object Repository/qa/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/qa/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/qa/Page_CURA Healthcare Service/input_Username_username'), 'abcd')

WebUI.setEncryptedText(findTestObject('Object Repository/qa/Page_CURA Healthcare Service/input_Password_password'), 'IQ9brkwNm6U=')

WebUI.click(findTestObject('Object Repository/qa/Page_CURA Healthcare Service/button_Login'))

