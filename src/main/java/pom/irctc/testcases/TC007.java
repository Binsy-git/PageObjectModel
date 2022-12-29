package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FaceBookHome;
import wrappers.ProjectWrappers;

public class TC007  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify Facebook Sign up for the new user creation";
		author="Binsy";
		category="Smoke";
		url ="http://www.facebook.com";
		sheetName="TC007";
	}
	
	
	@Test(dataProvider="fetchData")
	public void faceBookNewUserReg(String firstName, String lastName, String emailId, String confrimEmailID, String month,
            String day,String year)
	{
		new FaceBookHome()
		.clickCreateNewAccount()
		.waitForPageLoad(3000)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterMobEmail(emailId)
		.enterReEmail(confrimEmailID)
		.enterNewPassword("Ala123")		
		.selectBirthdayMonth(month)
		.selectBirthdayDay(day)		
		.selectBirthdayYear(year)
		.clickGender("Female")
		.waitForPageLoad(5000)
		.clickSignUp();
		
	}

}
