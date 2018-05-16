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

WebUI.navigateToUrl('URL')

WebUI.setText(findTestObject('GiveItTry/Page_Job Manager Login/input_gwt-uid-3'), 'SOMETHING')

WebUI.setText(findTestObject('GiveItTry/Page_Job Manager Login/input_gwt-uid-5'), 'SOMETHING')

WebUI.waitForElementClickable(findTestObject('GiveItTry/Page_Job Manager Login/div_Login'), 0)

WebUI.click(findTestObject('GiveItTry/Page_Job Manager Login/div_Login'))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('GiveItTry/Page_JM Control Centre/div_Create'), 0)

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/div_Create'))

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/div_v-filterselect-button'))

WebUI.setText(findTestObject('GiveItTry/Page_JM Control Centre/input_gwt-uid-8'), 'emi')

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/span_EMI Inspection'))

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/div_Scheduling WindowFollow SL'))

WebUI.waitForElementVisible(findTestObject('GiveItTry/Page_JM Control Centre/div_v-filterselect-button_1'), 0)

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/div_v-filterselect-button_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('GiveItTry/Page_JM Control Centre/input_gwt-uid-66'), 'jon Smith')

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/span_Cancel'))

WebUI.closeBrowser()

