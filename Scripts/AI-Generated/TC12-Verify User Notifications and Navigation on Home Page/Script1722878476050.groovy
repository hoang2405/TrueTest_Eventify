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

"Step 4: Click on div usersEventsRewards5NotificationsShowUnread"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_usersEventsRewards5NotificationsShowUnread'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4: Click on div usersEventsRewards5NotificationsShowUnread.png')

"Step 5: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5: Click on input search.png')

"Step 6: Click on span allDown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_allDown'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6: Click on span allDown.png')

"Step 7: Click on div softwareDeveloper2946"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_softwareDeveloper2946'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7: Click on div softwareDeveloper2946.png')

"Step 8: Click on div softwareDeveloper2946"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_softwareDeveloper2946'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8: Click on div softwareDeveloper2946.png')

"Step 9: Click on div highlightEventsCopiedOfVa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_highlightEventsCopiedOfVa'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9: Click on div highlightEventsCopiedOfVa.png')

"Step 10: Click on span publishedEventsAll100Test"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_publishedEventsAll100Test'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10: Click on span publishedEventsAll100Test.png')

"Step 11: Click on section object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/section_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11: Click on section object.png')

"Step 12: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12: Click on link object.png')

"Step 13: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13: Click on link object.png')

"Step 14: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14: Click on div slickSlider.png')

"Step 15: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15: Click on div slickSlider.png')

"Step 16: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16: Click on div slickSlider.png')

"Step 17: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17: Click on div slickSlider.png')

"Step 18: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18: Click on div slickSlider.png')

"Step 19: Click on link plKmsmeeting03251126 -> Navigate to page 'events/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_plKmsmeeting03251126'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19: Click on link plKmsmeeting03251126 - Navigate to page events.png')

"Step 20: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 20: Click on div slickSlider.png')

"Step 21: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 21: Click on div slickSlider.png')

"Step 22: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 22: Click on div slickSlider.png')

"Step 23: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 23: Click on div slickSlider.png')

"Step 24: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 24: Click on div slickSlider.png')

"Step 25: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 25: Click on div slickSlider.png')

"Step 26: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 26: Click on div slickSlider.png')

"Step 27: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 27: Click on div slickSlider.png')

"Step 28: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 28: Click on div slickSlider.png')

"Step 29: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 29: Click on div slickSlider.png')

"Step 30: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 30: Click on div slickSlider.png')

"Step 31: Click on div slickSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_slickSlider_1'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 31: Click on div slickSlider.png')

"Step 32: Click on link navigation -> Navigate to page '/events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_navigation'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 32: Click on link navigation - Navigate to page events.png')

"Step 33: Click on image roleNavigationRoleImg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/image_roleNavigationRoleImg'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 33: Click on image roleNavigationRoleImg.png')

"Step 34: Click on section nth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/section_nth0'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 34: Click on section nth0.png')

"Step 35: Click on p roleNavigationRoleParagraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/p_roleNavigationRoleParagraph'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 35: Click on p roleNavigationRoleParagraph.png')

"Step 36: Click on image roleNavigationRoleImg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/image_roleNavigationRoleImg'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 36: Click on image roleNavigationRoleImg.png')

"Step 37: Click on item menuitem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/item_menuitem'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 37: Click on item menuitem.png')

"Step 38: Click on span roleNavigationRoleButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_roleNavigationRoleButton'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 38: Click on span roleNavigationRoleButton.png')

"Step 39: Click on image roleNavigationRoleImg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/image_roleNavigationRoleImg'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 39: Click on image roleNavigationRoleImg.png')

"Step 40: Click on section nth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/section_nth0'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 40: Click on section nth0.png')

"Step 41: Click on section nth0 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/section_nth0'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 41: Click on section nth0 - Navigate to page .png')

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Verify User Notifications and Navigation on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}