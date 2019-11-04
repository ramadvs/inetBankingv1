package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("Opening the URL");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		
		logger.info("Entered the user name");
		
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
			captureScreen(driver, "loginTest");
		Assert.assertTrue(false);	
		logger.info("Condition failed");
		}
		
		
	}	
		
	
	
	

}
