package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookCreateAccount extends GenericWrappers {
	
	
	public FaceBookCreateAccount waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public FaceBookCreateAccount enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("FaceBookCreateAccountPage.FirstName.XPath"),data);
		
		return new FaceBookCreateAccount();
	}
	public FaceBookCreateAccount enterLastName(String data)
	{
		enterByXpath(prop.getProperty("FaceBookCreateAccountPage.LastName.XPath"),data);
		
		return new FaceBookCreateAccount();
	}
	public FaceBookCreateAccount enterMobEmail(String data)
	{
		enterByXpath(prop.getProperty("FaceBookCreateAccountPage.MobEmail.XPath"),data);
		
		return new FaceBookCreateAccount();
	}
	public FaceBookCreateAccount enterReEmail(String data)
	{
		enterByXpath(prop.getProperty("FaceBookCreateAccountPage.ReEmail.XPath"),data);
		
		return new FaceBookCreateAccount();
	}
	
	public FaceBookCreateAccount enterNewPassword(String data)
	{
		enterByXpath(prop.getProperty("FaceBookCreateAccountPage.NewPassword.XPath"),data);
		
		return new FaceBookCreateAccount();
	}
	public FaceBookCreateAccount selectBirthdayMonth(String data)
	{
				
		selectValueById(prop.getProperty("FaceBookCreateAccountPage.BirthdayMonth.Id"), "2");
		
		return new FaceBookCreateAccount();
	}
	public FaceBookCreateAccount selectBirthdayDay(String data)
	{
		selectVisibileTextById(prop.getProperty("FaceBookCreateAccountPage.BirthdayDay.Id"), data);
				
		return new FaceBookCreateAccount();
	}
	public FaceBookCreateAccount selectBirthdayYear(String data)
	{
		
		selectVisibleTextByXpath(prop.getProperty("FaceBookCreateAccountPage.Year.XPath"), data);
		
		return new FaceBookCreateAccount();
	}
	public FaceBookCreateAccount clickGender(String data)
	{
		//clickByXpath(prop.getProperty("FaceBookCreateAccountPage.Gender.XPath"), data);
		
		return new FaceBookCreateAccount();
	}

	public FaceBookCreateAccount clickSignUp()
	{
		
		clickByXpath(prop.getProperty("FaceBookCreateAccountPage.SignUp.XPath"));
		
		return new FaceBookCreateAccount();
	}

}
