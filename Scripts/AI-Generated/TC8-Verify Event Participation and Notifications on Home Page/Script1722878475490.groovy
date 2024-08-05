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

"Step 4: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4: Click on button myEvents.png')

"Step 5: Click on link eventBannerPng300HostApprovedCopiedOf -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostApprovedCopiedOf'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5: Click on link eventBannerPng300HostApprovedCopiedOf - Navigate to page events.png')

"Step 6: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6: Click on button participation.png')

"Step 7: Click on button flat -> Navigate to page 'events/*/participantsFullView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_flat'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7: Click on button flat - Navigate to page eventsparticipantsFullView.png')

"Step 8: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8: Click on button useGworkspace.png')

"Step 9: Click on div eventsDevGuildTraining"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_eventsDevGuildTraining'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9: Click on div eventsDevGuildTraining.png')

"Step 10: Click on div usersEventsRewards5Anh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_usersEventsRewards5Anh'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10: Click on div usersEventsRewards5Anh.png')

"Step 11: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11: Click on button useGworkspace.png')

"Step 12: Click on div eventsDevGuildTraining"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_eventsDevGuildTraining'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12: Click on div eventsDevGuildTraining.png')

"Step 13: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13: Click on button useGworkspace.png')

"Step 14: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14: Click on div menu.png')

"Step 15: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15: Click on div menu.png')

"Step 16: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16: Click on button useGworkspace.png')

"Step 17: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17: Click on div menu.png')

"Step 18: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18: Click on div menu.png')

"Step 19: Click on div menu -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19: Click on div menu - Navigate to page events.png')

"Step 20: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20: Click on button participation.png')

"Step 21: Click on button information"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_information'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21: Click on button information.png')

"Step 22: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22: Click on button participation.png')

"Step 23: Click on span roleSuperscript"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_roleSuperscript'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23: Click on span roleSuperscript.png')

"Step 24: Click on span roleSuperscript"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_roleSuperscript'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24: Click on span roleSuperscript.png')

"Step 25: Click on div usersEventsRewards5NotificationsShowUnread"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_usersEventsRewards5NotificationsShowUnread'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25: Click on div usersEventsRewards5NotificationsShowUnread.png')

"Step 26: Click on span events"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_events'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26: Click on span events.png')

"Step 27: Click on link events -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_events'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27: Click on link events - Navigate to page events.png')

"Step 28: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 28: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify Event Participation and Notifications on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}