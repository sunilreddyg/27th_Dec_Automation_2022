package mq.selenium.Listof_Items;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Example {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	   
	    driver.findElement(By.linkText("PIM")).click();
	   
	    driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill']")).click();

	    
	    WebElement Employee_Name=driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
	    Employee_Name.sendKeys("Charlie");
	    driver.findElement(By.xpath("//span[contains(.,'Charlie  Carter')]")).click();
	    

	}

}
