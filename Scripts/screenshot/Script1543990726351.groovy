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
import groovy.json.JsonSlurper as JsonSlurper


def response = WS.sendRequest(findTestObject('Object Repository/Country'))

def list = new JsonSlurper().parseText(response.getResponseText())

'list.each{println it}'
ArrayList<String> countries = new ArrayList<String>()

def names = list.name

names.each({
		countries.add(it)
	})

countries.each({
		println(it)
	})

WebUI.openBrowser('')

Random rand = new Random()

int i = 0

String country = ''

while (i++ < 5) {
	int randomIdx = rand.nextInt(countries.size())

	country = countries.get(randomIdx)

	WebUI.navigateToUrl('https://www.google.com/maps/@12.952476,77.647874,15z')

	WebUI.setText(findTestObject('Object Repository/sh1/Page_Google Maps/input_India_q'), country)

	WebUI.click(findTestObject('Object Repository/sh1/Page_Google Maps/button_India_searchbox-searchb'))

	WebUI.click(findTestObject('Object Repository/sh1/Page_India - Google Maps/button_Directions'))

	WebUI.waitForPageLoad(50)

WebUI.takeScreenshot('C:/Users/ssengupta064/Desktop/ss/' + country + '.png')

WebUI.click(findTestObject('Object Repository/sh1/Page_Google Maps/button_See travel times traffi'))


/*WebUI.navigateToUrl('https://www.wikipedia.org/')

WebUI.setText(findTestObject('Page_Wikipedia/input_Search Wikipedia_search'), country +  ' population')

WebUI.click(findTestObject('Page_Wikipedia/button_Search'))

if(WebUI.getText(findTestObject('Page_Demographics of India - Wikipe/td_1324171354 (2016 est.)1')) != null){
text = WebUI.getText(findTestObject('Page_Demographics of India - Wikipe/td_1324171354 (2016 est.)1'))
}
else
{
	text = 'no population'

}

WebUI.navigateToUrl('http://www.worldometers.info/')

WebUI.click(findTestObject('Page_Worldometers - real time world/a_Population'))

WebUI.click(findTestObject('Page_Population - Worldometers/strong_Population by Country'))

//WebUI.click(findTestObject('Page_Population by Country (2018) -/td_' + country))
if(findTestObject(('.//*[normalize-space(text()) and normalize-space(.)=' + country + ' ])[1]/following::td[12]')) != null){

WebUI.click(findTestObject(('.//*[normalize-space(text()) and normalize-space(.)=' + country + ' ])[1]/following::td[12]')))

text = WebUI.getText(findTestObject('Page_Population by Country (2018) -/td_1354051854'))
}
else
{
	text = 'no population'

}


WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.setText(findTestObject('Object Repository/Page_Google/input_Sign in_q'), country + ' population')

WebUI.waitForElementPresent(findTestObject('Page_Google/input_Remove_btnK'), 30)

WebUI.doubleClick(findTestObject('Object Repository/Page_Google/input_Remove_btnK'))

WebUI.waitForPageLoad(30)

text = WebUI.getText(findTestObject('Object Repository/Page_India population - Google Sear/div_133.92 crores (2017)'))
*/

}
