package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

@SuppressWarnings("unused")
public class GenericWrappers extends Reporting implements Wrappers {

	public static RemoteWebDriver driver ;
	
	public static Properties prop = null;
	
	public void loadObjects() {
		 prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void unloadObjects() {
		prop=null;
	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" successfully");
			
			reportStep("The browser "+browser+" is launched with the given url "+url+" successfully", "pass");
			
		} catch (SessionNotCreatedException e) {
			
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
			
		} catch (InvalidArgumentException e) {
			
			//System.err.println("The browser "+browser+" is not launched as the url does not contain http/https");
			
			reportStep("The browser "+browser+" is not launched as the url does not contain http/https", "fail");
		} catch (WebDriverException e) {
			
			//System.err.println("The browser "+browser+" is not launched due to unknonwn error");
			
			reportStep("The browser "+browser+" is not launched due to unknonwn error", "fail");
		} 
		
		
	}

	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			reportStep("The element with id "+idValue+" is entered with data "+data,"pass");
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			reportStep("The element with id "+idValue+" is not found in the DOM","fail");
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
		} catch (ElementNotVisibleException e) {
			reportStep("The element with id "+idValue+" is not visible in the application","fail");
			//System.err.println("The element with id "+idValue+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			reportStep("The element with id " + idValue + " is not interactable in the DOM","fail");
			//System.err.println("The element with id " + idValue + " is not interactable in the DOM");
		} catch (StaleElementReferenceException e) {
			reportStep("The element with id " + idValue + " is not stable in the DOM ","fail");
			//System.err.println("The element with id " + idValue + " is not stable in the DOM ");
		} catch (WebDriverException e) {
			reportStep("The element with id " + idValue + " has encountered unknown error","fail");
			//System.err.println("The element with id " + idValue + " has encountered unknown error");
		} 
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			reportStep("The element with name "+ nameValue + " is entered with data " + data,"pass") ;
			//System.out.println("The element with name "+ nameValue + " is entered with data " + data) ;
		}catch(NoSuchElementException e)
		{
			reportStep("The element with name" +nameValue + " is not found in the DOM","fail");
			//System.err.println("The element with name" +nameValue + " is not found in the DOM");
		}catch(ElementNotVisibleException e)
		{
			reportStep("The element with name " +nameValue + " is not visible in the DOM","fail");
			//System.err.println("The element with name " +nameValue + " is not visible in the DOM");
		}catch(ElementNotInteractableException e)
		{
			reportStep("The element with name "+ nameValue + " is not interactable in the DOM","fail");
			
			//System.err.println("The element with name "+ nameValue + " is not interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with name " + nameValue + " is not stable in the DOM","fail");
			//System.err.println("The element with name " + nameValue + " is not stable in the DOM");
		}catch(WebDriverException e)
		{
			reportStep("The element with name " + nameValue + "has encountered unknown error ","fail");
			//System.err.println("The element with name " + nameValue + "has encountered unknown error ");
			
		}
		
	}
	public void getTextById(String xpathValue, String data) {
		// TODO Auto-generated method stub
	  try {
		  driver.findElementByXPath(xpathValue).sendKeys(data);
		  reportStep("The element with xpath " +xpathValue +" is entered with data " + data,"pass");
		 // System.out.println("The element with xpath " +xpathValue +" is entered with data " + data);
		  
	  }catch(NoSuchElementException e)
	  {
		  reportStep("The element with xpath " +xpathValue+ " is not found in DOM  ","fail");
		//  System.err.println("The element with xpath " +xpathValue+ " is not found in DOM  ");
	  }catch(ElementNotVisibleException e)
	  {
		  reportStep("The element with xpath " +xpathValue+ " is not visible in the DOM","fail");
		  //System.err.println("The element with xpath " +xpathValue+ " is not visible in the DOM");
	  }catch(ElementNotInteractableException e)
	  {
		  reportStep("The element with xpath " + xpathValue + " is not Interactable in the DOM","fail");
		  //System.err.println("The element with xpath " + xpathValue + " is not Interactable in the DOM");
	  }catch(StaleElementReferenceException e)
	  {
		  reportStep("The element with xpath " +xpathValue + " is not Stable in the DOM","fail" );
		 // System.err.println("The element with xpath " +xpathValue + " is not Stable in the DOM" );
	  }catch(WebDriverException e )
	  {
		  reportStep("The element with xpath " + xpathValue + "has encountered unknown error ","fail");
		 // System.err.println("The element with xpath " + xpathValue + "has encountered unknown error ");
	  }
	  
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try
		{
			String actualtitle =  driver.getTitle();
		if (actualtitle.equals(title))
		{
			reportStep("The Title of the page  "+actualtitle+" is matched with expected title "+title,"pass");
			//System.out.println("The Title of the page  "+actualtitle+" is matched with expected title "+title);
		}
		else 
		{
			reportStep("The Title of the page  "+actualtitle+" is not matched with expected title "+title,"fail");
			//System.err.println("The Title of the page  "+actualtitle+" is not matched with expected title "+title);
		}
		}catch(WebDriverException e)
		{
			reportStep("The title of the page is not verified due to unknown error","fail");
			//System.err.println("The title of the page is not verified due to unknown error");
		}
		
			
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		try
		{
			String actualtext = driver.findElementById(id).getText();
		if(actualtext.equals(text))
		{
			reportStep("The element with id " + id + " is holding the text " + actualtext +" is  matched with the expected text " + text ,"pass");
		//	System.out.println("The element with id " + id + " is holding the text " + actualtext +" is  matched with the expected text " + text );
						
		}else
		{
			reportStep("The element with id " + id + " is holding the text " + actualtext +" is not matched with the expected text " + text ,"fail");
			//System.out.println("The element with id " + id + " is holding the text " + actualtext +" is not matched with the expected text " + text );
		}
		}catch(NoSuchElementException e)
		{
			reportStep("The element with id" + id + "id not found in the DOM","fail");
			//System.err.println("The element with id" + id + "id not found in the DOM");
			
		}catch(ElementNotVisibleException e)
		{
			reportStep("The element with id " + id + " is not visible in the DOM","fail");
			//System.err.println("The element with id " + id + " is not visible in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with id " + id + " is not stable in the DOM","fail");
			//System.err.println("The element with id " + id + " is not stable in the DOM");
			
		}catch(ElementNotInteractableException e)
		{
			reportStep("The element with id " + id + " is not interactable","fail");
			//System.err.println("The element with id " + id + " is not interactable");
		}
		
		catch(WebDriverException e)
		{
			reportStep("The Text is not verified due to unknown error  ","fail");
			//System.err.println("The Text is not verified due to unknown error  " );
		}
				
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {		
			
		String actualtext = driver.findElementByXPath(xpath).getText();
		if (actualtext.contains(text))
		{
			reportStep("The element with Xpath " + xpath + " is holding the text " + actualtext +" is  matched with the expected text " + text ,"pass");
			//System.out.println("The element with Xpath " + xpath + " is holding the text " + actualtext +" is  matched with the expected text " + text );
			
		}else
		{
			reportStep("The element with Xpath " + xpath + " is holding the text " + actualtext +" is not matched with the expected text " + text ,"fail");
			//System.err.println("The element with Xpath " + xpath + " is holding the text " + actualtext +" is not matched with the expected text " + text );
		}
		}catch(NoSuchElementException e)
		{
			reportStep("The element with xpath "+ xpath + " is not found in DOM","fail");
			//System.err.println("The element with xpath "+ xpath + " is not found in DOM");
		}catch(ElementNotVisibleException e)
		{
			reportStep("The element with xpath "+ xpath +  " is not visible in DOM","fail");
			//System.err.println("The element with xpath "+ xpath + " is not visible in DOM");
		
		}catch(StaleElementReferenceException e)
		{

			reportStep("The element with xpath "+xpath + " is not Stable in DOM","fail");
			
			//System.err.println("The element with xpath "+xpath + " is not Stable in DOM");
		}
		catch(WebDriverException e)
		{
			reportStep(" The Text is not verified due to Unknown error ","fail");
			//System.err.println(" The Text is not verified due to Unknown error ");
		}
		
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try
		{
			String actualtext=driver.findElementByXPath(xpath).getText();
		if(actualtext.contains(text))
		{
			reportStep("The Element with Xpath " + xpath + " holding the text " + actualtext + "contains the text " + text,"pass");
			//System.out.println("The Element with Xpath " + xpath + " holding the text " + actualtext + "contains the text " + text);
		}
		else 
		{
			reportStep("The Element with Xpath " + xpath + " holding the text " + actualtext + " does not contains the text " + text,"fail");
			//System.err.println("The Element with Xpath " + xpath + " holding the text " + actualtext + " does not contains the text " + text);
		}
		}catch(ElementNotVisibleException e)
		{ 
			reportStep("The element with xpath "+ xpath + " is not visible in DOM","fail");
			//System.err.println("The element with xpath "+ xpath + " is not visible in DOM");
		
		}catch(StaleElementReferenceException e)
		{
			reportStep("The element with xpath "+xpath + " is not Stable in DOM","fail");
			//System.err.println("The element with xpath "+xpath + " is not Stable in DOM");
		}
		
		catch(WebDriverException e)
		{
			reportStep("The Text is not verified due to Unknown error ","fail");
			//System.err.println("The Text is not verified due to Unknown error ");
		}	
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub

		try
		{
		    driver.findElementById(id).click();		    
			reportStep("The Element with id " + id + " is clicked","pass");
		    
			//System.out.println("The Element with id " + id + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with id " + id + " is not found in the DOM","fail");
			//System.err.println("The Element with id " + id + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with id " + id + " is not Visible in the DOM","fail");
			//System.err.println("The Element with id " + id + " is not Visible in the DOM");
		}catch(ElementClickInterceptedException e)
		{
			reportStep("The element with id "+ id  + " is not clickable in DOM","fail");
			//System.err.println("The element with id "+ id  + " is not clickable in DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with id " + id + " is interactable in the DOM","fail");
			//System.err.println("The Element with id " + id + " is interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with id " + id  + " is not stable in the DOM","fail");
			//System.err.println("The Element with id " + id  + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with Id " + id + " is not clicked due to Unknown Error","fail");
			//System.err.println("The Element with Id " + id + " is not clicked due to Unknown Error");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try
		{
		driver.findElementByClassName(classVal).click();
		reportStep("The Element with Class Name " + classVal + " is clicked","pass");
		//System.out.println("The Element with Class Name " + classVal + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with  Class Name " + classVal + " is not found in the DOM","fail");
			//System.err.println("The Element with  Class Name " + classVal + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			
			reportStep("The Element with Class Name " + classVal + " is not Visible in the DOM","fail");
			//System.err.println("The Element with Class Name " + classVal + " is not Visible in the DOM");
		}
		catch(ElementClickInterceptedException e)
		{
			reportStep("The element with class name  "+classVal + " is not clickable in DOM","fail");
			//System.err.println("The element with class name  "+classVal + " is not clickable in DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with Class Name " + classVal + " is Disabed in the DOM","fail");
			//System.err.println("The Element with Class Name " + classVal + " is Disabed in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with Class Name " + classVal + " is not stable in the DOM","fail");
			//System.err.println("The Element with Class Name " + classVal + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with class name " +classVal+" is not clicked due to Unknown Error","fail");
			//System.err.println("The Element with class name " +classVal+" is not clicked due to Unknown Error");
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try
		{
		
			driver.findElementByName(name).click();
		 	reportStep("The Element with Name " + name + " is clicked","pass");
	        //System.out.println("The Element with Name " + name + " is clicked");
		
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with  Name " + name + " is not found in the DOM","fail");
			//System.err.println("The Element with  Name " + name + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with Name " + name + " is not visible in the DOM","fail");
			//System.err.println("The Element with Name " + name + " is not visible in the DOM");
		}catch(ElementClickInterceptedException e)
		{
			reportStep("The Element with name "+ name  + " is not clickable in DOM","fail");
			//System.err.println("The Element with name "+ name  + " is not clickable in DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with Name " + name + " is interactable in the DOM","fail");
			//System.err.println("The Element with Name " + name + " is interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with  Name " + name + " is not stable in the DOM","fail");
			//System.err.println("The Element with  Name " + name + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with  name " +name+" is not clicked due to Unknown Error","fail");
			//System.err.println("The Element with  name " +name+" is not clicked due to Unknown Error");
		}
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try
		{
		driver.findElementByLinkText(name).click();
		reportStep("The Element with Link Name " + name + " is clicked","pass");
		//System.out.println("The Element with Link Name " + name + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with Link Name " + name + " is not found in the DOM","fail");
			
			//System.err.println("The Element with Link Name " + name + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with Link Name " + name + " is not Visible in the DOM","fail");
			//System.err.println("The Element with Link Name " + name + " is not Visible in the DOM");
		}
		catch(ElementClickInterceptedException e)
		{
			reportStep("The Element with name "+ name  + " is not clickable in DOM","fail");
			//System.err.println("The Element with name "+ name  + " is not clickable in DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with Link Name " + name + " is Disabed in the DOM","fail");
			//System.err.println("The Element with Link Name " + name + " is Disabed in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with Link Name " + name + " is not stable in the DOM","fail");
			//System.err.println("The Element with Link Name " + name + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with  name " +name+" is not clicked due to Unknown Error","fail");
			//System.err.println("The Element with  name " +name+" is not clicked due to Unknown Error");
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try
		{
		driver.findElementByLinkText(name).click();
		reportStep("The Element with Link Name " + name + " is clicked","pass");
		//System.out.println("The Element with Link Name " + name + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with Link Name " + name + " is not found in the DOM","fail");
			//System.err.println("The Element with Link Name " + name + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with Link Name " + name + " is not found in the DOM","fail");
			//System.err.println("The Element with Link Name " + name + " is not Visible in the DOM");
		}
		catch(ElementClickInterceptedException e)
		{
			reportStep("The Element with Link Name " + name + " is not found in the DOM","fail");
			//System.err.println("The element with link name "+ name  + " is not clickable in DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with Link Name " + name + " is not found in the DOM","fail");
			//System.err.println("The Element with Link Name " + name + " is interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with Link Name " + name + " is not found in the DOM","fail");
			//System.err.println("The Element with Link Name " + name   + " is not stable in the DOM");
			
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with Link Name " + name + " is not found in the DOM","fail");
			//System.err.println("The Element with  name " +name+" is not clicked due to Unknown Error");
		}
		
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		try
		{
			driver.findElementByXPath(xpathVal).click();
		
		reportStep("The Element with  " + xpathVal + " is clicked","pass",false);
		//System.out.println("The Element with  " + xpathVal + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with xpath " + xpathVal + " is not found in the DOM","fail");
		//	System.err.println("The Element with xpath " + xpathVal + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with xpath " + xpathVal + " is not Visible in the DOM","fail");
			//System.err.println("The Element with xpath " + xpathVal + " is not Visible in the DOM");
		}
		catch(ElementClickInterceptedException e)
		{
			reportStep("The element with xpath "+ xpathVal  + " is not clickable in DOM","fail");
			//System.err.println("The element with xpath "+ xpathVal  + " is not clickable in DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with xpath " + xpathVal + " is interactable in the DOM","fail");
			//System.err.println("The Element with xpath " + xpathVal + " is interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with xpath " + xpathVal  + " is not stable in the DOM","fail");
			//System.err.println("The Element with xpath " + xpathVal  + " is not stable in the DOM");
			
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with  xpath " +xpathVal+" is not clicked due to Unknown Error","fail");
			//System.err.println("The Element with  xpath " +xpathVal+" is not clicked due to Unknown Error");
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try
		{
		
			driver.findElementByXPath(xpathVal).click();		
			reportStep("The Element with  " + xpathVal + " is clicked","pass");
		    //System.out.println("The Element with  " + xpathVal + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with xpath " + xpathVal + " is not found in the DOM","fail");
			//System.err.println("The Element with xpath " + xpathVal + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with xpath " + xpathVal + " is not Visible in the DOM","fail");
			//System.err.println("The Element with xpath " + xpathVal + " is not Visible in the DOM");
		}
		catch(ElementClickInterceptedException e)
		{
			reportStep("The element with xpath "+ xpathVal  + " is not clickable in DOM","fail");
			//System.err.println("The element with xpath "+ xpathVal  + " is not clickable in DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with xpath " + xpathVal + " is interactable in the DOM","fail");
			//System.err.println("The Element with xpath " + xpathVal + " is interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with xpath " + xpathVal  + " is not stable in the DOM","fail");
			//System.err.println("The Element with xpath " + xpathVal  + " is not stable in the DOM");
			
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with  xpath " +xpathVal+" is not clicked due to Unknown Error","fail");
			//System.err.println("The Element with  xpath " +xpathVal+" is not clicked due to Unknown Error");
		}		
	}
	
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String strgetTextById = null;
		try
		{
		strgetTextById=driver.findElementById(idVal).getText();
		reportStep("The Element with id "+idVal+" is holding the text "+strgetTextById,"pass");
		//System.out.println("The Element with id "+idVal+" is holding the text "+strgetTextById);
		
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with id " + idVal + " is not found in the DOM","fail");
			//System.err.println("The Element with id " + idVal + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with id " + idVal + " is not visible in the DOM","fail");
			//System.err.println("The Element with id " + idVal + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with id " + idVal + " is disabed in the DOM","fail");
			//System.err.println("The Element with id " + idVal + " is disabed in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with id " + idVal  + " is not stable in the DOM","fail");
			//System.err.println("The Element with id " + idVal  + " is not stable in the DOM");
			
		}
		catch(WebDriverException e)
		{
			reportStep(" The Text could not captured for the Element with id " +idVal+" due to Unknown Error","fail");
			//System.err.println(" The Text could not captured for the Element with id " +idVal+" due to Unknown Error");
		}
		
		return strgetTextById;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub

		String strgetTextByXpath = null;
		
		try
		{
			strgetTextByXpath=driver.findElementByXPath(xpathVal).getText();
			
			reportStep("The Element with Xpath " + xpathVal + " is holding the text " + strgetTextByXpath,"pass");
		
		    //System.out.println("The Element with Xpath " + xpathVal + " is holding the text " + strgetTextByXpath);
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with XPath " + xpathVal + " is not found in the DOM","fail");
			//System.err.println("The Element with XPath " + xpathVal + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with XPath " + xpathVal + " is not Visible in the DOM","fail");
			//System.err.println("The Element with XPath " + xpathVal + " is not Visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with XPath " + xpathVal + " is disabed in the DOM","fail");
			//System.err.println("The Element with XPath " + xpathVal + " is disabed in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with XPath " + xpathVal + " is not stable in the DOM","fail");
			//System.err.println("The Element with XPath " + xpathVal + " is not stable in the DOM");
			
		}
		catch(WebDriverException e)
		{
			reportStep(" The Text could not captured for the Element with XPath " +xpathVal+" due to Unknown Error","fail");
			//System.err.println(" The Text could not captured for the Element with XPath " +xpathVal+" due to Unknown Error");
		}
		
		return strgetTextByXpath;
		
	}	

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try
		{
		
			WebElement we = driver.findElementById(id);
		
			Select se = new Select(we);
		
			se.selectByVisibleText(value);
			
			reportStep("The element with id " + id + " is selected with the Visible Text " + value ," pass");
		
			//System.out.println("The element with id " + id + " is selected with the Visible Text " + value);
		}catch(NoSuchElementException e)
		{
			reportStep("The element with id " + id + "does not exist in the DOM","fail");
			//System.err.println("The element with id " + id + "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with id " + id + " is not visible in the DOM","fail");
			//System.err.println("The element with id " + id + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with id " + id + " is disabled in the DOM","fail");
			//System.err.println("The element with id " + id + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with id " + id + "cannot be selected","fail");
			//System.err.println("The element with id " + id + "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with id " + id + " is not stable in the DOM","fail");
			//System.err.println("The element with id " + id + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with id " + id + " is not selected with the text value " + value + "due to unknown error","fail");
			//System.err.println("The element with id " + id + " is not selected with the text value " + value + "due to unknown error");
		}		
		
	}
		
	

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try
		{
		
			WebElement we = driver.findElementById(id);
		
			Select se = new Select(we);
		
			se.selectByIndex(value);
			
			reportStep("The element with id " + id + " is selected with the index value" + value,"pass");
		
			//System.out.println("The element with id " + id + " is selected with the index value" + value);
		}catch(NoSuchElementException e)
		{
			reportStep("The element with id " + id + "does not exist in the DOM","fail");
			//System.err.println("The element with id " + id + "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with id " + id + " is not visible in the DOM","fail");
			//System.err.println("The element with id " + id + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with id " + id + " is disabled in the DOM","fail");
			//System.err.println("The element with id " + id + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with id " + id + "cannot be selected","fail");
			//System.err.println("The element with id " + id + "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with id " + id + " is not stable in the DOM","fail");
			//System.err.println("The element with id " + id + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with id " + id + " is not selected with  index value " + value + "due to unknown error","fail");
			//System.err.println("The element with id " + id + " is not selected with  index value " + value + "due to unknown error");
		}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try
		{
		Set<String> strWindHandles=driver.getWindowHandles();
		for(String eachWin:strWindHandles)
		{
			reportStep("Parent Window Id " + eachWin,"pass");
			//System.out.println("Parent Window Id " + eachWin);
			driver.switchTo().window(eachWin);
			break;
		}
		reportStep("The driver has switched to parent window successfully","pass");
		//System.out.println("The driver has switched to parent window successfully");
		}catch(NoSuchWindowException e)
		{
			reportStep("No Such Window Exist to Switch","fail");
			//System.err.println("No Such Window Exist to Switch");
		}catch(SessionNotCreatedException e)
		{
			reportStep("No Such Session Exists","fail");
			//System.err.println("No Such Session Exists");
			
		}catch(WebDriverException e)
		{
			reportStep("Unknown Error Encountered while switching to parent window","fail");
			//System.err.println("Unknown Error Encountered while switching to parent window");
		}
		
			
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try
		{
		Set<String> strWindHandles=driver.getWindowHandles();
		for(String eachId:strWindHandles)
		{
			reportStep("Last Window Id " + eachId,"pass");
			
			//System.out.println("Last Window Id " + eachId);
			
			driver.switchTo().window(eachId);
			
		}
		reportStep("The driver has switched to Last Window Successfully","pass");
		
		//System.out.println("The driver has switched to Last Window Successfully");
		
		}catch(NoSuchWindowException e)
		{
			reportStep("No Such Window Exist to Switch","fail");
			//System.err.println("No Such Window Exist to Switch");
		}catch(SessionNotCreatedException e)
		{
			reportStep("No Such Session Exists","fail");
			//System.err.println("No Such Session Exists");
			
		}catch(WebDriverException e)
		{
			reportStep("Unknown Error encountered while switching to Last window","fail");
			//System.err.println("Unknown Error encountered while switching to Last window");
		}
		
			
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try
		{
		 
			waitProperty(3000);
			
			driver.switchTo().alert().accept();
			
			waitProperty(3000);
		
			reportStep("Alert is Accepted","pass",false);
			//System.out.println("Alert is Accepted");
			
		}catch(NoAlertPresentException e)
		{
			reportStep("No Alert To Accept","fail",false);
			//System.err.println("No Alert To Accept");
			
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown Error encountered  while Accepting Alert","fail",false);
			//System.err.println("Unknown Error encountered  while Accepting Alert");
		}
	
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			
		driver.switchTo().alert().dismiss();
		reportStep("The Alert Is Dismissed","pass",false);
		//System.out.println("The Alert Is Dismissed");
		}
		catch(NoAlertPresentException e)
		{
			reportStep("No Alert Present To Dismiss","fail",false);
			//System.err.println("No Alert Present To Dismiss");
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown Error encountered  while Dismissing Alert","fail",false);
			//System.err.println("Unknown Error encountered  while Dismissing Alert");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String strGetAlertText=null;
		try {
		strGetAlertText =driver.switchTo().alert().getText();
		
		reportStep("The Alert is holding the text " + strGetAlertText ,"pass" );
		//System.out.println("The Alert is holding the text " + strGetAlertText  );
		
		}
		catch(NoAlertPresentException e)
		{
			reportStep("No Alert Present ","fail" );
			System.err.println("No Alert Present ");
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown Error encountered while capturing Alert Text","fail" );
			//System.err.println("Unknown Error encountered while capturing Alert Text");
		}
		
		return strGetAlertText;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		File tmp ,dest;
		long number =0;
		try {
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			tmp = driver.getScreenshotAs(OutputType.FILE);
			dest = new File("./Result/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			reportStep("Input Output Error captured while Taking Screenshot","fail" );
			//System.err.println("Input Output Error captured while Taking Screenshot");
		}catch(WebDriverException e)
		{
			reportStep("Unknown Error encountered while Taking Screenshot ","fail" );
			//System.err.println("Unknown Error encountered while Taking Screenshot ");
		}
		
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try
		{
		driver.close();
		reportStep("Active Browser Closed ","pass", false);
		//System.out.println("Active Browser Closed ");
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown Error encountered while closing the browser ","fail", false);
			//System.err.println("Unknown Error encountered while closing the browser ");
		}
		
		}
	

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try
		{
		driver.quit();
		reportStep("All Browsers Closed ","pass", false);
		//System.out.println("All Browsers Closed ");
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown Error encountered while closing all the browsers ","fail", false);
			//System.err.println("Unknown Error encountered while closing all the browsers ");
		}
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	public void selectVisibleTextByXpath(String xpath, String visibletext) {
		// TODO Auto-generated method stub
		try
		{
		WebElement we = driver.findElementByXPath(xpath);
		Select se = new Select(we);
		se.selectByVisibleText(visibletext);
		
		reportStep("The element with xpath " + xpath + " is selected with the Visible Text " + visibletext," pass");
		
		//System.out.println("The element with xpath " + xpath + " is selected with the Visisble Text" + visibletext);
		}catch(NoSuchElementException e)
		{
			reportStep("The element with xpath " + xpath + "does not exist in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with xpath " + xpath + " is not visible in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with xpath " + xpath + " is disabled in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with xpath " + xpath + "cannot be selected","fail");
			//System.err.println("The element with xpath " + xpath + "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with xpath " + xpath + " is not stable in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with xpath " + xpath + " is not selected with  visible text " + visibletext + "due to unknown error","fail");
			//System.err.println("The element with xpath " + xpath + " is not selected with  visible text " + visibletext + "due to unknown error");
		}
		
	}

	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try
		{
		WebElement we = driver.findElementById(xpath);
		Select se = new Select(we);
		se.selectByValue(value);
		reportStep("The element with xpath " + xpath + " is selected with the  value" + value,"pass");
		//System.out.println("The element with xpath " + xpath + " is selected with the  value" + value);
		}catch(NoSuchElementException e)
		{
			reportStep("The element with xpath " + xpath + "does not exist in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with xpath " + xpath + " is not visible in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with xpath " + xpath + " is disabled in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with xpath " + xpath + "cannot be selected","fail");
			//System.err.println("The element with xpath " + xpath + "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with xpath " + xpath + " is not stable in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with xpath " + xpath + " is not selected with  value " + value + "due to unknown error","fail");
			//System.err.println("The element with xpath " + xpath + " is not selected with  value " + value + "due to unknown error");
		}
		
	}
	public void actionClick(String xpath)
	{
		Actions a = new Actions(driver);
		WebElement we ;
		we=driver.findElement(By.xpath(xpath));
		a.moveToElement(we).click().perform();
		
		
	}
	public void selectIndexByXpath(String xpath, int index) {
		// TODO Auto-generated method stub
		try
		{
		WebElement we = driver.findElementById(xpath);
		Select se = new Select(we);
		se.selectByIndex(index);
		reportStep("The element with xpath " + xpath + " is selected with the  index" + index,"pass");
		//System.out.println("The element with xpath " + xpath + " is selected with the  value" + value);
		}catch(NoSuchElementException e)
		{
			reportStep("The element with xpath " + xpath + "does not exist in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with xpath " + xpath + " is not visible in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with xpath " + xpath + " is disabled in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with xpath " + xpath + "cannot be selected","fail");
			//System.err.println("The element with xpath " + xpath + "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with xpath " + xpath + " is not stable in the DOM","fail");
			//System.err.println("The element with xpath " + xpath + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with xpath " + xpath + " is not selected with  value " + index + "due to unknown error","fail");
			//System.err.println("The element with xpath " + xpath + " is not selected with  value " + value + "due to unknown error");
		}
	
	}

	public void clickTab() {
		// TODO Auto-generated method stub
		try
		{
		driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown error encountered  clicking on the tab key","fail");
			//System.err.println("Unknown error encountered  clicking on the tab key");
		}
		}

	public void pageDown() {
		// TODO Auto-generated method stub
		try
		{
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown error encountered  clicking on the tab key","fail");
		//	System.err.println("Unknown error encountered  clicking on the tab key");
		}
	}

	public void clickByPartialLinkText(String partiallinktext) {
		// TODO Auto-generated method stub
		try
		{
		driver.findElementByPartialLinkText(partiallinktext).click();
		reportStep("The Element with Partial Link Text " + partiallinktext + " is clicked","pass");
		//System.out.println("The Element with Partial Link Text " + partiallinktext + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The Element with Partial Link Text " + partiallinktext + " is not found in the DOM","fail");
			//System.err.println("The Element with Partial Link Text " + partiallinktext + " is not found in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The Element with Partial Link Text " + partiallinktext + " is not Visible in the DOM","fail");
			//System.err.println("The Element with Partial Link Text " + partiallinktext+ " is not Visible in the DOM");
		}
		catch(ElementClickInterceptedException e)
		{
			reportStep("The Element with Partial Link Text " + partiallinktext  + " is not clickable in DOM","fail");
			//System.err.println("The Element with Partial Link Text " + partiallinktext  + " is not clickable in DOM");
			
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The Element with Partial Link Text " + partiallinktext + " is Disabed in the DOM","fail");
			//System.err.println("The Element with Partial Link Text " + partiallinktext + " is Disabed in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The Element with Partial Link Text " + partiallinktext + " is not stable in the DOM","fail");
			//System.err.println("The Element with Partial Link Text " + partiallinktext + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The Element with  Partial Link Text " + partiallinktext+" is not clicked due to Unknown Error","fail");
			//System.err.println("The Element with  Partial Link Text " + partiallinktext+" is not clicked due to Unknown Error");
		}
		
	}

	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try
		{
		WebElement we = driver.findElementById(id);
		Select se = new Select(we);
		se.selectByValue(value);
		reportStep("The element with id " + id + " is selected with the  value" + value,"pass");
		//System.out.println("The element with id " + id + " is selected with the  value" + value);
		}catch(NoSuchElementException e)
		{
			reportStep("The element with id " + id + "does not exist in the DOM","fail");
			//System.err.println("The element with id " + id + "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with id " + id + " is not visible in the DOM","fail");
			//System.err.println("The element with id " + id + " is not visible in the DOM");
			
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with id " + id + " is disabled in the DOM","fail");
			//System.err.println("The element with id " + id + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with id " + id + "cannot be selected","fail");
			//System.err.println("The element with id " + id + "cannot be selected");
			
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with id " + id + " is not stable in the DOM","fail");
			//System.err.println("The element with id " + id + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with id " + id + " is not selected with  value " + value + "due to unknown error","fail");
			//System.err.println("The element with id " + id + " is not selected with  value " + value + "due to unknown error");
		}
		
	}

	public void selectIndexByName(String name, int value) {
		// TODO Auto-generated method stub
		try
		{
		WebElement we = driver.findElementByName(name);
		
		Select se = new Select(we);
		
		se.selectByIndex(value);
		//System.out.println("The element with name " + name + " is selected with the index value" + value);
		
		reportStep("The element with name " + name + " is selected with the index value" + value,"pass");
		
		}catch(NoSuchElementException e)
		{
			reportStep("The element with name " + name+ "does not exist in the DOM","fail");
			//System.err.println("The element with name " + name+ "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with name " + name + " is not visible in the DOM","fail");
			//System.err.println("The element with name " + name + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with name " + name + " is disabled in the DOM","fail");
			//System.err.println("The element with name " + name + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with name " + name+ "cannot be selected","fail");
           //System.err.println("The element with name " + name+ "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with name " + name + " is not stable in the DOM","fail");
			//System.err.println("The element with name " + name + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with name " + name+ " is not selected with  index value " + value + "due to unknown error","fail");
			//System.err.println("The element with name " + name+ " is not selected with  index value " + value + "due to unknown error");
		}
		
	}

	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try
		{
			
		WebElement we = driver.findElementByName(name);
		System.out.println("Ele");
		Select se = new Select(we);
		se.selectByValue(value);
		reportStep("The element with name " + name + " is selected with the index value" + value,"pass");
		//System.out.println("The element with name " + name + " is selected with the index value" + value);
		}catch(NoSuchElementException e)
		{
			reportStep("The element with name " + name+ "does not exist in the DOM","fail");
			//System.err.println("The element with name " + name+ "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with name " + name + " is not visible in the DOM","fail");
			//System.err.println("The element with name " + name + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with name " + name + " is disabled in the DOM","fail");
			//System.err.println("The element with name " + name + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with name " + name+ "cannot be selected","fail");
			//System.err.println("The element with name " + name+ "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with name " + name + " is not stable in the DOM","fail");
			//System.err.println("The element with name " + name + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with name " + name+ " is not selected with  index value " + value + "due to unknown error","fail");
			//System.err.println("The element with name " + name+ " is not selected with  index value " + value + "due to unknown error");
		}
		
	}

	public void switchToFameById(String Id) {
		// TODO Auto-generated method stub
		
		try
		{

		 WebElement wFrame = driver.findElementById(Id);
				
		 driver.switchTo().frame(wFrame);
		 reportStep("Switched to the Frame with Id " + Id ,"pass");
		 //System.out.println("Switched to the Frame with Id " + Id );
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown Error occurred while switching to new Frame " ,"fail");
			//System.err.println("Unknown Error occurred while switching to new Frame ");
			
		}
		
	}

	public void switchToDefaultContent() {
		// TODO Auto-generated method stub
		try
		{
		driver.switchTo().defaultContent();
		reportStep("Switched to Default Content" ,"pass");
		//System.out.println("Switched to Default Content" );
		}catch(WebDriverException e )
		{
			reportStep("Unknown Error while switching to default content" ,"fail");
			//System.err.println("Unknown Error while switching to default content");
		}
	
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		try
		{
		 driver.navigate().refresh();
		 //System.out.println("Page is refreshed");
		 reportStep("Page is refreshed","pass");
		}
		catch(WebDriverException e)
		{
			reportStep("Unknown error encountered while refreshing the page ","fail");
			//System.err.println("Unknown error encountered while refreshing the page ");
		}
		
		
		
	}

	public void acceptAlerts(String name) {
		// TODO Auto-generated method stub
		
		
		try
		{
		    driver.switchTo().alert().sendKeys(name);
		    
		    waitProperty(3000);
		    
		    acceptAlert();
		
		
		 // reportStep("Alert is Accepted with " + name,"pass",false);
		//System.out.println("Alert is Accepted with " + name);
		
		}catch(NoAlertPresentException e)
		{
			//reportStep("No Alert To Accept","fail",false);
			//System.err.println("No Alert To Accept");
		}
		catch(WebDriverException e)
		{
			//reportStep("Unknown Error encountered  while Accepting Alert","pass",false);
			//System.err.println("Unknown Error encountered  while Accepting Alert");
		}
		
	}

	public void ClickWebElementsByName(String name, int count) {
		// TODO Auto-generated method stub
		try
		{
		List<WebElement> wes= driver.findElementsByName(name);
		int cnt = 0;
		for (WebElement we : wes)
		{
			cnt++;
			if (cnt == count)
			{
				we.click();
				break;
				
			}
		}
		}catch(WebDriverException e)
		{
			//System.err.println("Unknown Error while Clicking on Element with name " + name);
			reportStep("Unknown Error while Clicking on Element with name " + name,"fail");
		}
		}

	public void selectVisibileTextByName(String name, String text) {
		// TODO Auto-generated method stub
		try
		{
		WebElement we = driver.findElementByName(name);
		Select se = new Select(we);
		
		se.selectByVisibleText(text);
		
		reportStep("The element with name " + name + " is selected with the visible text " + text,"pass");
		
		//System.out.println("The element with name " + name + " is selected with the visible text " + text);
		
		}catch(NoSuchElementException e)
		{
			reportStep("The element with name " + name+ "does not exist in the DOM","fail");
			//System.err.println("The element with name " + name+ "does not exist in the DOM");
		}
		catch(ElementNotVisibleException e)
		{
			reportStep("The element with name " + name + " is not visible in the DOM","fail");
			//System.err.println("The element with name " + name + " is not visible in the DOM");
		}
		catch(ElementNotInteractableException e)
		{ 
			reportStep("The element with name " + name + " is disabled in the DOM","fail");
			//System.err.println("The element with name " + name + " is disabled in the DOM");
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with name " + name+ "cannot be selected","fail");
			//System.err.println("The element with name " + name+ "cannot be selected");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with name " + name + " is not stable in the DOM","fail");
			//System.err.println("The element with name " + name + " is not stable in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with name " + name+ " is not selected with  visible text " + text + "due to unknown error","fail");
			//System.err.println("The element with name " + name+ " is not selected with  visible text " + text + "due to unknown error");
		}
		
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
	  try {
		  driver.findElementByXPath(xpathValue).sendKeys(data);
		  reportStep("The element with xpath " +xpathValue +" is entered with data " + data,"pass");
		  //System.out.println("The element with xpath " +xpathValue +" is entered with data " + data);
		  
	  }catch(NoSuchElementException e)
	  {
		  reportStep("The element with xpath " +xpathValue+ " is not found in DOM  ","fail");
		  //System.err.println("The element with xpath " +xpathValue+ " is not found in DOM  ");
	  }catch(ElementNotVisibleException e)
	  {
		  reportStep("The element with xpath " +xpathValue+ " is not visible in the DOM","fail");
		  //System.err.println("The element with xpath " +xpathValue+ " is not visible in the DOM");
	  }catch(ElementNotInteractableException e)
	  {
		  reportStep("The element with xpath " + xpathValue + " is not Interactable in the DOM","fail");
		  //System.err.println("The element with xpath " + xpathValue + " is not Interactable in the DOM");
	  }catch(StaleElementReferenceException e)
	  {
		  reportStep("The element with xpath " +xpathValue + " is not Stable in the DOM" ,"fail");
		  //System.err.println("The element with xpath " +xpathValue + " is not Stable in the DOM" );
	  }catch(WebDriverException e )
	  {
		  reportStep("The element with xpath " + xpathValue + "has encountered unknown error ","fail");
		  //System.err.println("The element with xpath " + xpathValue + "has encountered unknown error ");
	  }
	  
	  
	}
	
	
	
	}
	


