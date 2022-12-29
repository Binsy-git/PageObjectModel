package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers  {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="IRCTC Sign Up";
		author="Binsy";
		category="Smoke";
		url ="https://www.irctc.co.in/nget/train-search";
		sheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void bookYourCoach(String userId	,
			                  String password,
			                  String confirmPassword,
			                  String securityQN,
			                  String securityAns,
			                  String birthMonth,
			                  String birthDay,
			                  String birthYear,
			                  String gender,
			                  String email,
			                  String occupation,
			                  String fname,
			                  String mname,
			                  String lname,
			                  String nationality,
			                  String flatNo,
			                  String street,
			                  String area,
			                  String pinCode,
			                  String city,
			                  String flatNo2	,
			                  String streetNameOffice,
			                  String officeArea,
			                  String officeMobile,
			                  String officeCountry,
			                  String officePin)
	{
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.sideMenuClick()
		.bookYourCoachMenuClick()
		.clickNewUserLink()
		.enterUserId(userId)
		.enterPasword(password)
		.enterConfPasword(confirmPassword)
		.selectSecurityQn(securityQN)
		.enterSecurityAnswer(securityAns)
		.selectDOB(birthDay ,birthMonth , birthYear)
		.clickGender(gender)
		.clickMaritalStatus()
		.enterEmail(email)
		.selectOccupation(occupation)
		.enterFirstName(fname)
		.enterMiddleName(mname)
		.enterLastName(lname)
		.selectNationality(nationality)
		.enterFlatNo(flatNo)
		.enterStreet(street)
		.enterArea(area)
		.selectCountry("India")
		.enterMobile("9237628638")
		.enterArea("Aiport Area")
		.enterPincode(pinCode)
		.selectCity(city)
		//.selectState("Kerala")
		.selectpostOffice(2)
		.ClickNotSameAddress()
		//.sameAddressesFlg()
		.enterFlatNoOffice(flatNo2)		
		.enterStreetOffice(streetNameOffice)
		.enterAreaOffice(officeArea)
		.enterMobileOffice(officeMobile)
		.selectcountryOffice(officeCountry)
		.enterpincodeOffice(officePin)
		//.selectCityOffice("Kollam")
		//.selectstateOffice("Kerala")
		.selectpostOfficeOffice(2)
		;
			
		
	}
	
	

}
