package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class uploadEventBannerAndSetEventDetails {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button 'Upload event banner'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_manageDeletion'))
        WebUI.takeScreenshot()
        "Step 2: Click on input field"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_restore'))
        WebUI.takeScreenshot()
        "Step 3: Click on input field 'title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete'))
        WebUI.takeScreenshot()
        "Step 4: Enter input value in input field 'title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_events/button_delete'), data['input_title'])
        WebUI.takeScreenshot()
        "Step 5: Click on input field 'location'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/dropdown_select0_1'))
        WebUI.takeScreenshot()
        "Step 6: Click on button 'Next'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_next'))
        WebUI.takeScreenshot()
        "Step 7: Click on input field 'numberOfParticipants'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/dropdown_select1_1'))
        WebUI.takeScreenshot()
        "Step 8: Enter input value in input field 'numberOfParticipants'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_events/dropdown_select1_1'), data['input_numberofparticipants'])
        WebUI.takeScreenshot()
        "Step 9: Click on input field 'rc select 0'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_2'))
        WebUI.takeScreenshot()
        "Step 10: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_200'))
        WebUI.takeScreenshot()
        "Step 11: Click on input field 'rc select 3'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_4'))
        WebUI.takeScreenshot()
        "Step 12: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_5'))
        WebUI.takeScreenshot()
        "Step 13: Click on input field 'rc select 4'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_6'))
        WebUI.takeScreenshot()
        "Step 14: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_7'))
        WebUI.takeScreenshot()
        "Step 15: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/dropdown_selector'))
        WebUI.takeScreenshot()
        "Step 16: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/dropdown_kmstechnology'))
        WebUI.takeScreenshot()
        "Step 17: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_9'))
        WebUI.takeScreenshot()
        "Step 18: Click on form"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_11'))
        WebUI.takeScreenshot()
        "Step 19: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/dropdown_select0_2'))
        WebUI.takeScreenshot()
        "Step 20: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_search'))
        WebUI.takeScreenshot()
        "Step 21: Enter input value in input field 'rc select 2'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_events/dropdown_select2_1'), data['input_rc_select_2'])
        WebUI.takeScreenshot()
        "Step 22: Click on p"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/p_anhNhatVanDuong'))
        WebUI.takeScreenshot()
        "Step 23: Click on form"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_11'))
        WebUI.takeScreenshot()
        "Step 24: Click on button"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_form'))
        WebUI.takeScreenshot()
        "Step 25: Click on textarea 'customFields[0].title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/textarea_addText'))
        WebUI.takeScreenshot()
        "Step 26: Enter input value in textarea 'customFields[0].title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_events/textarea_addText'), data['textarea_customfields_0_title'])
        WebUI.takeScreenshot()
        "Step 27: Click on span"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_number'))
        WebUI.takeScreenshot()
        "Step 28: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_shortText'))
        WebUI.takeScreenshot()
        "Step 29: Click on form"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_delete_11'))
        WebUI.takeScreenshot()
        "Step 30: Click on button"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addMoreCustomFields'))
        WebUI.takeScreenshot()
        "Step 31: Click on textarea 'customFields[1].title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/textarea_customFields1Title'))
        WebUI.takeScreenshot()
        "Step 32: Click on textarea 'customFields[0].title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/textarea_addText'))
        WebUI.takeScreenshot()
        "Step 33: Click on textarea 'customFields[1].title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/textarea_customFields1Title'))
        WebUI.takeScreenshot()
        "Step 34: Enter input value in textarea 'customFields[1].title'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_events/textarea_customFields1Title'), data['textarea_customfields_1_title'])
        WebUI.takeScreenshot()
        "Step 35: Click on button 'Next'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_next'))
        WebUI.takeScreenshot()
        "Step 36: Click on input field 'startDate'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_startDate'))
        WebUI.takeScreenshot()
        "Step 37: Click on input field 'happenDate'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_happenDate'))
        WebUI.takeScreenshot()
        "Step 38: Click on button"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_whatIsEventify'))
        WebUI.takeScreenshot()
        "Step 39: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_cell8'))
        WebUI.takeScreenshot()
        "Step 40: Click on input field 'endDate'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_endDate'))
        WebUI.takeScreenshot()
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_title'] = testData.getValue('input_title', rowIndex)
        data['input_numberofparticipants'] = testData.getValue('input_numberofparticipants', rowIndex)
        data['input_rc_select_2'] = testData.getValue('input_rc_select_2', rowIndex)
        data['textarea_customfields_0_title'] = testData.getValue('textarea_customfields_0_title', rowIndex)
        data['textarea_customfields_1_title'] = testData.getValue('textarea_customfields_1_title', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_title'] = 'default_data'
        data['input_numberofparticipants'] = 'default_data'
        data['input_rc_select_2'] = 'default_data'
        data['textarea_customfields_0_title'] = 'default_data'
        data['textarea_customfields_1_title'] = 'default_data'
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

