import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.annotation.SetUp as SetUp
import com.kms.katalon.core.annotation.TearDown as TearDown
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import java.util.Formatter.DateTime as DateTime

for(def row =2; row <= findTestData('Invalid_Credentials').getRowNumbers(); row ++ ) {
WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.ormuco.com/login')

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 2))

not_run: WebUI.waitForElementClickable(findTestObject('invalid_test_case/Page_Portal - Ormuco/input__password'), 60)

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 2))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.click(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'), 
    120)

WebUI.verifyElementVisible(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 3))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 3))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementVisible(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'), 
    120)

WebUI.click(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'), 
    120)

WebUI.verifyElementVisible(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 4))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 4))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.click(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'), 
    120)

WebUI.verifyElementVisible(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 5))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 5))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.click(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'), 
    120)

WebUI.verifyElementVisible(findTestObject('invalid_test_case/Page_Portal - Ormuco/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 6))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 6))

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.waitForElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.verifyElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 7))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 7))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.waitForElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.verifyElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 8))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 8))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.waitForElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.verifyElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 9))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 9))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.waitForElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.verifyElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 10))

WebUI.setText(findTestObject('invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 10))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.waitForElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.verifyElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 11))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 11))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.waitForElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.verifyElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__username'), findTestData('Invalid_Credentials').getValue(
        1, 12))

WebUI.setText(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/input__password'), findTestData('Invalid_Credentials').getValue(
        2, 12))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.waitForElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.click(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.verifyElementPresent(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'), 120)

WebUI.verifyElementVisible(findTestObject('Spyweb1/Page_Portal - Ormuco/span_The user or password is i'))

WebUI.click(findTestObject('Object Repository/invalid_test_case/Page_Portal - Ormuco/label__d-block p_relative f_ic'))

WebUI.verifyElementPresent(findTestObject('invalid_test_case/Page_Portal - Ormuco/label__d-block p_relative f_ic'), 120)

WebUI.closeBrowser()
}
