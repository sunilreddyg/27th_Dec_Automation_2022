package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws Exception {
		
		
		//Setup browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("Hello");
		Thread.sleep(2000);
		
		//Clear data from Editbox
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("Hi");
		
	}

}
