package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Dropdown_Option_Using_ClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		WebElement DOB_Day=driver.findElement(By.id("day"));
		DOB_Day.findElement(By.xpath("//option[@value='8']")).click();
	}

}
