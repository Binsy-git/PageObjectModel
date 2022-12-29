package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Hotels extends GenericWrappers{

	public Hotels clickLogin()
	{
		switchToLastWindow();
		
		clickByXpath("//a[text()='Login']");
		
		return new Hotels();
	}
	public Hotels GuestUserLoginTab()
	{
		switchToLastWindow();
		
		clickByXpath("//a[contains(text(),'Guest User Login')]");
		
		return new Hotels();
	}
	public Hotels enterEmail(String data)
	{
		switchToLastWindow();
		
		enterByXpath("//input[@name='email']",data);
		
		return new Hotels();
	}
	public Hotels enterMobile(String data)
	{
		switchToLastWindow();
		
		enterByXpath("//input[@name='mobileNo']",data);
		
		return new Hotels();
	}
	public Hotels GuestUserLogin()
	{
		switchToLastWindow();
		
		clickByXpath("(//button[text()='Login'])[2]");
		
		return new Hotels();
	}
	public Hotels enterCityHotelName(String data)
	{
		waitProperty(5000);
		enterByXpath("//input[@id='filterText']",data);
		waitProperty(5000);
		clickTab();
		clickByXpath("((//strong[text()='City'])/..)[1]");
				
		return new Hotels();
	}
	public Hotels selectFromDate(String data)
	{
		clickByXpath("//button[@aria-label='Next month']");
		
		clickByXpath("//input[@name='dt12']");
		
		clickByXpath("//span[text()='"+data+"']");
			    
		return new Hotels();
	}
	public Hotels selectToDate(String data)
	{
		clickByXpath("//input[@name='dt13']");
		
		clickByXpath("//span[text()='"+data+"']");
			    
		return new Hotels();
	}
	public Hotels clickRoomGuest()
	{
		clickTab();
		clickByXpath("//input[@name='guest']");
		
		return new Hotels();
	}
	public Hotels selectHotelRoom(String data)
	{
		selectValueByName("hotelRoom", data);
		return new Hotels();
	}
	public Hotels selectAdultRoom(String data)
	{
		selectValueByName("hotelAdult", data);
		return new Hotels();
	}
	public Hotels clickRoomSelectionDone()
	{
		waitProperty(3000);
		
		//pageDown();
		clickTab();
		
		clickByXpath("//button[text()='Done']");
		
		return new Hotels();
	}
	
	public HotelDetails clickFindHotelButton()
	{
		clickByXpath("//button[contains(text(),'Find Hotel')]");
		
		return new HotelDetails();
	}
	
	
}
