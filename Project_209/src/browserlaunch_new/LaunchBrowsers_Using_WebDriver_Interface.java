package browserlaunch_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsers_Using_WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		//Launching chrome browser using webdriver interface
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://facebook.com");
		
		//Launching firefox browser using webdriver interface
		WebDriver driver2=new FirefoxDriver();
		driver2.get("http://instagram.com");
		
		//Launching internet explorer browser using webdriver interface
		WebDriver driver3=new InternetExplorerDriver();
		driver3.get("http://google.com");
	}

}
