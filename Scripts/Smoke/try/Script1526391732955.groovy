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

WebUI.navigateToUrl('https://kirona-def-6.kirona.com/jmprep/login?postLoginUrl=%2Fjmprep%2Fui&postLoginQuery=%23%21fwc#!loginView')

WebUI.setText(findTestObject('tryanother/New Folder/input_gwt-uid-3'), 'jon.hatfield')

WebUI.setText(findTestObject('tryanother/New Folder/input_gwt-uid-5'), 'Fr@nc1sJ0n')

WebUI.waitForElementClickable(findTestObject('tryanother/New Folder/div_Login'), 0)

WebUI.click(findTestObject('tryanother/New Folder/div_Login'))

WebUI.waitForElementVisible(findTestObject('tryanother/New Folder/div_Create'), 0)

WebUI.click(findTestObject('tryanother/New Folder/div_Create'))

WebUI.click(findTestObject('tryanother/New Folder/div_v-filterselect-button'))

WebUI.setText(findTestObject('tryanother/New Folder/input_gwt-uid-8'), 'emi')

WebUI.click(findTestObject('tryanother/New Folder/span_EMI Inspection'))

WebUI.setText(findTestObject('tryanother/New Folder/input_gwt-uid-26'), 'm')

WebUI.click(findTestObject('tryanother/New Folder/div_v-filterselect-button_1'))

WebUI.setText(findTestObject('tryanother/New Folder/input_gwt-uid-26'), 'east')

WebUI.click(findTestObject('tryanother/New Folder/input_gwt-uid-26'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('tryanother/New Folder/input_gwt-uid-66'), 'jon smith')

WebUI.click(findTestObject('tryanother/New Folder/input_gwt-uid-66'))

WebUI.doubleClick(findTestObject('tryanother/New Folder/input_gwt-uid-68'))

WebUI.openBrowser('')

