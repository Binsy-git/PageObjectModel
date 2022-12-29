package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Charter extends GenericWrappers{
	
	public Charter clickEnquiryForm()
	{
		clickByXpath("//a[text()='Enquiry Form']");
		
		return new Charter();
	}
	public Charter enterName(String data)
	{
		enterByXpath("//input[@name='name' and @placeholder='Name of Applicant']", data);
		
		return new Charter();
	}
	public Charter enterOrganisation(String data)
	{
		enterByXpath("//input[@name='organization' and @placeholder='Name of Organisation']", data);
		
		return new Charter();
	}
	public Charter enterAddress(String data)
	{
		enterByXpath("//input[@name='address' and @placeholder='Address']", data);
		
		return new Charter();
	}
	public Charter enterMobile(String data)
	{
		enterByXpath("//input[@name='mobile' and @placeholder='Mobile*']", data);
		
		return new Charter();
	}
	public Charter enterEmail(String data)
	{
		enterByXpath("//input[@name='email']", data);
		
		return new Charter();
	}
	public Charter selectRequest(String data)
	{
		selectVisibleTextByXpath("//select[@name='requestFor']", data);
		
		return new Charter();
	}
	public Charter enterOrginStation(String data)
	{
		enterByXpath("//input[@name='originStation']", data);
		
		return new Charter();
	}
	public Charter enterDestinationStation(String data)
	{
		enterByXpath("//input[@name='destnStation']", data);
		
		return new Charter();
	}
	public Charter selectDepartureDate()
	{
		clickByXpath("//input[@name='checkInDate']");
		
		clickByXpath("(//select[@name='requestFor']/option)[2]");
		
		clickByXpath("//select[@class='ng-valid ng-dirty ng-touched']");
		
		clickByXpath("//select[@class='ng-valid ng-dirty ng-touched']/option[@value='2022']");
		
		//Month
		
		
		clickByXpath("//td[@class='date']/span[text()='10']");
				
		return new Charter();
	}
	public Charter selectArrivalDate()
	{
		clickByXpath("//input[@name='checkOutDate']");
		
		clickByXpath("(//select[@name='requestFor']/option)[2]");
		
		clickByXpath("(//i[@class='fa fa-angle-right'])[1]");
					
		clickByXpath("//td[@class='date']/span[text()='10']");
				
		return new Charter();
	}
	public Charter enterDuration(String data)
	{
		enterByXpath("//input[@name='durationPeriod']", data);
		
		return new Charter();
	}
	public Charter entercoachDetails(String data)
	{
		enterByXpath("//input[@name='coachDetails']", data);
		
		return new Charter();
	}
	public Charter enterNumberOfPassengers(String data)
	{
		enterByXpath("(//input[@name='numPassenger'])[1]", data);
		
		return new Charter();
	}
	public Charter enterCharterPurpose(String data)
	{
		enterByName("charterPurpose", data);
		
		return new Charter();
	}
	public Charter enterServices(String data)
	{
		enterByName("charterPurpose", data);
		
		return new Charter();
	}
	public Charter getMobileErrorMsg(String text)
	{
		verifyTextByXpath("(//input[@name='mobile']/following::span)[1]", text);
		
		return new Charter();
	}
	public Charter clickSubmit()
	{
		clickByXpath("//button[contains(text(),'Submit')]");
		
		return new Charter();
		
	}
		
}
	


