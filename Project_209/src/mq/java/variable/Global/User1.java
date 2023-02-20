package mq.java.variable.Global;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class User1 extends Repository
{
	
	By AdminMenu=By.xpath("(//span[contains(.,'Admin')])[1]");
	By SystemUser_Username=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	@Before
	public void PreCondition()
	{
		SetupBrowser();
		AccountLogin("Admin", "admin123");
	}
	
	
	@Test  
	public void VerifyAdminTab()
	{
		driver.findElement(AdminMenu).click();
		driver.findElement(SystemUser_Username).sendKeys("Charlie.Carter");
	}

}
