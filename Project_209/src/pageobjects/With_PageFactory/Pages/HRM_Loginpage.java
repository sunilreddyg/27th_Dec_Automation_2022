package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HRM_Loginpage
{
	   WebDriver driver;
	   public HRM_Loginpage(WebDriver driver) 
	   {
		   this.driver=driver;
		  PageFactory.initElements(driver, this);
	   }


		@FindBy(xpath = "//input[@name='username']")
		public WebElement  username;
		
		@FindBy(xpath = "//input[@name='password']")
		public WebElement  password;
		
		@FindBy(xpath = "//button[contains(.,'Login')]")
		public WebElement  login;
		
		@FindBy(xpath = "//p[contains(.,'Forgot your password?')]")
		public WebElement  forgotYourPassword;
		
		@FindBy(xpath = "//h5[contains(.,'Login')]")
		public WebElement  loginheader;
		
		//Method To Verify PageHeader
		String ActPageHeader="Login";
		public boolean VerifyPageHeader()
		{
			boolean flag= loginheader.getText().equalsIgnoreCase(ActPageHeader);
			return flag;
		}
		
		
		public void staticTime(long MS)
		{
			try {
				Thread.sleep(MS);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		//Method to Login into account
		public String UID="Admin";
		public String PWD="admin123";
		public void Userlogin()
		{
			staticTime(3000);
			username.sendKeys(UID);
			password.sendKeys(PWD);
			login.click();
		}
		
		
		
		
}