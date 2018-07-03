import java.util.regex.Matcher
import java.util.regex.Pattern

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// https://www.regular-expressions.info/unicode.html

WebUI.openBrowser('')
WebUI.setViewPortSize(703, 347)
WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/7609_testbed.html')

Pattern pattern = Pattern.compile(/[\p{InCyrillic}\s]+/)

TestObject testObject = new TestObject('myTestObject')
testObject.addProperty('xpath', ConditionType.EQUALS, '//td')
List<WebElement> tds = WebUiCommonHelper.findWebElements(testObject, 10)
for (WebElement td : tds) {
	String content = td.getText()
	//WebUI.comment(">>> content : ${content}")
	Matcher matcher = pattern.matcher(content)
	if (matcher.find()) {
		WebUI.comment(">>> here is cyrillic letters : ${content}")
	}
	WebUI.verifyMatch(content, '[\\w\\p{InCyrillic}\\d\\s]+', true, 
		FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.closeBrowser()
