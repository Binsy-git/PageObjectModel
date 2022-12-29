package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage sideMenuClick()
	{
		switchToLastWindow();
        
        clickByXpath("//a[@id='sidebarCollapse' and @class='nav-link loginicon']");
        
        return new AccommodationPage();
	}
	public TrainCharterPage bookYourCoachMenuClick()
	{
		switchToLastWindow();
        
        clickByXpath("//a[text()='Book Your Coach/Train']");
        
        return new TrainCharterPage();
	}
	public TrainCharterPage switchWindow()
	{
		switchToLastWindow();
        
       // clickByXpath("//a[text()='Book Your Coach/Train']");
        
        return new TrainCharterPage();
	}
	public Charter charterMenuClick()
	{
		switchToLastWindow();
        
        clickByXpath("//a[text()='Charter']");
        
        return new Charter();
	}
	public Hotels hotelsMenuClick()
	{
		switchToLastWindow();
		
		clickByXpath("//span[text()='Hotels']/..");
		
		return new Hotels();
	}
	
}
