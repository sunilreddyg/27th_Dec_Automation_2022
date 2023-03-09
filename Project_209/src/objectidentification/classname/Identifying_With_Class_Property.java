package objectidentification.classname;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Identifying_With_Class_Property 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Identifying object with class property
		driver.findElement(By.className("oxd-input")).sendKeys("Admin");
		
		//Class Property with Xpath
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.below(By.className("oxd-input--active"))).sendKeys("admin123");
		
		
		
		//Identifying object with class name property
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> MenuList=driver.findElements(By.className("oxd-main-menu-item"));
		for (WebElement webElement : MenuList) 
		{
			System.out.println(webElement.getText());
		}
	}

}
