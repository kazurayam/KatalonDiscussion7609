import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// https://www.regular-expressions.info/unicode.html

WebUI.openBrowser('')
WebUI.setViewPortSize(703, 347)
WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/7609_testbed.html')

WebUI.verifyElementPresent(findTestObject('Page_Discussion 7609/td_Latin_alphabet - text equals'),
	20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Discussion 7609/td_Latin_alphabet - text matches'),
	3, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Page_Discussion 7609/td_Latin_alphabet - xpath equals'),
//	3, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Page_Discussion 7609/td_Latin_alphabet - xpath matches'),
//	20, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Page_Discussion 7609/td_Cyrillic_alphabet - equals'),
//	3, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Page_Discussion 7609/td_Cyrillic_alphabet - matches'),
//	3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

