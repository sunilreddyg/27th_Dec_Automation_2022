package mq.selenium.Listof_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_ListBox_items 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.linkText("PIM")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill']")).click();
	    Thread.sleep(2000);
	    
	    WebElement Employee_Name=driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
	    Employee_Name.sendKeys("Charlie");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(.,'Charlie  Carter')]")).click();

	    //Selecting Employee status from listbox
	    driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(.,'Full-Time Contract')]")).click();
	}

}
