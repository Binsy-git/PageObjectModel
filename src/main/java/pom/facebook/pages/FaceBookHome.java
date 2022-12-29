package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookHome extends GenericWrappers{
	
	public FaceBookCreateAccount clickCreateNewAccount()
	{
		clickByXpath(prop.getProperty("FaceBookHomePage.CreateNewAccount.XPath"));
		
		return new FaceBookCreateAccount();
	}
	

}
