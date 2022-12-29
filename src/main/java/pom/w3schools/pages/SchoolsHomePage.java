package pom.w3schools.pages;

import wrappers.GenericWrappers;

public class SchoolsHomePage extends GenericWrappers{
	
	public SchoolsHomePage clickOnTryIt()
	
	{
		clickByXpath("/html/body/button");
		
	//	clickByXpath(prop.getProperty("W3SchoolsHomePage.TryIt.XPath"));
		
		return this;
	}
	public SchoolsHomePage enterAlertText(String data)
	{
		//waitProperty(5000);
		acceptAlerts(data);		
			
		return new SchoolsHomePage();
	}
	public SchoolsHomePage getAlertTxt()
	{
		getAlertText();
		
		return new SchoolsHomePage();
	}
	public SchoolsHomePage acceptAlt()
	{
		waitProperty(5000);
		
		acceptAlert();
		
		//switchToDefaultContent();
		
		//
		
		return new SchoolsHomePage();
	}
	public SchoolsHomePage DismissAlt()
	{
		//waitProperty(5000);
		
		//switchToDefaultContent();
		
		dismissAlert();
		
		return new SchoolsHomePage();
	}
	public SchoolsHomePage clickOnSchoolsHomePage()
	{
		//clickByXpath("//a[@id='tryhome']");
		
		clickByXpath(prop.getProperty("W3SchoolsHomePage.SchoolsHomePage.XPath"));
		
		return new SchoolsHomePage();
	}
	public SchoolsHomePage verifyNamePrinted(String data)
	{
		//verifyTextByXpath("//*[@id=\"demo\"]", data);
		
		//verifyTextByXpath("//*[@id='demo']", data);
		
		verifyTextByXpath(prop.getProperty("W3SchoolsHomePage.NamePrinted.XPath"),data);
		
		return new SchoolsHomePage();
	}
	public SchoolsHomePage switchToDefaultContentSchool()
	{
		
		switchToDefaultContent();
				
		return new SchoolsHomePage();
	}
	 
	public SchoolsHomePage switchiframeResult()
	{
		//switchToFameById("iframeResult");
		
		switchToFameById(prop.getProperty("W3SchoolsHomePage.NamePrinted.Id"));
		
		return new SchoolsHomePage();
	}

}
