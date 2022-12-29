package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailedDescription extends GenericWrappers{
	
	public PassengerDetails clickContinueToBook()
	{
		switchToLastWindow();
		
		clickByXpath("//*[text()='Continue to Book']/..");
		
		return new PassengerDetails();
	}

}
