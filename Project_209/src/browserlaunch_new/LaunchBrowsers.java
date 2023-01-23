package browserlaunch_new;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsers
{

	public static void main(String[] args) 
	{
		
				//Open ChromeBrowser and loading webpage to browser window
				ChromeDriver chrome=new ChromeDriver();
				chrome.get("http://instagram.com");
				
				//Open Firefox browser and loading webpage to browser window
				FirefoxDriver firefox=new FirefoxDriver();
				firefox.get("http://facebook.com");
				
				//Open IE browser and loading webpage to browser window
				InternetExplorerDriver iebrowser=new InternetExplorerDriver();
				iebrowser.get("http://google.com");
				
				
				/*
				 * new ChromeDriver():-->
				 * 				This Command Open Chrome Browser
				 * 
				 * get:-->
				 * 				This method load webpage to automation browser window
				 * 				
				 */
				
	}

}
