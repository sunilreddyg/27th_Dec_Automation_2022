package browser_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser_In_InCongnitoMode {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
		
		
		

	}

}
