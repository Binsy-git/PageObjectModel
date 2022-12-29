package pom.irctc.pages;

import wrappers.GenericWrappers;

public class TrainCharterPage extends GenericWrappers  {
	
	public CreateNewUser clickNewUserLink()
	{
		switchToLastWindow();
		
		clickByXpath("//a[text()='New User? Signup']");
		
		return new CreateNewUser();
	}
		

}
