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

WebUI.setText(findTestObject('GiveItTry/Page_Job Manager Login/input_gwt-uid-3'), 'jon.hatfield')

WebUI.setText(findTestObject('GiveItTry/Page_Job Manager Login/input_gwt-uid-5'), 'Fr@nc1sJ0n')

WebUI.click(findTestObject('GiveItTry/Page_Job Manager Login/div_Login'))

WebUI.waitForElementVisible(findTestObject('GiveItTry/Page_JM Control Centre/div_Create'), 0)

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/div_Create'))

WebUI.setText(findTestObject('GiveItTry/Page_JM Control Centre/input_gwt-uid-8'), 'emi')

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/td_EMI Inspection'))

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/div_Job DetailTypeInspectionDu'))

WebUI.setText(findTestObject('GiveItTry/Page_JM Control Centre/input_gwt-uid-66'), 'jon')

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/span_Jonathan Brown'))

WebUI.click(findTestObject('GiveItTry/Page_JM Control Centre/span_Cancel'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kirona-def-2.kirona.com/jmtest/jclient/jclient.html')

WebUI.click(findTestObject('egg/Page_JClient/div_Configure App'))

WebUI.setText(findTestObject('egg/Page_JClient/input_gwt-TextBox GKH2EKQBOHC'), 'jon.hatfield')

WebUI.setText(findTestObject('egg/Page_JClient/input_gwt-PasswordTextBox GKH2'), 'Fr@nc1sJ0n')

WebUI.click(findTestObject('egg/Page_JClient/div_Sign In'))

WebUI.click(findTestObject('egg/Page_JClient/div'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI Inspection - P'))

WebUI.click(findTestObject('egg/Page_JClient/div_EMI Inspection - Paired'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI Inspection - P_1'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI Inspection - P'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div_Checking for Job updates'))

WebUI.click(findTestObject('egg/Page_JClient/div_2 Days'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div'))

WebUI.click(findTestObject('egg/Page_JClient/div_STARTED on Tue at 1045'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job Summary'))

WebUI.click(findTestObject('egg/Page_JClient/div_No SLA'))

WebUI.doubleClick(findTestObject('egg/Page_JClient/div_35576'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI Inspection - P_2'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI Inspection - P_3'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('egg/Page_JClient/div_Arrived'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI Inspection - P_4'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_Started'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI Inspection - P_5'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div_Day'))

WebUI.click(findTestObject('egg/Page_JClient/div_1'))

WebUI.click(findTestObject('egg/Page_JClient/div'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI InspectionJob'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI InspectionJob _1'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_ARRIVED (1)'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI InspectionJob _2'))

WebUI.click(findTestObject('egg/Page_JClient/div_35577'))

WebUI.click(findTestObject('egg/Page_JClient/div_STARTED (1)'))

WebUI.click(findTestObject('egg/Page_JClient/div_Job TypeEMI InspectionJob _3'))

WebUI.click(findTestObject('egg/Page_JClient/div_Edit attributes'))

WebUI.click(findTestObject('egg/Page_JClient/input_radio_group_14'))

WebUI.click(findTestObject('egg/Page_JClient/input_radio_group_14_1'))

WebUI.click(findTestObject('egg/Page_JClient/input_radio_group_14'))

WebUI.setText(findTestObject('egg/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.closeBrowser()

