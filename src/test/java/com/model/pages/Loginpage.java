package com.model.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.model.configue.Configue;
import com.model.utility.LaunchApp;

public class Loginpage 
{
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	public void loadloginpage()
	{
		PageFactory.initElements(Configue.driver,this);
	}
	public void enterUsername(String username)
	{
		objusername.sendKeys(username);
		System.out.println("username enter successfully");
	}
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
		System.out.println("password enter successfully");
	}
	public void clickonLogin()
	{
		objlogin.click();
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
	}
}
