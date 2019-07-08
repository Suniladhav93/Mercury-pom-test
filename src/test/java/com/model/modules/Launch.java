package com.model.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.model.utility.LaunchApp;

public class Launch 
{
  @Parameters({"browser","url","timeoutseconds"}) 
  @Test
  public void executeLaunch(String browsernm,String urlnm,int timeoutseconds)
	  {
		  LaunchApp lc=new LaunchApp();
		  			lc.OpenBrowser(browsernm);
		  			lc.enterapplicationURL(urlnm);
		  			lc.maximizeBrowser();
		  			lc.waittillLoginpageLoaded(timeoutseconds);
		  			
	  }
}
