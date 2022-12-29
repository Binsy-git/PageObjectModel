package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBooking extends GenericWrappers{
	
	public HotelBooking clickContinueToBook()
	{
		clickByXpath("//b[text()='Continue to Book']/..");
		
		return new HotelBooking();
	}
	

}
