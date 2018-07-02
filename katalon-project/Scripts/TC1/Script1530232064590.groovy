import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.setViewPortSize(703, 347)
WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/7609_testbed.html')

WebUI.verifyElementPresent(findTestObject('Page_Discussion 7520/td_Latin_alphabet'),
	20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Discussion 7520/td_Latin_alphabet'),
	5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Discussion 7520/td_Cyrillic_alphabet'),
	5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Discussion 7520/td_Cyrillic_alphabet - matches'),
	5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

