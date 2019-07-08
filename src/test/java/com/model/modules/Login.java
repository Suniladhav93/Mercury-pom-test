package com.model.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.model.pages.Flightfinderpage;
import com.model.pages.Loginpage;
import com.model.pages.Signonpage;
import com.model.utility.CloseBrowser;

public class Login 
{
	@Parameters({"usernm","passwd"})
	@Test(priority=1)
	public void executwithvalidds(String username,String password) throws InterruptedException
	{
		Loginpage lp=new Loginpage();
		  lp.loadloginpage();
		  lp.enterUsername(username);
		  lp.enterPassword(password);
		  Thread.sleep(5000);
		  lp.clickonLogin();
        Flightfinderpage ff=new Flightfinderpage();
				 ff.verifyFlightfinderpage();
				 ff.verifyFlightFinder();
				 ff.clickonSignoff();
        /*CloseBrowser cb=new CloseBrowser();
			 cb.closeBrowser();*/
	}
	@Parameters({"Invalidusernm","Invalidpasswd"})
	@Test(priority=2)
	public void executwithInvalidds(String username1,String password1) throws InterruptedException
	{
		Loginpage lp=new Loginpage();
		  lp.loadloginpage();
		  lp.enterUsername(username1);
		  lp.enterPassword(password1);
		  lp.clickonLogin();
		Signonpage sp=new Signonpage();
		  sp.loadSignOnpage();
		  sp.verifySignOn();
		  Thread.sleep(5000);
        CloseBrowser cb=new CloseBrowser();
			 cb.closeBrowser();
	}
}
