package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class performActionsInGWorkspace {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button useGworkspace"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))
        
        "Step 2: Click on div menu"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))
        
        "Step 3: Click on span host1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_host1'))
        
        "Step 4: Click on input host1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_host1'))
        
        "Step 5: Click on span participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_participants2'))
        
        "Step 6: Click on input participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_participants2'))
        
        "Step 7: Click on button cancel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_cancel'))
        
        "Step 8: Click on button useGworkspace"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))
        
        "Step 9: Click on div menu"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))
        
        "Step 10: Click on button useGworkspace"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))
        
        "Step 11: Click on div usersEventsRewards5Anh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_usersEventsRewards5Anh'))
        
        "Step 12: Click on button useGworkspace"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))
        
        "Step 13: Click on button useGworkspace"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))
        
        "Step 14: Click on div menu"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))
        
        "Step 15: Click on button useGworkspace"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))
        
        "Step 16: Click on div menu"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))
        
        "Step 17: Click on span host1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_host1'))
        
        "Step 18: Click on input host1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_host1'))
        
        "Step 19: Click on span participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_participants2'))
        
        "Step 20: Click on input participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_participants2'))
        
        "Step 21: Click on span host1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_host1'))
        
        "Step 22: Click on input host1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_host1'))
        
        "Step 23: Click on span participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_participants2'))
        
        "Step 24: Click on input participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_participants2'))
        
        "Step 25: Click on span participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_participants2'))
        
        "Step 26: Click on input participants2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/input_participants2'))
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

