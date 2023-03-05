package pageobjects.With_PageFactory.RunPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.With_PageFactory.Pages.HRM_Loginpage;
import pageobjects.With_PageFactory.Pages.MenuTabs;

public class SampleRun {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		HRM_Loginpage login=new HRM_Loginpage(driver);
		login.Userlogin();
		
		MenuTabs tabs=new MenuTabs(driver);
		tabs.clickAdminTab();
		
		
		
		
	}

}
