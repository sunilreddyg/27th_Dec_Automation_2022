package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PIM_AddEmployee
{
		WebDriver driver;
		public PIM_AddEmployee(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[contains(.,'Add Employee')]")
		public WebElement  addEmployee;
		
		@FindBy(xpath = "//input[contains(@name,'firstName')]")
		public WebElement  Firstname;
		
		@FindBy(xpath = "//input[@name='middleName']")
		public WebElement  MiddleName;
		
		@FindBy(xpath = "//input[@name='lastName']")
		public WebElement  Lastname;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
		public WebElement  EmployeeID;
		
		@FindBy(xpath = "//button[@type='submit']")
		public WebElement  save;
		
		@FindBy(xpath = "//button[contains(.,'Cancel')]")
		public WebElement  cancel;
		
		public void staticTime(long MS)
		{
			try {
				Thread.sleep(MS);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		
		public void AddNewEmplyeeDetails(String Fname,String MName,String Lname,String EId)
		{
			addEmployee.click();
			if(driver.getCurrentUrl().contains("pim/addEmployee"))
				System.out.println("page Verified");
			else
				System.out.println("page Not Verified");
			staticTime(2000);
			Firstname.sendKeys(Fname);
			MiddleName.sendKeys(MName);
			Lastname.sendKeys(Lname);
			EmployeeID.sendKeys(EId);
			save.click();
		}

}