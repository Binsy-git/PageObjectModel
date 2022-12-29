package pom.irctc.pages;

import pom.facebook.pages.FaceBookCreateAccount;
import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	
	
	public RegistrationPage clickOnRegister() {
		
		clickByXpath("//a[contains(text(),'REGISTER')]");
		
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		//mouseHoverByXPath("");
		clickByXpath("//a[contains(text(),'HOLIDAYS')]");
		
		return this;
	}
	
	public HomePage mouseHoverOnStays() 
	{
		//mouseHoverByXPath("");
		clickByXpath("//span[contains(text(),'Stays')]");
		
		return this;
	}	
	public AccommodationPage clickOnLounge()
	{
		clickByXpath("//span[text()='Lounge']/..");
		
		return new AccommodationPage();
	}
	public AccommodationPage menuClick()
	{
		clickByXpath("//a[@id='sidebarCollapse']");
		
		return new AccommodationPage();
	}
	
	
	
}
