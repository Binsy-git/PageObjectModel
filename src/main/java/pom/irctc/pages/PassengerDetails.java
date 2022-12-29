package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetails extends GenericWrappers {
	
	public PassengerDetails selectTitle(String data)
	{
		//selectValueByXpath("(//select[@name='title'])",data);
		
		selectIndexByName("title", 2);
		
		return new PassengerDetails();
	}
	public PassengerDetails enterFirstName(String data)
	{
		enterByXpath("//input[@name='firstName']",data);
		
		return new PassengerDetails();
	}
	public PassengerDetails enterLastName(String data)
	{
		enterByXpath("//input[@name='lastName']",data);
		
		return new PassengerDetails();
	}
	public PassengerDetails selectCountry(String data)
	{
		selectVisibleTextByXpath("(//select[@name='country'])",data);
		
		
		return new PassengerDetails();
	}
	public PassengerDetails selectState(String data)
	{
		selectValueByName("state", data);
				
		return new PassengerDetails();
	}
	public PassengerDetails enterMobile(String data)
	{
		waitProperty(3000);
		
		enterByXpath("//input[@name='mobileNo']", data);
		
		return new PassengerDetails();
	}
	public PassengerDetails enterEmail(String data)
	{
		waitProperty(3000);
		
		enterByXpath("//input[@name='email']", data);
		
		return new PassengerDetails();
	}
	public PassengerDetails selectGST(String data)
	{
		selectVisibleTextByXpath("(//select[@name='gst'])",data);
		
		return new PassengerDetails();
	}
	
	public PassengerDetails enterGST(String data)
	{
		waitProperty(5000);
		
		enterByName("gstNumber", data);
		
		return new PassengerDetails();
	}
	public PassengerDetails enterCompanyName(String data)
	{
		
		
		enterByXpath("//input[@name='companyName']", data);
		
		return new PassengerDetails();
	}
	public PassengerDetails enterCompanyAddress(String data)
	{
		enterByXpath("//input[@name='companyAddress']", data);
		
		return new PassengerDetails();
	}
	public HotelBookingSummary clickContinue()
	{
		pageDown();
		
		clickByXpath("//button[text()='Continue']");
		
		return new HotelBookingSummary();
	}
	
	public PassengerDetails verifyHotelTitle(String data)
	{
		verifyTextByXpath("//div[@class='mid-searchpack']/h5", data);
		
		return new PassengerDetails();
	}
	public PassengerDetails verifyGstNo(String data)
	{
		verifyTextByXpath("(//input[@name='gstNumber']/following::span)[1]", data);
		
		return new PassengerDetails();
	}
	public PassengerDetails verifyAmount(String data)
	{
		verifyTextByXpath("//div[@class='faredetails-in faredetails-in-total']/strong", data);
				
		return new PassengerDetails();
	}
	

}
