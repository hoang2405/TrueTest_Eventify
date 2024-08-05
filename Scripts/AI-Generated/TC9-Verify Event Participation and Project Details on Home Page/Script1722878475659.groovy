import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.fillProjectDetailsAndSave
import katalon.common.performActionsInGWorkspace
import internal.GlobalVariable
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

"Step 4: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4: Click on button myEvents.png')

"Step 5: Click on link eventBannerPng200Host"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng200Host'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5: Click on link eventBannerPng200Host.png')

"Step 6: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6: Click on button myEvents.png')

"Step 7: Click on link eventBannerPng200Host"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng200Host'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7: Click on link eventBannerPng200Host.png')

"Step 8: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 9: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9: Click on button participation.png')

"Step 10: Click on button addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10: Click on button addNew.png')

"Step 11: Click on button addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11: Click on button addNew.png')

"Step 12: Click on button flat -> Navigate to page 'events/*/participantsFullView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_flat'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12: Click on button flat - Navigate to page eventsparticipantsFullView.png')

"Step 13: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13: Click on button useGworkspace.png')

"Step 14: Click on div menu -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu_1'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14: Click on div menu - Navigate to page events.png')

"Step 15: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15: Click on button participation.png')

"Step 16: Click on button flat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_flat'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16: Click on button flat.png')

"Step 17: Perform multiple actions in GWorkspace"

performActionsInGWorkspace.execute()

"Step 18: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18: Click on button cancel.png')

"Step 19: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19: Click on button useGworkspace.png')

"Step 20: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20: Click on div menu.png')

"Step 21: Click on button roleButtonNameAddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_roleButtonNameAddNew'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21: Click on button roleButtonNameAddNew.png')

"Step 22: Fill project details and save"

fillProjectDetailsAndSave.execute(data_path_0, Integer.valueOf(index_0))

"Step 23: Click on span truongTranQuangPham3182"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_truongTranQuangPham3182'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23: Click on span truongTranQuangPham3182.png')

"Step 24: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24: Click on div menu.png')

"Step 25: Click on button ok -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25: Click on button ok - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Event Participation and Project Details on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}