package pageobjects.Without_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	WebDriver driver;
	
	public void SetupChrome()
	{
		try {
			driver=new ChromeDriver();
			driver.get(CommonObjects.Ip_hrm_url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Account_login()
	{
		if(driver!=null)
		{
			static_time(4000);
			driver.findElement(CommonObjects.Login_uid)
			.sendKeys(CommonObjects.Ip_uid);
			
			driver.findElement(CommonObjects.Login_pwd)
			.sendKeys(CommonObjects.Ip_password);
			
			driver.findElement(CommonObjects.Login_submit_button).click();
		}
	}
	
	
	public void static_time(long msec)
	{
		try {
			Thread.sleep(msec);
		} catch (Exception e) {
			
		}
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}

}
