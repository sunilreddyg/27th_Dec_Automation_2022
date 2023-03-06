package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MenuTabs
{
	   WebDriver driver;
	   public MenuTabs(WebDriver driver) 
	   {
		   this.driver=driver;
		  PageFactory.initElements(driver, this);
	   }

	@FindBy(xpath = "(//span[contains(.,'Admin')])[1]")
	public WebElement  admin;
	
	@FindBy(xpath = "//span[contains(.,'PIM')]")
	public WebElement  pIM;
	
	@FindBy(xpath = "//span[contains(.,'Time')]")
	public WebElement  time;
	
	@FindBy(xpath = "//span[contains(.,'Recruitment')]")
	public WebElement  recruitment;
	
	@FindBy(xpath = "//span[contains(.,'My Info')]")
	public WebElement  myInfo;
	
	@FindBy(xpath = "//span[contains(.,'Performance')]")
	public WebElement  performance;
	
	@FindBy(xpath = "//span[contains(.,'Dashboard')]")
	public WebElement  dashboard;
	
	@FindBy(xpath = "//span[contains(.,'Directory')]")
	public WebElement  directory;
	
	@FindBy(xpath = "//span[contains(.,'Maintenance')]")
	public WebElement  maintenance;
	
	@FindBy(xpath = "//span[contains(.,'Buzz')]")
	public WebElement  buzz;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][contains(.,'Leave')]")
	public WebElement Leave;
	
	public void clickAdminTab()
	{
		admin.click();
	}

}