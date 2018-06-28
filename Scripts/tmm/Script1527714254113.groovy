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

WebUI.navigateToUrl('https://login.microsoftonline.com/6f504113-6b64-43f2-ade9-242e05780007/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fag-ea-lp-qa-master.crm4.dynamics.com%2f&wctx=pr%3dwsfederation%26rm%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252f%26ru%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252fmain.aspx%26ry%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252fmain.aspx%26crmorgid%3d88659c8f-8241-423b-8b35-3f84ebc647bd%26nonce%3dCRMWSFed.nonce.636633109726279298.NGQ1NjY1MWEtNGE0OS00OWUxLWIxZTMtYWUxMjQ1MmI5N2FlNDhlMzZkOGMtYWE5NS00YTg3LThiZWUtZjY2YzAyNGE2N2Jh&wct=2018-05-30T21%3a02%3a52Z&wreply=https%3a%2f%2fcloudredirector.crm4.dynamics.com%3a443%2fG%2fAuthRedirect%2fIndex.aspx%3fRedirectTo%3dhttps%253a%252f%252fag-ea-lp-qa-master.crm4.dynamics.com%252fmain.aspx')

WebUI.setText(findTestObject('tmm/Page_Sign in to your account/input_loginfmt'), 'wastetest1@defradev.onmicrosoft.com')

WebUI.click(findTestObject('tmm/Page_Sign in to your account/input_idSIButton9'))

WebUI.setText(findTestObject('tmm/Page_Sign in to your account/input_passwd'), 'W@stePermits1')

WebUI.click(findTestObject('tmm/Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('tmm/Page_Sign in to your account/input_idBtn_Back'))

WebUI.click(findTestObject('tmm/Page_Applications Active Applicatio/span_navImageFlipHorizontal'))

WebUI.setText(findTestObject('tmm/Page_Applications Active Applicatio/input_search'), 'AB0100CD')

WebUI.click(findTestObject('tmm/Page_Applications Active Applicatio/img_findCriteriaImg'))

WebUI.click(findTestObject('tmm/Page_Microsoft Dynamics 365/span_AB0100CD'))

WebUI.closeBrowser()

