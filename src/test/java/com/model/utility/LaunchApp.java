package com.model.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.model.configue.Configue;

public class LaunchApp
{
	public void OpenBrowser(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		Configue.driver=new ChromeDriver();
	}
	public void enterapplicationURL(String url)
	{
		Configue.driver.get(url);
	}
	public void maximizeBrowser()
    {
    	Configue.driver.manage().window().maximize();
    }
    
    public void waittillLoginpageLoaded(int timeoutseconds)
    {
    	Configue.driver.manage().timeouts().pageLoadTimeout(timeoutseconds, TimeUnit.SECONDS);
    	
    }
    
    public static void main(String[] args) 
    {
    	LaunchApp lc =new LaunchApp();
    			  lc.OpenBrowser("chrome");
    			  lc.enterapplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
    			  lc.maximizeBrowser();
    			  lc.waittillLoginpageLoaded(15);
	}
}
