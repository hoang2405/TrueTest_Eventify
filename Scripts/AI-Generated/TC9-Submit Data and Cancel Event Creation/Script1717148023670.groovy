import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.addInterestsAndSubmitForm
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

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

"Step 3: Click on span  -> Navigate to page 'profile/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_profile'))

WebUI.takeScreenshot()

"Step 4: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_rightWhatIsEventify'))

WebUI.takeScreenshot()

"Step 5: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/button_rightWhoDevelopsEventify'))

WebUI.takeScreenshot()

"Step 6: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_information'))

WebUI.takeScreenshot()

"Step 7: Add interests and submit form"

addInterestsAndSubmitForm.execute()

"Step 8: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_svg'))

WebUI.takeScreenshot()

"Step 9: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_absolute2'))

WebUI.takeScreenshot()

"Step 10: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_softwareDeveloper2946'))

WebUI.takeScreenshot()

"Step 11: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_usersEvents71Phuoc'))

WebUI.takeScreenshot()

"Step 12: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_svg'))

WebUI.takeScreenshot()

"Step 13: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_absolute5'))

WebUI.takeScreenshot()

"Step 14: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_phuocNguyen'))

WebUI.takeScreenshot()

"Step 15: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_anhDuong'))

WebUI.takeScreenshot()

"Step 16: Add interests and submit form"

addInterestsAndSubmitForm.execute()

"Step 17: Click on image"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/image_avatar'))

WebUI.takeScreenshot()

"Step 18: Click on image"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/image_avatar_1'))

WebUI.takeScreenshot()

"Step 19: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/span_profile'))

WebUI.takeScreenshot()

"Step 20: Click on image"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/image_avatar_2'))

WebUI.takeScreenshot()

"Step 21: Click on image"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/image_avatar_2'))

WebUI.takeScreenshot()

"Step 22: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_absolute2_1'))

WebUI.takeScreenshot()

"Step 23: Click on link 'Users' -> Navigate to page 'users'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/link_users'))

WebUI.takeScreenshot()

"Step 24: Click on link  -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/users?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_users/link_kmstechnology'))

WebUI.takeScreenshot()

"Step 25: Click on span  -> Navigate to page 'profile/*/events-history'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_eventsHistory'))

WebUI.takeScreenshot()

"Step 26: Click on list item  -> Navigate to page 'profile/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*/events-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile_events_history/item_profile'))

WebUI.takeScreenshot()

"Step 27: Click on image"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/image_avatar_2'))

WebUI.takeScreenshot()

"Step 28: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_socialLinks'))

WebUI.takeScreenshot()

"Step 29: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/div_kmstechnologyInc'))

WebUI.takeScreenshot()

"Step 30: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_peopleWithSimilarInterests'))

WebUI.takeScreenshot()

"Step 31: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_peopleWithSimilarInterests'))

WebUI.takeScreenshot()

"Step 32: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_peopleWithSimilarInterests'))

WebUI.takeScreenshot()

"Step 33: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_peopleWithSimilarInterests'))

WebUI.takeScreenshot()

"Step 34: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_peopleWithSimilarInterests'))

WebUI.takeScreenshot()

"Step 35: Click on header"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/heading_peopleWithSimilarInterests'))

WebUI.takeScreenshot()

"Step 36: Click on link  -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile/link_kmstechnology'))

WebUI.takeScreenshot()

"Step 37: Click on span  -> Navigate to page 'profile/*/events-history'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_eventsHistory'))

WebUI.takeScreenshot()

"Step 38: Click on link  -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/profile/.*/events-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_profile_events_history/link_kmstechnology'))

WebUI.takeScreenshot()

"Step 39: Click on link '2'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_2'))

WebUI.takeScreenshot()

"Step 40: Click on link '+400HostTEST PARTICIPANTS TABLE WITH CUSTOM FIELDSTue, May 21 | 10:00 AMhcmOther OrganizationClosed' -> Navigate to page 'events/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBanner400Host'))

WebUI.takeScreenshot()

"Step 41: Click on button 'Participation'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_participation_1'))

WebUI.takeScreenshot()

"Step 42: Click on button  -> Navigate to page 'events/*/participantsFullView'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_addNew'))

WebUI.takeScreenshot()

"Step 43: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_role'))

WebUI.takeScreenshot()

"Step 44: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_role'))

WebUI.takeScreenshot()

"Step 45: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_role'))

WebUI.takeScreenshot()

"Step 46: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/span_role'))

WebUI.takeScreenshot()

"Step 47: Click on link  -> Navigate to page 'events'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*/participantsFullView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events_participantsFullView/link_kmstechnology'))

WebUI.takeScreenshot()

"Step 48: Click on link '+100ApprovedVA to test Custom Fields (sprint 21 demo)Fri, June 07 | 10:00 AMHCMC' -> Navigate to page 'events/*'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_eventBanner200HostApprovedTestEventy1i12_1'))

WebUI.takeScreenshot()

"Step 49: Click on button 'Approved'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_approved'))

WebUI.takeScreenshot()

"Step 50: Click on link 'Register Now'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/link_registerNow'))

WebUI.takeScreenshot()

"Step 51: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 52: Enter input value in input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_events/input_inputText'), input_object)

WebUI.takeScreenshot()

"Step 53: Click on button 'Confirm'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_confirm'))

WebUI.takeScreenshot()

"Step 54: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 55: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_fixed'))

WebUI.takeScreenshot()

"Step 56: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 57: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 58: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 59: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_fixed'))

WebUI.takeScreenshot()

"Step 60: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 61: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 62: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 63: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 64: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 65: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 66: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 67: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 68: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 69: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 70: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 71: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 72: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 73: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 74: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 75: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 76: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 77: Click on div"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/div_fixed'))

WebUI.takeScreenshot()

"Step 78: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputText'))

WebUI.takeScreenshot()

"Step 79: Enter input value in input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_events/input_inputText'), input_object_1)

WebUI.takeScreenshot()

"Step 80: Click on label"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/label_custom2Custom1IfI'))

WebUI.takeScreenshot()

"Step 81: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/input_inputNumber'))

WebUI.takeScreenshot()

"Step 82: Enter input value in input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_events/input_inputNumber'), input_object_2)

WebUI.takeScreenshot()

"Step 83: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_sendMeAresponseEmailOf'))

WebUI.takeScreenshot()

"Step 84: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/checkbox_sendMeAresponseEmailOf'))

WebUI.takeScreenshot()

"Step 85: Click on span"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/span_sendMeAresponseEmailOf'))

WebUI.takeScreenshot()

"Step 86: Click on input field"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/checkbox_sendMeAresponseEmailOf'))

WebUI.takeScreenshot()

"Step 87: Click on button 'Cancel'"

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/events/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_events/button_cancel'))

WebUI.takeScreenshot()

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
