package katalon.truetest

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import internal.GlobalVariable
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

public class TrueTestScripts {
    public static void login() {
        try {
            WebUI.setText(findTestObject('Object Repository/Page_KMS Home SSO - LOGIN/input_GOOD MORNING_Username'), 'hoangchu')
            WebUI.setEncryptedText(findTestObject('Object Repository/Page_KMS Home SSO - LOGIN/input_GOOD MORNING_Password'), 'kXTA48FBbRcXzlAhD0zB8Q==')
            WebUI.click(findTestObject('Object Repository/Page_KMS Home SSO - LOGIN/span_LOGIN HOME SSO'))
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
    
    public static void navigate(String path) {
        String applicationDomain = GlobalVariable.application_domain;
        String queryParameters = GlobalVariable.query_params;
        if (path == null) {
            path = "";
        }
        if (!path.startsWith("/")) {
            path = "/$path";
        }
        String url = "$applicationDomain$path";
        if (queryParameters.length() > 0) {
            url = "$url?$queryParameters";
        }
        WebUI.navigateToUrl(url);
    }
}

