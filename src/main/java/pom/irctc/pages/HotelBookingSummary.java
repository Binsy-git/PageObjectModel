package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingSummary extends GenericWrappers{
	
	public HotelBookingSummary clickAgree()
	{
		clickByXpath("//input[@name='agree']/following::span");
		
		return new HotelBookingSummary();
	}
	public HotelBookingSummary clickMakePayment()
	{
		clickByXpath("//button[text()='Make Payment']");
		
		return new HotelBookingSummary();
	}
	public HotelBookingSummary clickVerifyOTP()
	{
		clickByXpath("//button[text()='Verify']");
		
		return new HotelBookingSummary();
	}
	public HotelBookingSummary verifyOTPErrMsg(String data)
	{
		verifyTextByXpath("(//input[@name='otp']/following::span)[1]", data);
		
		return new HotelBookingSummary();
	}
	public PassengerDetails verifyGstNo(String data)
	{
		verifyTextByXpath("(//input[@name='gstNumber']/following::span)[1]", data);
		
		return new PassengerDetails();
	}

}
