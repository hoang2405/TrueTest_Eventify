import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://stglogin-homev2.kms-technology.com"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /events"

TrueTestScripts.navigate("/events")

"Step 4: Click on p roleNavigationRoleParagraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/p_roleNavigationRoleParagraph'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4: Click on p roleNavigationRoleParagraph.png')

"Step 5: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5: Click on button myEvents.png')

"Step 6: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6: Click on button close.png')

"Step 7: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7: Click on button myEvents.png')

"Step 8: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8: Click on link object.png')

"Step 9: Click on link eventBannerPng300HostApprovedCopiedOf -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostApprovedCopiedOf'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9: Click on link eventBannerPng300HostApprovedCopiedOf - Navigate to page events.png')

"Step 10: Click on button participation -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10: Click on button participation - Navigate to page events.png')

"Step 11: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 12: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12: Click on button participation.png')

"Step 13: Click on button addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13: Click on button addNew.png')

"Step 14: Click on button ml5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_ml5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14: Click on button ml5.png')

"Step 15: Click on button ml5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_ml5'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15: Click on button ml5.png')

"Step 16: Click on input nameIdemailProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_nameIdemailProject'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16: Click on input nameIdemailProject.png')

"Step 17: Enter input value in input nameIdemailProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_events/input_nameIdemailProject'), var_1_input_nameIdemailProject)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17: Enter input value in input nameIdemailProject.png')

"Step 18: Click on link tbodyA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_tbodyA'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18: Click on link tbodyA.png')

"Step 19: Click on button addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19: Click on button addNew.png')

"Step 20: Click on button addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20: Click on button addNew.png')

"Step 21: Click on input nameIdemailProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_nameIdemailProject'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21: Click on input nameIdemailProject.png')

"Step 22: Enter input value in input nameIdemailProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_events/input_nameIdemailProject'), var_2_input_nameIdemailProject)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22: Enter input value in input nameIdemailProject.png')

"Step 23: Click on link tbodyA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_tbodyA'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23: Click on link tbodyA.png')

"Step 24: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24: Click on button save.png')

"Step 25: Click on span truongTranQuangPham3182"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_truongTranQuangPham3182'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25: Click on span truongTranQuangPham3182.png')

"Step 26: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26: Click on span object.png')

"Step 27: Click on button ok -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27: Click on button ok - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Multiple Event Actions and Participation on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}