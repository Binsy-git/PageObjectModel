package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelsRegistration;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="PHP Travel Registration";
		author="Binsy";
		category="Smoke";
		url ="https://www.phptravels.org/register.php";
		sheetName="TC008";
	}
	
	
	@Test(dataProvider="fetchData")
	public void phpTravelRegistration(String fname,
			                          String lname,
			                          String email,
			                          String phone,
			                          String companyAddress,
			                          String address1,
			                          String address2,
			                          String city,
			                          String state,
			                          String postCode,
			                          String mobile,
			                          String password,
			                          String confirmPassword)
	{
		new PhpTravelsRegistration()
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterEmail(email)
		//.clickCountryCode("91")
		.enterPhone(phone)
		.enterCompanyName(companyAddress)
		.enterinputAddress1(address1)
		.enterinputAddress2(address2)
		.enterCity(city)
		.enterState(state)
		.enterPostCode(postCode)
		//.selectCountry("IN")
		.enterMobile(mobile)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.clickJoinMailingListFlag();

	}

}
