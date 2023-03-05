package pageobjects.Without_PageFactory;

import org.openqa.selenium.WebDriver;

public class TestCase2 
{
	
	WebDriver driver=null;
	TestBase base;
	
	public TestCase2() 
	{
		base.SetupChrome();
		base.Account_login();
		driver=base.driver;
	}
	
	
	public void AddEmployeeList_UnderPIM()
	{
		base.static_time(2000);
		driver.findElement(CommonObjects.PIM_Add_Employee).click();
		base.static_time(2000);
		driver.findElement(CommonObjects.PIM_Add_Employee_Firstanme).sendKeys("Aakash");
		driver.findElement(CommonObjects.PIM_Add_Employee_MiddleName).sendKeys("Kumar");
	}

}
