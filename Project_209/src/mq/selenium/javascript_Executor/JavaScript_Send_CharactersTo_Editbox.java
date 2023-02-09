package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_Send_CharactersTo_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Using Selenium Method Type text into editbox
		driver.findElement(By.id("email")).sendKeys("Darshan");
		driver.findElement(By.id("email")).clear();
		
		
		Thread.sleep(3000);
		//Type Text into Editbox using Mouse actions
		new Actions(driver)
		.click(driver.findElement(By.id("email")))
		.sendKeys("Sunil").perform();
		
		
		//Type text into password field using javascript executor
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('pass').value='Hello@123'");
		
		//Click method using javascript executor [With Xpath identifier]
		WebElement LoginButton=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].click()", LoginButton);
		

	}

}
