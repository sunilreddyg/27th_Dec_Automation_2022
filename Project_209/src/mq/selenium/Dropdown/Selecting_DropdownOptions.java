package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_DropdownOptions 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Selecting dropdown with option name
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("12");
		
		//Selecting dropdown with Value property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("7");
		
		//Selecting dropdown with index number
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(13);
		
		//Selecting Radio button using click method
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		Thread.sleep(2000);
		
		//Selecting Dropdown Option Using VisibleText
		new Select(driver.findElement(By.name("preferred_pronoun")))
		.selectByVisibleText("She: \"Wish her a happy birthday!\"");

	}

}
