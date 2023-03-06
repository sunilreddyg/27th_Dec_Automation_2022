package pageobjects.With_PageFactory.Testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.With_PageFactory.Pages.HRM_Loginpage;
import pageobjects.With_PageFactory.Pages.MenuTabs;
import pageobjects.With_PageFactory.Pages.PIM_AddEmployee;

public class TestCase1 
{
	WebDriver driver;
	HRM_Loginpage loginpage;
	MenuTabs tabs;
	PIM_AddEmployee addemp;
	public TestCase1(WebDriver driver) 
	{
		this.driver=driver;
		loginpage=new HRM_Loginpage(driver);
		tabs=new MenuTabs(driver);
		addemp=new PIM_AddEmployee(driver);
	}
	
	

	public void Add_Valid_EmployeeDetails()
	{
		try {
			loginpage.Userlogin();
			Thread.sleep(2000);
			
			tabs.pIM.click();
			Thread.sleep(2000);
			
			addemp.addEmployee.click();
			Thread.sleep(2000);
			
			addemp.AddNewEmplyeeDetails("Sunil", "Kumar", "S", "100");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void Add_InValid_EmployeeDetails()
	{
		try {
			loginpage.Userlogin();
			Thread.sleep(2000);
			
			tabs.pIM.click();
			Thread.sleep(2000);
			
			addemp.addEmployee.click();
			Thread.sleep(2000);
			
			addemp.AddNewEmplyeeDetails("", "Kumar", "S", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
