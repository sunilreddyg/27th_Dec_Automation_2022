package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkeys_With_Multiple_Options 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Press Tab key using sendkeys command
		driver.findElement(By.name("firstname"))
		.sendKeys("Ajay"+Keys.TAB+"Krishna"+Keys.TAB+"AjayKrishna@gmail.com");
		
		
		
		
		//Dropdown selection using sendkeys
		driver.findElement(By.xpath("//select[@id='day']"))
		.sendKeys("21");
		
		//Dropdown selection using sendkeys
		driver.findElement(By.xpath("//select[@id='month']"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Dropdown selection using sendkeys
		driver.findElement(By.xpath("//select[@id='year']"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
				
		
		/*
		 * Note:--> Sendkeys doesn't throw any error when Option
		 * 			not found..
		 */
	}

}
