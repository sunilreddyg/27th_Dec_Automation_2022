package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Dropdown_Option_Using_ClickMethod 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Dropdown selection using click Method
		WebElement DOB_Day=driver.findElement(By.id("day"));
		DOB_Day.findElement(By.xpath("//option[@value='8']")).click();
		
		//Dropdown selection using click Method
		WebElement DOB_month=driver.findElement(By.name("birthday_month"));
		DOB_month.findElement(By.xpath("//option[contains(.,'Oct')]")).click();
		
		//Dropdown selection using click Method
		driver.findElement(By.xpath("//option[contains(.,'2015')]")).click();
		
	}

}
