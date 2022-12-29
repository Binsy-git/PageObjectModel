package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.w3schools.pages.SchoolsHomePageAlert;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To Accept Alert";
		author="Binsy";
		category="Smoke";
		url ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}

	@Test
	public void getAlert()
	{
		new SchoolsHomePageAlert()
		.switchiframeResult()
		.clickOnTryIt()
		//.getAlertTxt()
		.acceptAlt()
		.switchToDefaultContentSchool()
		.clickOnSchoolsHomePage();
		
		
	}
}
