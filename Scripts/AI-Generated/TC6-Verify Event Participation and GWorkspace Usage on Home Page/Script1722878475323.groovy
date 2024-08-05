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

"Step 3: Navigate to events/*"

TrueTestScripts.navigate("events/${GlobalVariable.events_id}")

"Step 4: Click on link navigation -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4: Click on link navigation - Navigate to page events.png')

"Step 5: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 6: Click on link backToHomePage -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_backToHomePage'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6: Click on link backToHomePage - Navigate to page events.png')

"Step 7: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 8: Click on link navigation -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8: Click on link navigation - Navigate to page events.png')

"Step 9: Click on link eventBanner100HostPendingFlashTeamBuilding"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBanner100HostPendingFlashTeamBuilding'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9: Click on link eventBanner100HostPendingFlashTeamBuilding.png')

"Step 10: Click on link eventBannerPng300HostApprovedCopiedOf -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostApprovedCopiedOf'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10: Click on link eventBannerPng300HostApprovedCopiedOf - Navigate to page events.png')

"Step 11: Click on link backToHomePage -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_backToHomePage'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11: Click on link backToHomePage - Navigate to page events.png')

"Step 12: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12: Click on button myEvents.png')

"Step 13: Click on link eventBannerPng300HostApprovedCopiedOf -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostApprovedCopiedOf'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13: Click on link eventBannerPng300HostApprovedCopiedOf - Navigate to page events.png')

"Step 14: Click on link backToHomePage -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_backToHomePage'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14: Click on link backToHomePage - Navigate to page events.png')

"Step 15: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15: Click on button myEvents.png')

"Step 16: Click on link eventBannerPng300HostApprovedCopiedOf -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostApprovedCopiedOf'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16: Click on link eventBannerPng300HostApprovedCopiedOf - Navigate to page events.png')

"Step 17: Click on button approved"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_approved'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17: Click on button approved.png')

"Step 18: Click on p targetAudience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/p_targetAudience'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18: Click on p targetAudience.png')

"Step 19: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19: Click on button participation.png')

"Step 20: Click on button flat -> Navigate to page 'events/*/participantsFullView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_flat'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20: Click on button flat - Navigate to page eventsparticipantsFullView.png')

"Step 21: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21: Click on button useGworkspace.png')

"Step 22: Click on div tooltip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_tooltip'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22: Click on div tooltip.png')

"Step 23: Click on link checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/link_checkIn'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 23: Click on link checkIn.png')

"Step 24: Click on div eventsDevGuildTraining"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_eventsDevGuildTraining'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 24: Click on div eventsDevGuildTraining.png')

"Step 25: Click on link devGuildTrainingDevOpsTrainingBasic -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/link_devGuildTrainingDevOpsTrainingBasic'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 25: Click on link devGuildTrainingDevOpsTrainingBasic - Navigate to page events.png')

"Step 26: Click on button approved"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_approved'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 26: Click on button approved.png')

"Step 27: Click on link makeCopy -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_makeCopy'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 27: Click on link makeCopy - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Event Participation and GWorkspace Usage on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}