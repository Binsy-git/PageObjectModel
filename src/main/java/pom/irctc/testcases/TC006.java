package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.frro.pages.FRROHome;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="Form C";
		author="Binsy";
		category="Smoke";
		url ="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void FRROReg(String userID,String password,String confirmPassword, String securityQuestion, String	yourAnswer, String name,
	          String gender,String dob,String designation,String  email,String mobile,String phone,String nationality,String guestName,
	          String capacity,String address,String state,String city,String accomodationType,String accomodationGrade,String email2,
	          String mobile1,String phone2,String addname1 ,String addaddress1,String addstate1,String addcity1,String addemailID1, String addphoneNo1,String addmobile1,
	          String addname2 ,String addaddress2,String addstate2,String addcity2,String addemailID2, String addphoneNo2,String addmobile2,
	          String addname3 ,String addaddress3,String addstate3,String addcity3,String addemailID3, String addphoneNo3,String addmobile3)
	{
		new FRROHome()
		.ClickSignUp()
		.enterUserID(userID)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.selectSecurityQn(securityQuestion)
		.enterSecurityAnswer(yourAnswer)
		.enterName(name)
		.selectGender(gender)
		.enterDOB(dob)
		.enterDesignation(designation)
		.enterEmail(email)
		.enterMobile(mobile)
		.enterPhone(phone)
		.selectNationality(nationality)
		.enterGuestName(guestName)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)
		.selectDis(2)
		.selectAccType(accomodationType)
		.selectGrade(accomodationGrade)
		.enterGuestEmail(email2)
		.enterGuestMobile(mobile1) 
		.enterGuestName(addname1)
		.enterGuestPhone(phone2)
		.enterOwnrName(addname1)
		.enterOwnrAddress(addaddress1)
		.enterOwnrState(addstate1)
		.enterOwnrDis(1)
		.enterOwnrEmail(addemailID1)
		.enterOwnrPhone(addphoneNo1)
		.enterOwnrMobile(addmobile1)
		.clickAddOwnerDetails()
		.enterOwnrName(addname2)
		.enterOwnrAddress(addaddress2)
		.enterOwnrState(addstate2)
		.enterOwnrDis(1)
		.enterOwnrEmail(addemailID1)
		.enterOwnrPhone(addphoneNo2)
		.enterOwnrMobile(addmobile2)
		.clickAddOwnerDetails()
		.enterOwnrName(addname3)
		.enterOwnrAddress(addaddress3)
		.enterOwnrState(addstate3)
		.enterOwnrDis(1)
		.enterOwnrEmail(addemailID3)
		.enterOwnrPhone(addphoneNo3)
		.enterOwnrMobile(addmobile3)
		.clickAddOwnerDetails()
		;
		
		
	}

}
