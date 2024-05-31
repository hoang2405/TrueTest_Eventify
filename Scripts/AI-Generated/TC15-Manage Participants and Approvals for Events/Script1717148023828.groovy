import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.completeSubmissionAndApprovalProcess
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.uploadEventBannerAndSetEventDetails
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://stglogin-homev2.kms-technology.com/events"

TrueTestScripts.navigate('/events')

"Step 2: Login into Application"

TrueTestScripts.login()

WebUI.takeScreenshot()

"Step 3: Click on link '+100ParticipantsApprovedCopied of VA to test #316Fri, May 31 | 10:00 AMHCMC' -> Navigate to page 'events/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBanner100CheckApprovedCopiedVatoFri'))

WebUI.takeScreenshot()

"Step 4: Click on button 'Participation'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_2'))

WebUI.takeScreenshot()

"Step 5: Click on button  -> Navigate to page 'events/*/participantsFullView'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addNew'))

WebUI.takeScreenshot()

"Step 6: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_events'))

WebUI.takeScreenshot()

"Step 7: Click on link  -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/link_kmstechnology'))

WebUI.takeScreenshot()

"Step 8: Click on link '+200HostApprovedVA to test#286Sat, June 08 | 10:00 AMHCMCKMS Technology, KMS Software' -> Navigate to page 'events/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBanner400Host'))

WebUI.takeScreenshot()

"Step 9: Click on button 'Manage'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_manage'))

WebUI.takeScreenshot()

"Step 10: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_registrationEndingIn14DaysHostedByKms'))

WebUI.takeScreenshot()

"Step 11: Click on link  -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_kmstechnology'))

WebUI.takeScreenshot()

"Step 12: Click on link '+200HostVA to test #288Fri, May 24 | 10:00 AMabcKMS Technology, KMS Software, Organization CommunicationClosed' -> Navigate to page 'events/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBanner200HostVa'))

WebUI.takeScreenshot()

"Step 13: Click on button 'Approved'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_manage'))

WebUI.takeScreenshot()

"Step 14: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_events'))

WebUI.takeScreenshot()

"Step 15: Click on link  -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_kmstechnology'))

WebUI.takeScreenshot()

"Step 16: Click on link '+100ParticipantsVA to test Custom FieldsWed, May 22 | 10:00 AMHCMCClosed' -> Navigate to page 'events/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBanner100ParticipantsVatoTestCustom'))

WebUI.takeScreenshot()

"Step 17: Click on button 'Approved'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_manage'))

WebUI.takeScreenshot()

"Step 18: Click on link 'Make copy'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_makeCopy'))

WebUI.takeScreenshot()

"Step 19: Upload event banner and set event details"

uploadEventBannerAndSetEventDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 20: Complete submission and approval process"

completeSubmissionAndApprovalProcess.execute()

"Step 21: Click on button 'Cancel' -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_cancel'))

WebUI.takeScreenshot()

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Manage Participants and Approvals for Events_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
