package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
		sheetName="TC010";
	}

	@Test(dataProvider="fetchData")
	public void clickAlert(String text1 , String text2 )
	{
		new SchoolsHomePageConfirm()
		.switchiframeResult()
		.clickOnTryIt()
		.acceptAlt()
	    .verifyNamePrinted(text1 )
		.clickOnTryIt()
		.DismissAlt()
		.verifyNamePrinted(text2)
		
		;
	
		
	}
}
