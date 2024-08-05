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

"Step 4: Click on div myEventsCreateEvent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_myEventsCreateEvent'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4: Click on div myEventsCreateEvent.png')

"Step 5: Click on image roleNavigationRoleImg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/image_roleNavigationRoleImg'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5: Click on image roleNavigationRoleImg.png')

"Step 6: Click on span roleMenuSpan -> Navigate to page 'profile/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_roleMenuSpan'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6: Click on span roleMenuSpan - Navigate to page profile.png')

"Step 7: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/image_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7: Click on image object.png')

"Step 8: Click on span roleMenuSpan -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_roleMenuSpan'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8: Click on span roleMenuSpan - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Role Menu Navigation and Profile Page Access on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}