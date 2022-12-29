package pom.frro.pages;

import wrappers.GenericWrappers;

public class FRROHome extends GenericWrappers{
	
	public FRRORegistration ClickSignUp()
	{
		clickByXpath("//a[text()='Sign Up (Registration)']");
		
		return new FRRORegistration();
	}

}
