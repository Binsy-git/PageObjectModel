package pom.frro.pages;

import wrappers.GenericWrappers;

public class FRRORegistration extends GenericWrappers {
	
	public FRRORegistration enterUserID(String data)
	{
		enterByXpath("//input[@id='u_id']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterPassword(String data)
	{
		enterByXpath("//input[@id='u_pwd']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterConfirmPassword(String data)
	{
		enterByXpath("//input[@id='u_repwd']",data);
		
		clickTab();
		
		return new FRRORegistration();
	}
	public FRRORegistration selectSecurityQn(String data)
	{
		
		selectIndexByName("u_secques", 2);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterSecurityAnswer(String data)
	{
		enterByXpath("//input[@id='u_secans']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterName(String data)
	{
		enterByXpath("//input[@id='u_name']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectGender(String data)
	{
	
		//selectVisibleTextByXpath("(//select[@name='u_gender'])",data);
		
		selectValueByName("u_gender", data);
				
		return new FRRORegistration();
	}
	public FRRORegistration enterDOB(String data)
	{
		enterByXpath("//input[@id='u_dob']",data);
			
		return new FRRORegistration();
	}
	public FRRORegistration enterDesignation(String data)
	{
		enterByXpath("//input[@id='u_designation']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterEmail(String data)
	{
		enterByXpath("//input[@id='u_emailid']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterMobile(String data)
	{
		enterByXpath("//input[@id='u_mobile']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterPhone(String data)
	{
		enterByXpath("//input[@id='u_phone']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectNationality(String data )
	{
		//selectVisibleTextByXpath("(//select[@name='u_nationality'])",data);
		
		selectValueById("u_nationality", data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterGuestName(String data)
	{
		enterByXpath("//input[@id='name']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterCapacity(String data)
	{
		enterByXpath("//input[@id='capacity']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterAddress(String data)
	{
		enterByXpath("//textarea[@id='address']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectState(String data)
	{
		selectValueById("state", data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectDis(int data)
	{
		waitProperty(3000);
		
		selectIndexById("city_distr", data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectCity(String data)
	{
		selectVisibleTextByXpath("(//select[@name='city_distr'])",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectFRRODescription()
	{
		clickByXpath("(//select[@id='frrodata']/option)[2]");
		
		return new FRRORegistration();
	}
	public FRRORegistration selectAccType(String data)
	{
		//selectVisibleTextByXpath("(//select[@name='acco_type'])",data);
		selectValueByName("acco_type", data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectGrade(String data)
	{
		//selectVisibleTextByXpath("(//select[@name='star_rat'])",data);
		
		selectValueByName("star_rat", data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterGuestEmail(String data)
	{
		enterByXpath("//input[@id='email']",data);
		
		return new FRRORegistration();
	}
		public FRRORegistration enterGuestMobile(String data)
	{
		enterByXpath("//input[@id='mcontact']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterGuestPhone(String data)
	{
		enterByXpath("//input[@id='contact']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnerName(String data)
	{
		enterByXpath("//input[@name='name_o']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnerAddress(String data)
	{
		enterByXpath("//input[@name='address_o']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration selectOwnerState()
	{
		clickByXpath("(//select[@id='state_o']/option)[2]");
		
		return new FRRORegistration();
	}
	public FRRORegistration selectOwnerCity()
	{
		clickByXpath("(//select[@id='citydistr_o']/option)[2]");
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnerEmail(String data)
	{
		enterByXpath("//input[@name='emailid_o']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnerPhone(String data)
	{
		enterByXpath("//input[@name='phoneno_o']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnerMobile(String data)
	{
		enterByXpath("//input[@name='mobile_o']",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration clickAddOwnerDetails()
	{
		clickByName("add");
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnrName(String data)
	{
		enterByName("name_o",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnrAddress(String data)
	{
		enterByName("address_o",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnrState(String data)
	{
		selectValueByName("state_o", data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnrDis(int data)
	{
		waitProperty(3000);
		
		selectIndexByName("citydistr_o", data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnrEmail(String data)
	{
		
		enterByName("emailid_o",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnrPhone(String data)
	{
		
		enterByName("phoneno_o",data);
		
		return new FRRORegistration();
	}
	public FRRORegistration enterOwnrMobile(String data)
	{
		
		enterByName("mobile_o",data);
		
		return new FRRORegistration();
	}

}
