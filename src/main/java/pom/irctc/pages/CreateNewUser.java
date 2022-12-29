package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CreateNewUser extends GenericWrappers {
	
	public CreateNewUser enterUserId(String data)
	{
	   enterByXpath("//input[@id='userId']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterPasword(String data)
	{
		enterByXpath("//input[@id='password']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterConfPasword(String data)
	{
		enterByXpath("//input[@id='cnfPassword']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectSecurityQn(String data)
	{
		selectVisibleTextByXpath("//select[@id='secQstn']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterSecurityAnswer(String data)
	{
		enterByXpath("//input[@id='secAnswer']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectDOB(String day , String month , String year)
	{
		clickByXpath("//input[@id='dateOfBirth']");
		
		
		waitProperty(3000);
		
		clickByXpath("//select[@data-handler='selectMonth']");
		
		waitProperty(3000);
		//selectIndexByXpath("//select[@data-handler='selectMonth']", 5);
		
		clickByXpath("//select[@data-handler='selectMonth']/option[@value='"+month+"']");
		
				
		clickByXpath("//a[text()='"+day+"']");
	
		return new CreateNewUser();
	}
	public CreateNewUser clickGender(String data)
	{
		clickByXpath("//input[@id='gender1' and @value='"+data+"']");
		
		return new CreateNewUser();
	}
	public CreateNewUser clickMaritalStatus()
	{
	    clickByXpath("//input[@id='maritalStatus1']");
		
		return new CreateNewUser();
		
	}
	public CreateNewUser enterEmail(String data)
	{
		enterByXpath("//input[@id='email']", data);
		
		pageDown();
		
		return new CreateNewUser();
	
	}
	public CreateNewUser selectOccupation(String data)
	{
		selectVisibleTextByXpath("//select[@id='occupation']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterFirstName(String data)
	{
		//enterByXpath("//select[@id='fname']",data);
		
		enterById("fname", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterMiddleName(String data)
	{
		//enterByXpath("//select[@id='mname']",data);
		
		enterById("mname", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterLastName(String data)
	{
		//enterByXpath("//select[@id='lname']",data);
		
		enterById("lname", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectNationality(String data)
	{
		
		//selectVisibleTextByXpath("//select[@id='country']", data);
		
		selectValueById("natinality", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterFlatNo(String data)
	{
		enterByXpath("//input[@id='flatNo']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterStreet(String data)
	{
		enterByXpath("//input[@id='street']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterArea(String data)
	{
		enterByXpath("//input[@id='area']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectCountry(String data)
	{
		selectVisibleTextByXpath("//select[@id='country']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterMobile(String data)
	{
		enterByXpath("//input[@id='mobile']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterPincode(String data)
	{
		enterByXpath("//input[@id='pincode']",data);
		
		clickTab();
		
		return new CreateNewUser();
	}
	public CreateNewUser selectCity(String data)
	{
		selectVisibleTextByXpath("//select[@id='city']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectState(String data)
	{
		selectVisibleTextByXpath("//select[@id='state']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser ClickNotSameAddress()
	{
		pageDown();
		waitProperty(5000);
		
		clickById("sameAddresses1");
		
		return new CreateNewUser();
	}
	public CreateNewUser selectPostOffice(String data)
	{
		selectVisibleTextByXpath("//select[@id='postOffice']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterFlatNoOffice(String data)
	{
		enterByXpath("//input[@id='flatNoOffice']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterStreetOffice(String data)
	{
		enterByXpath("//input[@id='streetOffice']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterAreaOffice(String data)
	{
		enterByXpath("//input[@id='areaOffice']",data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectcountryOffice(String data)
	{
		selectVisibleTextByXpath("//select[@id='countryOffice']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser enterMobileOffice(String data)
	{
		enterByXpath("//input[@id='mobileOffice']",data);
				
		return new CreateNewUser();
	}
	public CreateNewUser enterpincodeOffice(String data)
	{
		enterByXpath("//input[@id='pincodeOffice']",data);
				
		return new CreateNewUser();
	}
	public CreateNewUser selectCityOffice(String data)
	{
		selectVisibleTextByXpath("//select[@id='cityOffice']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectstateOffice(String data)
	{
		selectVisibleTextByXpath("//select[@id='stateOffice']", data);
		
		return new CreateNewUser();
	}
	public CreateNewUser selectpostOffice(int data)
	{
		clickTab();
		
		selectIndexById("postOffice", 2);
		
		clickTab();
		
		return new CreateNewUser();
	}
	public CreateNewUser selectpostOfficeOffice(int data)
	{
		clickTab();
		
		selectIndexById("postOfficeOffice", 2);
		
		clickTab();
		
		return new CreateNewUser();
	}
	public CreateNewUser sameAddressesFlg()
	{
	  pageDown();
	  
	  clickById("sameAddresses1");
	  
	  return new CreateNewUser();
	  
	}
	
}
