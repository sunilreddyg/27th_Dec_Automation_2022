package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

		
		System.out.println(driver.getPageSource());
		//Verify element presented at source before identification
		if(driver.getPageSource().contains("username"))
		{
			System.out.println("Element Presented at source");
			driver.findElement(By.name("username")).sendKeys("Admin");
		}	
		else
			System.out.println("Element not presented at source");
		
		
		
		
		
		//To identify dynamic elements at webpage we can follow try-catch block
		try {
			driver.findElement(By.name("password")).sendKeys("admin123");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
