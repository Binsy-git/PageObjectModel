package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="Book Hotels - OTP Validation";
		author="Binsy";
		category="Smoke";
		url ="https://www.irctc.co.in/nget/train-search";
		sheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void BookHotelsOTPValidation(String email,String	mobile,String cityHotelName,String	hotelRoom,
			String adultRoom,String	title,String firstName, String	lastName,String	state,String gstFLG,
			String gstNumber,String	companyName,String 	companyAddress,String hotelName,String amount,
			String otpErrorMsg)
	{
		new CovidAlertPage()
		.clickOnOK()		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.hotelsMenuClick()
		.clickLogin()
		.GuestUserLoginTab()
		.enterEmail(email)
		.enterMobile(mobile)
		.GuestUserLogin()
		.enterCityHotelName(cityHotelName)
		.clickRoomGuest()
		.selectHotelRoom(hotelRoom)
		.selectAdultRoom(adultRoom)
		//.clickRoomSelectionDone()
		.clickFindHotelButton()
		.getHotelName()
		.getPrice()
		.clickOnBookFirstHotelDisplay()
		.clickContinueToBook()
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectState(state)
		.selectGST(gstFLG)
		//.verifyHotelTitle(hotelName)
		//.verifyAmount(amount)
		.clickContinue()
		.clickAgree()
		.clickMakePayment()
		.clickVerifyOTP()
		.verifyOTPErrMsg("otp is required")
		
		;
		
		
		
		
		
		
		
		
	}

}
