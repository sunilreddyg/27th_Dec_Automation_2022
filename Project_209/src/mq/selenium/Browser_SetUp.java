package mq.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_SetUp {

	public static void main(String[] args) 
	{
			//launching chrome instance and storing reference into WebDriver Interface
			WebDriver driver=new ChromeDriver();
			//Loading New page to Browser
			driver.get("https://facebook.com");
			//maximize browser window
			driver.manage().window().maximize();
			
			//Customer Browser window
			driver.manage().window().setSize(new Dimension(400, 500));
	}

}
