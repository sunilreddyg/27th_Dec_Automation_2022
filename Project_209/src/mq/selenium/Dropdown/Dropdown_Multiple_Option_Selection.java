package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_Option_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		
		//Convert single selection dropdown into Multiple Selection
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('month').setAttribute('multiple','multiple')");
		Thread.sleep(3000);
		
		
		WebElement DOB_Month=driver.findElement(By.id("month"));
		
		
		//Verify Dropdown Selection is Multiple type
		boolean flag=new Select(DOB_Month).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag);
		
		
		 Select MonthSelector=new Select(DOB_Month);
		 if(flag==true) //This Condition accept only if dropdown is multiple type
		 {
			 MonthSelector.deselectAll();
			 MonthSelector.selectByIndex(3);
			 MonthSelector.selectByIndex(5);
			 MonthSelector.selectByIndex(8);
			 
			 Thread.sleep(3000);
			 MonthSelector.deselectByIndex(5);
		 }
		 else
		 {
			 System.out.println("Dropdown is not a multiple type");
		 }
	

	}

}
