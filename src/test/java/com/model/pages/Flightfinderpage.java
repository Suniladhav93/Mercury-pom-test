package com.model.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.model.configue.Configue;
import com.model.utility.CloseBrowser;
import com.model.utility.LaunchApp;

public class Flightfinderpage 
{
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlightfinder;
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignoff;
	public void verifyFlightfinderpage()
	{
		PageFactory.initElements(Configue.driver, this);
	}

	public void verifyFlightFinder()
	{
		boolean flag=objFlightfinder.isDisplayed();
		if(flag==true)
		{
			System.out.println("FlightFinder page is displayed");
		}
	}
	
	public void clickonSignoff()
	{
		objSignoff.click();
	}
	public static void main(String[] args) 
	{
		LaunchApp lc =new LaunchApp();
		  lc.OpenBrowser("chrome");
		  lc.enterapplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		  lc.maximizeBrowser();
		  lc.waittillLoginpageLoaded(15);
		Loginpage lp=new Loginpage();
				  lp.loadloginpage();
				  lp.enterUsername("sunila1");
				  lp.enterPassword("p@ssword1");
				  lp.clickonLogin();
		Flightfinderpage ff=new Flightfinderpage();
						 ff.verifyFlightfinderpage();
						 ff.verifyFlightFinder();
						 ff.clickonSignoff();
		CloseBrowser cb=new CloseBrowser();
					 cb.closeBrowser();
	}
}
