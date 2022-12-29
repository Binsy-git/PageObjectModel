package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="IRCTC Sign Up";
		author="Binsy";
		category="Smoke";
		url ="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void irctcRegistration(String userName,
		                          String  password,
		                          String confirmPassword,
		                          String prefLang,
		                          String secQN,
		                          String secAns,
		                          String fname	,
		                          String mname,
		                          String lname,
		                          String gender,
		                          String dayDOB,
		                          String monthDOB,
		                          String yearDOB,
		                          String maritalStatus,
		                          String occupation,
		                          String email,
		                          String mobile,
		                          String resAdd1,
		                          String resAdd2,
		                          String resAdd3,
		                          String postOffice,
		                          String resPhone,
		                          String officeAdd1,
		                          String officeAdd2,
		                          String officePinCode,
		                          String offPhone)
	{
		
		new CovidAlertPage()
		.clickOnOK()
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(password)
		.enterConfPassword(confirmPassword)	
		.selectPrefLang(prefLang)
		.selectSecQn(secQN)
		.enterAns(secAns)
		.clickContinue()
		.enterFirstName(fname)
		.enterMiddleName(mname)
		.enterLastName(lname)
		.clickOnGender(gender)
		.selectDOB(dayDOB,monthDOB,yearDOB)
		.clickOnMaritalStatus(maritalStatus)
		.clickOnOccupation(occupation)	
		.waitForPageLoad(5000)
		.enterEmail(email)
		.enterMobile(mobile)
		.waitForPageLoad(5000)
		.clickContinue()
		.enterResAddress1(resAdd1)
		.enterResAddress2(resAdd2)
		.enterResAddress3(resAdd3)
		.enterResPostOff(postOffice)
		.clickResState()
		.waitForPageLoad(3000)
		.clickTabReg()
		.clickResCity(2)
		.clickOffPostOffice(2)
		.enterResPhone(offPhone)
	    .clickOfficeAdd()
		.enterOfficeAdd1(officeAdd1)
		.enterOfficeAdd2(officeAdd2)
		.enterOffPinCode(officePinCode)
		.clickOffState()
		.waitForPageLoad(3000)
		.clickTabReg()
		.clickOffCity()
		.enterOffPhone(officePinCode);	
	
		
	}
	
	

}
