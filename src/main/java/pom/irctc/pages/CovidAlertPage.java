package pom.irctc.pages;

import pom.facebook.pages.FaceBookCreateAccount;
import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{
	
	public CovidAlertPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public HomePage clickOnOK() {
		//clickByXpath("//button[@class='btn btn-primary']");
		return new HomePage();
	}

	
	
}
