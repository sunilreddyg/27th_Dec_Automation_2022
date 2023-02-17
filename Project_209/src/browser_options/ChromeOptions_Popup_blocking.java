package browser_options;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Popup_blocking 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
				Arrays.asList("disable-popup-blocking"));
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
		
	}

}
