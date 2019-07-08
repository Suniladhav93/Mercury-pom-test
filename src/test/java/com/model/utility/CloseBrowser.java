package com.model.utility;

import com.model.configue.Configue;

public class CloseBrowser 
{
	public  void closeBrowser()
	{
		Configue.driver.close();
	}
}
