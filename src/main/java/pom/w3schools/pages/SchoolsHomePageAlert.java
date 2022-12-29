package pom.w3schools.pages;

import wrappers.GenericWrappers;

public class SchoolsHomePageAlert extends GenericWrappers{
	
	public SchoolsHomePageAlert clickOnTryIt()
	
	{
		clickByXpath("//*[text()='Try it']");
		
		//clickByXpath(prop.getProperty("W3SchoolsHomeAlertPage.TryIt.XPath"));
		
		return new SchoolsHomePageAlert();
	}
	public SchoolsHomePageAlert enterAlertText(String data)
	{
		acceptAlerts(data);		
			
		return new SchoolsHomePageAlert();
	}
	public SchoolsHomePageAlert getAlertTxt()
	{
		getAlertText();
		
		return new SchoolsHomePageAlert();
	}
	public SchoolsHomePageAlert acceptAlt()
	{
		//waitProperty(5000);
		
		acceptAlert();
		
		//switchToDefaultContent();
		
		//
		
		return new SchoolsHomePageAlert();
	}
	public SchoolsHomePageAlert DismissAlt()
	{
		//waitProperty(5000);
		
		//switchToDefaultContent();
		
		dismissAlert();
		
		return new SchoolsHomePageAlert();
	}
	public SchoolsHomePageAlert clickOnSchoolsHomePage()
	{
		clickByXpath("//a[@id='tryhome']");
		
		//clickByXpath(prop.getProperty("W3SchoolsHomeAlertPage.NamePrinted.XPath"));
		
		return new SchoolsHomePageAlert();
	}
	public SchoolsHomePageAlert verifyNamePrinted(String data)
	{
		//verifyTextByXpath("//*[@id=\"demo\"]", data);
		
		verifyTextByXpath("//*[@id='demo']", data);
		
		//verifyTextByXpath(prop.getProperty("W3SchoolsHomeAlertPage.NamePrinted.XPath"),data);
		
		return new SchoolsHomePageAlert();
	}
	public SchoolsHomePageAlert switchToDefaultContentSchool()
	{
		
		switchToDefaultContent();
				
		return new SchoolsHomePageAlert();
	}
	 
	public SchoolsHomePageAlert switchiframeResult()
	{
		switchToFameById("iframeResult");
		
		//switchToFameById(prop.getProperty("W3SchoolsHomeAlertPage.switchToiframeResult.XPath"));
		
		return new SchoolsHomePageAlert();
	}

}
