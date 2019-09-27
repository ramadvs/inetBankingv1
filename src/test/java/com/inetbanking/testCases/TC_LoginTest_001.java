package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		
		logger.info("Opening the URL");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		
		logger.info("Entered the username");
		
		lp.setPassword(password);
		
		logger.info("Entered the password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Condition passed");
		}
		else
		{
		Assert.assertTrue(false);	
		logger.info("Condition failed");
		}
		
		
	}	
		
	
	
	

}
