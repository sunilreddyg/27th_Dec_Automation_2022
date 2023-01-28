package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Example {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("India")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Mathura")).click();
		Thread.sleep(3000);
	}

}
