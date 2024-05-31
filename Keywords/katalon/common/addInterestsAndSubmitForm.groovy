package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addInterestsAndSubmitForm {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button 'Add a new interest'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_addNewInterest'))
        WebUI.takeScreenshot()
        "Step 2: Click on span"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_private'))
        WebUI.takeScreenshot()
        "Step 3: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_selectorMovie'))
        WebUI.takeScreenshot()
        "Step 4: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_selectorAnime'))
        WebUI.takeScreenshot()
        "Step 5: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_selectorOutdoorEvent'))
        WebUI.takeScreenshot()
        "Step 6: Click on span"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_selectorOfflineOnly'))
        WebUI.takeScreenshot()
        "Step 7: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_peopleWithSimilarInterests'))
        WebUI.takeScreenshot()
        "Step 8: Click on button 'Add a new interest'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_addNewInterest'))
        WebUI.takeScreenshot()
        "Step 9: Click on span"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_whatIsEventifyWhoDevelops'))
        WebUI.takeScreenshot()
        "Step 10: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_bannerMax3Mbupload'))
        WebUI.takeScreenshot()
        "Step 11: Click on span"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_whatIsEventifyWhoDevelops'))
        WebUI.takeScreenshot()
        "Step 12: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_uploadEventBanner'))
        WebUI.takeScreenshot()
        "Step 13: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/input_file'))
        WebUI.takeScreenshot()
        "Step 14: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/input_addAname'))
        WebUI.takeScreenshot()
        "Step 15: Click on form"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/p_location'))
        WebUI.takeScreenshot()
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

