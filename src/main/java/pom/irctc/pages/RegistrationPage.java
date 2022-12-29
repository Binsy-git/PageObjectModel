package pom.irctc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	public RegistrationPage clickTabReg()
	{
		clickTab();
		return this;
		
	}
	
	public RegistrationPage enterUserName(String data) {
		
		enterByXpath("//input[@id='userName']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterPassword(String data) {
		
		enterByXpath("//input[@id='usrPwd']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterConfPassword(String data) {
		
		enterByXpath("//input[@id='cnfUsrPwd']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage selectPrefLang(String data) {
		
		clickByXpath("//span[text()='Preferred Language']/..");
		
		//clickByXpath("(//span[text()='"+data+"']/..)[2]");
		clickByXpath("//li[@class='ui-dropdown-item ui-corner-all']/span");
		
		return new RegistrationPage();
	}
	
	public RegistrationPage selectSecQn(String data) {
		
		clickByXpath("//span[text()='Security Question']");
		
		clickByXpath("//span[text()='"+data+"']");
		
		return new RegistrationPage();
    }
	
	public RegistrationPage enterAns(String data) {
		
		
		enterByXpath("//input[@placeholder='Security Answer']",data);
		
		return new RegistrationPage();
    }
	
	public RegistrationPage clickContinue()
	{
		clickByXpath("//button[contains(text(),'Continue')]");
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterFirstName(String data)
	{
		enterByXpath("//input[@id='firstName']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterMiddleName(String data)
	{
		enterByXpath("//input[@id='middleName']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterLastName(String data)
	{
		enterByXpath("//input[@id='lastname']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage clickOnOccupation(String data)
	{
		clickByXpath("//span[text()='Select Occupation']");
		
		clickByXpath("//span[text()='"+data+"']");
		
		return new RegistrationPage();
	}
	
	
	
	
	public RegistrationPage selectDOB(String day,String month,String year)
	{
	   clickByXpath("//input[@placeholder='Date Of Birth']");
	
     //  clickByXpath("//option[text()='"+year+"']");
    
	   clickByXpath("//option[text()='"+month+"']");

	   clickByXpath("//a[text()='"+day+"']");
	 
	   return new RegistrationPage();
	}
	
	public RegistrationPage clickOnMaritalStatus(String maritalStatus)
	{
		clickByXpath("//label[text()='"+maritalStatus+"']/..");
		
		return new RegistrationPage();
	}
	
	public RegistrationPage clickOnCountry(int index)
	{
		
       	selectIndexByXpath("(//select[@formcontrolname='nationality'])", 95);
		return new RegistrationPage();
		
		
	}
	
	public RegistrationPage clickOnGender(String gender)
	{
		clickByXpath("//span[text()='"+gender+"']/..");
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterEmail(String data)
	{
		enterByXpath("//input[@id='email']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterMobile(String data)
	{
		enterByXpath("//input[@id='mobile']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage clickNationality()
	{
		selectIndexByXpath("(//option[text()='Select a Nationality']/..",95);
		
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterResAddress1(String data)
	{
		enterByXpath("//input[@id='resAddress1']","test");
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterResAddress2(String data)
	{
		enterByXpath("//input[@id='resAddress2']",data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterResAddress3(String data)
	{
		enterByXpath("//input[@id='resAddress3']",data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterResPinCode(String data)
	{
		enterByXpath("//input[@id='resPinCode']",data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage clickResCity(int index)
	{
		clickByXpath("(//select[@formcontrolname='resCity']/option)[2]");
		//selectIndexByXpath("//select[@formcontrolname='resCity']",index);
		//actionClick("//select[@formcontrolname='resCity']");
		return new RegistrationPage();
	}
	
	public RegistrationPage enterResPostOff(String data)
	{
		
	//	enterByXpath("//select[@formcontrolname='resPostOff']", data);
		enterByXpath("//input[@name='resPinCode' and @name='resPinCode' and @placeholder='Pin code']", data);
		return new RegistrationPage();
	}
	
	public RegistrationPage clickResState()
	{
		
	//	enterByXpath("//select[@formcontrolname='resPostOff']", data);
		clickByXpath("//input[@name='resState']");
		return new RegistrationPage();
	}
	
	public RegistrationPage enterResPhone(String data)
	{
		enterByXpath("//input[@id='resPhone']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage clickOfficeAdd()
	{
		clickByXpath("(//span[@class='ui-radiobutton-icon ui-clickable']/following::label)[4]/..");
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterOfficeAdd1(String data)
	{
		enterByXpath("//input[@id='offAddress1']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterOfficeAdd2(String data)
	{
		enterByXpath("//input[@id='offAddress2']", data);
		
		return new RegistrationPage();
	}
	
	public RegistrationPage selectOffCountry()
	{
		clickByXpath("//div[@class='ui-dropdown-label-container ng-tns-c65-18']/span");
		
		clickByXpath("//li[@aria-label='India']/span");
		
		clickTab();
		
		return new RegistrationPage();
	}
	
	public RegistrationPage enterOffPinCode(String data)
	{
        enterByXpath("//input[@id='offPinCode']", data);
					
		return new RegistrationPage();
	}
	
	public RegistrationPage enterOffState(String data)
	{
		enterByXpath("//input[@id='offState']", data);
					
		return new RegistrationPage();
	}

	public RegistrationPage clickOffState()
	{
		clickByXpath("//input[@name='offState']");
					
		return new RegistrationPage();
	}
public RegistrationPage clickOffCity()
	{
	    clickByXpath("(//select[@formcontrolname='offCity']/option)[2]");
		//selectIndexByXpath("//select[@formcontrolname='offCity']", index);			
		return new RegistrationPage();
	}
	public RegistrationPage clickOffPostOffice(int data)
	{
		//selectIndexByXpath("//select[@formcontrolname='offCity']", data);
		clickByXpath("(//select[@formcontrolname='resPostOff']/option)[2]");
		return new RegistrationPage();
	}
	public RegistrationPage enterOffPhone(String data)
	{
		enterByXpath("//input[@id='offPhone']", data);
					
		return new RegistrationPage();
	}
	
	public RegistrationPage pageDownR()
	{
	pageDown();
	
	return new RegistrationPage();
	}
	
	public RegistrationPage scrollTillTermCond1()
	{
		String we ="//input[@id='sbi']"; 
		
		return this; 
	
	}
	
	public RegistrationPage clickTermCond1()
	{
		clickByXpath("//input[@id='sbi']");
					
		return new RegistrationPage();
	}
	
	public RegistrationPage clickTermCond2()
	{
		clickByXpath("//input[@formcontrolname='termCondition']");
					
		return new RegistrationPage();
	}

}
