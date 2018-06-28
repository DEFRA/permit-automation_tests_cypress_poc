import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://kirona-def-2.kirona.com/jmtest/jclient/jclient.html')

WebUI.click(findTestObject('eggs/Page_JClient (1)/div_Configure App'))

WebUI.setText(findTestObject('eggs/Page_JClient (1)/input_gwt-TextBox GKH2EKQBOHC (1)'), 'jon.hatfield')

WebUI.setText(findTestObject('eggs/Page_JClient (1)/input_gwt-PasswordTextBox GKH2'), 'Fr@nc1sJ0n')

WebUI.click(findTestObject('eggs/Page_JClient (1)/div_Sign In'))

WebUI.delay(60)

'refresh button'
WebUI.verifyElementVisible(findTestObject('limited eggs/Page_JClient/div_GKH2EKQBKRB'))

WebUI.click(findTestObject('limited eggs/Page_JClient/div_GKH2EKQBKRB'))

WebUI.delay(40)

WebUI.click(findTestObject('limited eggs/Page_JClient/div_EMI Inspection'))

WebUI.delay(20)

WebUI.click(findTestObject('limited eggs/Page_JClient/div_Edit attributes'))

WebUI.delay(20)

WebUI.click(findTestObject('limited eggs/Page_JClient/span_Yes'))

WebUI.delay(20)

WebUI.closeBrowser()

