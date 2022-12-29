package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.w3schools.pages.SchoolsHomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers
{
@BeforeClass
public void beforeClass() {
	testCaseName="TC009";
	testCaseDescription="To Accept Alert with Name and Dismiss Alert";
	author="Binsy";
	category="Smoke";
	url ="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	sheetName="TC009";
}

@Test(dataProvider="fetchData")
	public void getAlert(String name,String msg)
	{
		new SchoolsHomePage()
		.switchiframeResult()
		.clickOnTryIt()
		.enterAlertText(name)
		.verifyNamePrinted(name)
		.clickOnTryIt()
		.DismissAlt()
		.verifyNamePrinted(msg)
		.switchToDefaultContentSchool()
		.clickOnSchoolsHomePage();
		
	}
	
}
