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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.microsoftonline.com/6f504113-6b64-43f2-ade9-242e05780007/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fag-ea-lp-qa-master.crm4.dynamics.com%2f&wctx=pr%3dwsfederation%26rm%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252f%26ru%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252fmain.aspx%26ry%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252fmain.aspx%26crmorgid%3d88659c8f-8241-423b-8b35-3f84ebc647bd%26nonce%3dCRMWSFed.nonce.636633536879916239.ZmM4NmEyZDMtYzRkMy00MWEzLThjZWYtZDYwN2RhYTBkZWU3YWFlYjI2NmItZDUxYy00NzhhLTljMGEtNzNkMmFlOTg0MzM2&wct=2018-05-31T08%3a54%3a47Z&wreply=https%3a%2f%2fcloudredirector.crm4.dynamics.com%3a443%2fG%2fAuthRedirect%2fIndex.aspx%3fRedirectTo%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252fmain.aspx')

WebUI.setText(findTestObject('FrontEnd/Page_Sign in to your account/input_loginfmt'), 'wastetest1@defradev.onmicrosoft.com')

WebUI.sendKeys(findTestObject('FrontEnd/Page_Sign in to your account/input_loginfmt'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('FrontEnd/Page_Sign in to your account/input_passwd'), 'W@stePermits1')

WebUI.click(findTestObject('FrontEnd/Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('FrontEnd/Page_Sign in to your account/input_idBtn_Back'))

WebUI.click(findTestObject('FrontEnd/Page_Applications Active Applicatio/span_navImageFlipHorizontal'))

WebUI.click(findTestObject('FrontEnd/Page_Applications Active Applicatio/label_Search Dynamics 365 data'))

WebUI.setText(findTestObject('FrontEnd/Page_Applications Active Applicatio/input_search'), 'WE0003QA/A001')

WebUI.click(findTestObject('FrontEnd/Page_Applications Active Applicatio/img_findCriteriaImg'))

WebUI.click(findTestObject('FrontEnd/Page_Microsoft Dynamics 365/span_WE0003QAA001'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kirona-def-2.kirona.com/jmtest/jclient/jclient.html')

WebUI.click(findTestObject('eggs/Page_JClient/div_Configure App'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), 'jon.hatfield')

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-PasswordTextBox GKH2'), 'Fr@nc1sJ0n')

WebUI.click(findTestObject('eggs/Page_JClient/div_Sign In'))

WebUI.click(findTestObject('eggs/Page_JClient/div'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Job TypeEMI InspectionJob'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Job TypeEMI InspectionJob _1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_ARRIVED'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Job TypeEMI InspectionJob _2'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_2'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Inspection Site DetailsCou'))

WebUI.click(findTestObject('eggs/Page_JClient/input_radio_group_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '-1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kirona-def-2.kirona.com/jmtest/jclient/jclient.html')

WebUI.click(findTestObject('eggs/Page_JClient/div_Configure App'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), 'jon.hatfield')

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-PasswordTextBox GKH2'), 'Fr@nc1sJ0n')

WebUI.click(findTestObject('eggs/Page_JClient/div_Sign In'))

WebUI.click(findTestObject('eggs/Page_JClient/div'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Job TypeEMI InspectionJob'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Job TypeEMI InspectionJob _1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_ARRIVED'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Job TypeEMI InspectionJob _2'))

WebUI.click(findTestObject('eggs/Page_JClient/div_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_2'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Inspection Site DetailsCou'))

WebUI.click(findTestObject('eggs/Page_JClient/input_radio_group_1'))

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '-1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Organic'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Free Range'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Barn'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.click(findTestObject('eggs/Page_JClient/div_Cage Enriched'))

WebUI.setText(findTestObject('eggs/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '1')

WebUI.closeBrowser()

