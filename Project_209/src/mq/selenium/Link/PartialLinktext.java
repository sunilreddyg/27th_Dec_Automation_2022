package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.partialLinkText("Non-Users")).click();
		
		
	}

}
