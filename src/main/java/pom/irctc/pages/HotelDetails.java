package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetails  extends GenericWrappers
{
	public HotelDetails getHotelName()
	{
		getTextByXpath("(//div[@class='mid-searchpack']/h5)[1]");
				
		return new HotelDetails();
	}
	public HotelDetails getPrice()
	{
		getTextByXpath("(//div[@class='right-searchpack']/strong)[1]");
		
		//getTextByXpath("//div[@class='select-guest-wrap']/div/div/div/strong");
				
		return new HotelDetails();
	}
	public HotelDetailedDescription clickOnBookFirstHotelDisplay()
	{
		clickByXpath("(//div[@class='col-12 col-md-2'])[1]");
		
		return new HotelDetailedDescription();
	}
	

}
