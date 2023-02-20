package mq.java.variable.Global;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User2 
{
	WebDriver driver;
	Repository obj;
	
	By PIM_Tab=By.xpath("//span[contains(.,'PIM')]");
	

	@Before
	public void PreCondition()
	{
		obj=new Repository();
		obj.SetupBrowser();
		obj.AccountLogin("Admin", "admin123");
		driver=obj.driver;  //Get Driver control from Repository class and assign to global driver
	}
	
	@Test
	public void VerifyPIM()
	{
		driver.findElement(PIM_Tab).click();
	}
	
	
	
}
