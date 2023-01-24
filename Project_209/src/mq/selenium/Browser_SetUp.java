package mq.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_SetUp 
{

	public static void main(String[] args) 
	{
		
			//launching chrome instance and storing reference into WebDriver Interface
			WebDriver driver=new ChromeDriver();
			//Loading New page to Browser
			driver.get("https://facebook.com");
			//maximize browser window
			driver.manage().window().maximize();     //[Optional]
			
			
			/*
			 * WebDriver:-->
			 * 		WebDriver is a interaface class it can manipulate
			 * 		all browser instances supported by selenium
			 * 
			 * get:-->
			 * 		Get is a method Under webdriver class. It wil load
			 * 		New page to browser window
			 * 
			 * 		Notes:--> We must start site address with valid protocal
			 * 					http://   or https://
			 * 
			 * 			
			 */
			
			
			
	}

}
