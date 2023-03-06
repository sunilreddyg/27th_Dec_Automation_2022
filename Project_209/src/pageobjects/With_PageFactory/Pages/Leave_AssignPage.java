package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Leave_AssignPage
{
	   WebDriver driver;
	   public Leave_AssignPage(WebDriver driver) 
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }

		@FindBy(xpath = "//a[contains(.,'Assign Leave')]")
		public WebElement  assignLeave;
		
		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		public WebElement  EmployeenameHint;
		
		@FindBy(xpath = "//span[contains(.,'Lisa  Andrews')]")
		public WebElement  lisaAndrewsEmp1;
		
		@FindBy(xpath = "//div[@class='oxd-select-text-input']")
		public WebElement  Select_LeaveTypeList;
		
		@FindBy(xpath = "//span[contains(.,'CAN - Personal')]")
		public WebElement  cANPersonal;
		
		@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
		public WebElement  FromDateEntry;
		
		@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
		public WebElement  ToDateEntry;
		
		@FindBy(xpath = "//textarea[contains(@class,'oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical')]")
		public WebElement  CommentEB;
		
		@FindBy(xpath = "//button[@type='submit'][contains(.,'Assign')]")
		public WebElement  assign;

		public void staticTime(long MS)
		{
			try {
				Thread.sleep(MS);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void ApplyLeave()
		{
			assignLeave.click();
			staticTime(3000);
			EmployeenameHint.sendKeys("lisa");
			staticTime(3000);
			lisaAndrewsEmp1.click();
			 Select_LeaveTypeList.click();
			 cANPersonal.click();
		}

}