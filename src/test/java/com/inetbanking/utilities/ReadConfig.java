package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	
	Properties pro; //object for Properties class.
	
	//create constructor ReadConfig
	
	public ReadConfig()
	{
		File F1= new File("./configuration/config.properties"); // load config.properties file
		try
		{FileInputStream FIS = new FileInputStream(F1);
		pro = new Properties();
		pro.load(FIS);	//By using this object we are loading the complete file.
		}
		catch(Exception e)
		{
			System.out.println("exception is "+e.getMessage());
		}	
		
	}
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	public String getChromepath()
	{
		String Chromepath= pro.getProperty("chromepath");
		return Chromepath;
	}
	
	public String getFirefoxpath()
	{
		String Firefoxpath = pro.getProperty("firefoxpath");
		return Firefoxpath;
	}
	
	

}
