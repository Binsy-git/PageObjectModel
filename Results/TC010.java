package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.w3schools.pages.SchoolsHomePage;
import pom.w3schools.pages.SchoolsHomePageConfirm;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To Accept Alert with Name";
		author="Binsy";
		category="Smoke";
		url ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}

	@Test
	public void clickAlert()
	{
		new SchoolsHomePageConfirm()
		.switchiframeResult()
		.clickOnTryIt()
		.getAlertTxt()
		.acceptAlt()
		.verifyNamePrinted("OK")
		.clickOnTryIt()
		.DismissAlt()
		.verifyNamePrinted("Cancel");
		/*	
		
		;
	
		.getAlertTxt()
		
		
		.switchToDefaultContentSchool()
		.clickOnSchoolsHomePage();
		*/
		
	}
}
