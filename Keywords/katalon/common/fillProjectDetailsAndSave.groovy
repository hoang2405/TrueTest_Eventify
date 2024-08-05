package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class fillProjectDetailsAndSave {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input nameIdemailProject"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_nameIdemailProject'))
        
        "Step 2: Enter input value in input nameIdemailProject"
        
        WebUI.setText(findTestObject('AI-Generated/Page_events_participantsFullView/input_nameIdemailProject'), data['var_1_input_nameIdemailProject'])
        
        "Step 3: Click on link truongTranQuangPham3182"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/link_truongTranQuangPham3182'))
        
        "Step 4: Click on div roleTooltip"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_roleTooltip'))
        
        "Step 5: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_save'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_nameIdemailProject'] = testData.getValue('var_1_input_nameIdemailProject', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_nameIdemailProject'] = 'default_data'
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

