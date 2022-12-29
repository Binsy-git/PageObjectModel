package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="Saloon Mandatory Check";
		author="Binsy";
		category="Smoke";
		url ="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void saloonMandatoryCheck(String name, 
			                         String orgnisation,
			                         String address,
			                         String mobile,
			                         String email,
			                         String request,
			                         String orginStn,
			                         String dest,
			                         String duration, 
			                         String coachDet,
			                         String noPassengers,
			                         String charterPurpose,
			                         String address2,
			                         String serives,
			                         String msgErr)
	{
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.sideMenuClick()
		.charterMenuClick()		
		.clickEnquiryForm()
		.enterName("Vasi")
		.enterOrganisation("TestHose")
		.enterAddress("Jawahar Street 12 ")
		.enterMobile("34242342")
		.enterEmail("Vasi@TestHose.com")
		.selectRequest("Saloon Charter")
		.enterOrginStation("Trivandrum")
		.enterDestinationStation("Chennai")
		.enterDuration("2")
		.entercoachDetails("A/C Coach")
		.enterNumberOfPassengers("2")
		.enterCharterPurpose("Tour")
		.enterAddress("Vasi House")
		.enterServices("Additional Bed")		
		.clickSubmit()
		.getMobileErrorMsg("Mobile no. not valid");
	}

}
