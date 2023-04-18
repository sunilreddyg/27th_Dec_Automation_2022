package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_PageTitle 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Manage timeout until expected title presented at webpage
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
		System.out.println("Facebook Title presented");
		
		
		WebElement ForgotPassword=driver.findElement(By.linkText("Forgotten password?"));
		ForgotPassword.click();
		
		try {
			wait.until(ExpectedConditions.titleContains("Forgotten"));
			System.out.println("Forgotten page title displayed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
