package pageobjects.With_PageFactory.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobjects.With_PageFactory.Pages.HRM_Loginpage;
import pageobjects.With_PageFactory.Pages.Leave_AssignPage;
import pageobjects.With_PageFactory.Pages.MenuTabs;
import pageobjects.With_PageFactory.Pages.PIM_AddEmployee;

public class LeaveTest 
{

	
	WebDriver driver;
	HRM_Loginpage loginpage;
	MenuTabs tabs;
	PIM_AddEmployee addemp;
	Leave_AssignPage leave;
	
	public LeaveTest(WebDriver driver) 
	{
		this.driver=driver;
		loginpage=new HRM_Loginpage(driver);
		tabs=new MenuTabs(driver);
		addemp=new PIM_AddEmployee(driver);
		leave=new Leave_AssignPage(driver);
	}
	
	
	public void ApplyLeaveonvalidDate()
	{
		loginpage.Userlogin();
		driver.findElement(By.xpath("(//span[contains(.,'Leave')])[1]")).click();
		
	}
	
}
