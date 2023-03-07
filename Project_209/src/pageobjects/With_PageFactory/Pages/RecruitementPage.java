package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RecruitementPage
{
		WebDriver driver;
		public RecruitementPage(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public String Fname="Rajesh";
		public String Lname="Kumar";
		public String MiddleName="S";
		public String email="Rajesh@gmail.com";
		public String ExpHeader="Add Vacancy";
		
		

		@FindBy(xpath = "//a[contains(.,'Vacancies')]")
		public WebElement  vacancies;
		
		@FindBy(xpath = "//button[contains(.,'Add')]")
		public WebElement  add;
		
		@FindBy(xpath = "//input[@placeholder='First Name']")
		public WebElement  Firstname;
		
		@FindBy(xpath = "//input[@placeholder='Middle Name']")
		public WebElement  Middlename;
		
		@FindBy(xpath = "//input[@placeholder='Last Name']")
		public WebElement  Lastname;
		
		@FindBy(xpath = "//div[@tabindex='0']")
		public WebElement  SelectListVacancies;
		
		@FindBy(xpath = "(//span[contains(.,'Account Assistant')])[1]")
		public WebElement  vac_options_accountAssistant;

		@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
		public WebElement Email;
		
		@FindBy(xpath = "//h6[contains(.,'Add Vacancy')]")
		public WebElement pageheader;

}