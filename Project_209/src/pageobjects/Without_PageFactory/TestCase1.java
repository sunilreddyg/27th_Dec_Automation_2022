package pageobjects.Without_PageFactory;

import org.openqa.selenium.WebDriver;

public class TestCase1 
{
	WebDriver driver=null;
	TestBase base;
	
	public TestCase1() 
	{
		base=new TestBase();
		base.SetupChrome();
		base.Account_login();
		driver=base.driver;
	}
	
	public void Adding_systemUser()
	{
		base.static_time(3000);
		driver.findElement(CommonObjects.MenuTab_Admin).click();
		base.static_time(2000);
		driver.findElement(CommonObjects.System_user_Adduser).click();
		base.static_time(2000);
		driver.findElement(CommonObjects.Adduser_UserRole).click();
		base.static_time(2000);
		driver.findElement(CommonObjects.Adduser_userRole_ESS).click();
		base.static_time(2000);
		driver.findElement(CommonObjects.Adduser_EmployeeName).sendKeys("Paul");
		base.static_time(2000);
		driver.findElement(CommonObjects.Adduser_employeeList1).click();
	}
	
	
	
	

}
