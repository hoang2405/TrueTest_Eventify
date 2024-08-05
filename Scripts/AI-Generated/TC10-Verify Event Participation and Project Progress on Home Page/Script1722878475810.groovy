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

"Step 4: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 5: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5: Click on button participation.png')

"Step 6: Click on button information"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_information'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6: Click on button information.png')

"Step 7: Click on p testPrivacy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/p_testPrivacy'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7: Click on p testPrivacy.png')

"Step 8: Click on link events -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_events'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8: Click on link events - Navigate to page events.png')

"Step 9: Click on button myEvents"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_myEvents'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9: Click on button myEvents.png')

"Step 10: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10: Click on link object.png')

"Step 11: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11: Click on link object.png')

"Step 12: Click on div antModalWrap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_antModalWrap'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12: Click on div antModalWrap.png')

"Step 13: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 14: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14: Click on button participation.png')

"Step 15: Click on button information"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_information'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15: Click on button information.png')

"Step 16: Click on link navigation -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16: Click on link navigation - Navigate to page events.png')

"Step 17: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 18: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18: Click on button participation.png')

"Step 19: Click on link events -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_events'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19: Click on link events - Navigate to page events.png')

"Step 20: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 21: Click on link navigation -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 21: Click on link navigation - Navigate to page events.png')

"Step 22: Click on div usersEventsRewards"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_usersEventsRewards'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 22: Click on div usersEventsRewards.png')

"Step 23: Click on link users -> Navigate to page '/users'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_users'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 23: Click on link users - Navigate to page users.png')

"Step 24: Click on link eventsFiltersAll -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/users?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_users/link_eventsFiltersAll'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 24: Click on link eventsFiltersAll - Navigate to page events.png')

"Step 25: Click on div anhDuong"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_anhDuong'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 25: Click on div anhDuong.png')

"Step 26: Click on image roleNavigationRoleImg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/image_roleNavigationRoleImg'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 26: Click on image roleNavigationRoleImg.png')

"Step 27: Click on link eventBannerPng300HostCheckApprovedTest -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBannerPng300HostCheckApprovedTest'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 27: Click on link eventBannerPng300HostCheckApprovedTest - Navigate to page events.png')

"Step 28: Click on div registrationClosedHostedBy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_registrationClosedHostedBy'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 28: Click on div registrationClosedHostedBy.png')

"Step 29: Click on button participation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 29: Click on button participation.png')

"Step 30: Click on button flat -> Navigate to page 'events/*/participantsFullView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_flat'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 30: Click on button flat - Navigate to page eventsparticipantsFullView.png')

"Step 31: Click on div eventsDevGuildTraining"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_eventsDevGuildTraining'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 31: Click on div eventsDevGuildTraining.png')

"Step 32: Click on div participantProgress20All"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_participantProgress20All'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 32: Click on div participantProgress20All.png')

"Step 33: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 33: Click on button useGworkspace.png')

"Step 34: Click on div roleList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_roleList'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 34: Click on div roleList.png')

"Step 35: Click on button roleButtonNameAddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_roleButtonNameAddNew'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 35: Click on button roleButtonNameAddNew.png')

"Step 36: Click on div roleTooltip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_roleTooltip_1'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 36: Click on div roleTooltip.png')

"Step 37: Fill project details and save"

fillProjectDetailsAndSave.execute(data_path_0, Integer.valueOf(index_0))

"Step 38: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 38: Click on button useGworkspace.png')

"Step 39: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 39: Click on div menu.png')

"Step 40: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 40: Click on button useGworkspace.png')

"Step 41: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 41: Click on div menu.png')

"Step 42: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 42: Click on button cancel.png')

"Step 43: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 43: Click on button useGworkspace.png')

"Step 44: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 44: Click on div menu.png')

"Step 45: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 45: Click on button useGworkspace.png')

"Step 46: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 46: Click on div menu.png')

"Step 47: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 47: Click on button useGworkspace.png')

"Step 48: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 48: Click on div menu.png')

"Step 49: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 49: Click on button useGworkspace.png')

"Step 50: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 50: Click on div menu.png')

"Step 51: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 51: Click on button useGworkspace.png')

"Step 52: Click on div eventsDevGuildTraining"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_eventsDevGuildTraining'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 52: Click on div eventsDevGuildTraining.png')

"Step 53: Click on html html"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/html_html'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 53: Click on html html.png')

"Step 54: Click on button useGworkspace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_useGworkspace'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 54: Click on button useGworkspace.png')

"Step 55: Click on div menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/div_menu'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 55: Click on div menu.png')

"Step 56: Perform multiple actions in GWorkspace"

performActionsInGWorkspace.execute()

"Step 57: Click on button cancel -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 57: Click on button cancel - Navigate to page .png')

"Step 58: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify Event Participation and Project Progress on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}