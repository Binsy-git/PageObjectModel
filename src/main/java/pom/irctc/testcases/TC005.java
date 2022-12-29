package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="Book Hotels - GST Validation";
		author="Binsy";
		category="Smoke";
		url ="https://www.irctc.co.in";
		sheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void BookHotelsGSTValidation(String email, String mobile,String cityHotelName,
			                            String hotelRoom, String adultRoom	,String title,
			                            String firstName,String lastName,String state,
			                            String gstFlg,String gstNumber	,String companyName,
			                            String	companyAddress)
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
		.clickFindHotelButton()
		.getHotelName()
		.getPrice()
		.clickOnBookFirstHotelDisplay()
		.clickContinueToBook()
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectState(state)
		.selectGST(gstFlg)
		.enterGST(gstNumber)
		.enterCompanyName(companyName)
		.enterCompanyAddress(companyAddress)
		.clickContinue()
		.verifyGstNo("Please Enter Valid GSt number")
		
		;
		
		
		
		
		
	}

}
