import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SampleClass {
	
	
	@Keyword
	def login() {
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/verifyLoginButton'), GlobalVariable.defaultWaitTime, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/verifyLoginButton'))
			WebUI.sendKeys(findTestObject('Object Repository/usernameInput'), GlobalVariable.username)
			WebUI.sendKeys(findTestObject('Object Repository/passwordInput'), GlobalVariable.password)
			WebUI.click(findTestObject('Object Repository/signInButton'))
		}	
	}
	
	@Keyword
	def verifyHomePage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/verifyHomePage'), GlobalVariable.defaultWaitTime, FailureHandling.OPTIONAL)
	}
	
	@Keyword
	def clickDownloadButton() {
		WebUI.click(findTestObject('Object Repository/downloadButton'))
	}
	
	@Keyword
	def verifyDownloadOptions() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/katalonStudioDownloadButton'), GlobalVariable.defaultWaitTime, FailureHandling.OPTIONAL)
		WebUI.verifyElementPresent(findTestObject('Object Repository/katalonRunTimeEngineDownloadButton'), GlobalVariable.defaultWaitTime, FailureHandling.OPTIONAL)
		WebUI.click(findTestObject('Object Repository/closeDownloadPopup'))
	}
	
	@Keyword
	def logout() {
		WebUI.click(findTestObject('Object Repository/profileButton'))
		WebUI.click(findTestObject('Object Repository/signOutButton'))
	}
	
	
}
