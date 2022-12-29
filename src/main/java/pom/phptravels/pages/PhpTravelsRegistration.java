package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpTravelsRegistration extends GenericWrappers{
	
	public PhpTravelsRegistration enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.FirstName.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.LastName.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterEmail(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.Email.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration clickCountryCode(String data)
	{
		clickByXpath("//li[@class='country' and @data-dial-code='"+data+"']");
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterPhone(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.Phone.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterCompanyName(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.CompanyName.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterinputAddress1(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.Address1.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterinputAddress2(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.Address2.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterCity(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.City.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterState(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.State.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterPostCode(String data)
	{
		enterByXpath(prop.getProperty("PHPRegistrationPage.PostCode.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration selectCountry(String data)
	{
		selectValueByXpath("//select[@id='inputCountry']", data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterMobile(String data)
	{
		//enterByXpath("//input[@id='customfield2']", data);
		
		enterByXpath(prop.getProperty("PHPRegistrationPage.Mobile.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterPassword(String data)
	{
		//enterByXpath("//input[@id='inputNewPassword1']", data);
		
		enterByXpath(prop.getProperty("PHPRegistrationPage.Password.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration enterConfirmPassword(String data)
	{
		//enterByXpath("//input[@id='inputNewPassword2']", data);
		
		enterByXpath(prop.getProperty("PHPRegistrationPage.ConfirmPassword.XPath"), data);
		
		return new PhpTravelsRegistration();
	}
	public PhpTravelsRegistration clickJoinMailingListFlag()
	{
		//clickByXpath("//span[text()='Yes']");
		
		clickByXpath(prop.getProperty("PHPRegistrationPage.JoinMailingListFlag.XPath"));
		
		return new PhpTravelsRegistration();
	}


}
