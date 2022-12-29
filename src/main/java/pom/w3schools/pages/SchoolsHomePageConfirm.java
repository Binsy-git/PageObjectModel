package pom.w3schools.pages;

import wrappers.GenericWrappers;

public class SchoolsHomePageConfirm extends GenericWrappers{
	
	public SchoolsHomePageConfirm clickOnTryIt()
	
	{
		//clickByXpath("//button[text()='Try it']");
		
		clickByXpath(prop.getProperty("W3SchoolsHomeConfirmPage.TryIt.XPath"));
		
		return new SchoolsHomePageConfirm();
	}
	public SchoolsHomePageConfirm enterAlertText(String data)
	{
		acceptAlerts(data);		
			
		return new SchoolsHomePageConfirm();
	}
	public SchoolsHomePageConfirm getAlertTxt()
	{
		getAlertText();
		
		return new SchoolsHomePageConfirm();
	}
	public SchoolsHomePageConfirm acceptAlt()
	{
		acceptAlert();
		
		//switchToDefaultContent();
		
		//
		
		return new SchoolsHomePageConfirm();
	}
	public SchoolsHomePageConfirm DismissAlt()
	{
		//waitProperty(5000);
		
		//switchToDefaultContent();
		
		dismissAlert();
		
		return new SchoolsHomePageConfirm();
	}
	public SchoolsHomePageConfirm clickOnSchoolsHomePage()
	{
		//clickByXpath("//a[@id='tryhome']");
		
		clickByXpath(prop.getProperty("W3SchoolsHomeAlertPage.SchoolsHomePage.XPath"));
		
		return new SchoolsHomePageConfirm();
	}
	public SchoolsHomePageConfirm verifyNamePrinted(String data)
	{
		//verifyTextByXpath("//*[@id='demo']", data);
		
		verifyTextByXpath(prop.getProperty("W3SchoolsHomeAlertPage.NamePrinted.XPath"), data);
		
		return new SchoolsHomePageConfirm();
	}
	public SchoolsHomePageConfirm switchToDefaultContentSchool()
	{
		
		switchToDefaultContent();
				
		return new SchoolsHomePageConfirm();
	}
	 
	public SchoolsHomePageConfirm switchiframeResult()
	{
		switchToFameById(prop.getProperty("W3SchoolsHomeAlertPage.switchToiframeResult.XPath"));
		
		return new SchoolsHomePageConfirm();
	}

}
