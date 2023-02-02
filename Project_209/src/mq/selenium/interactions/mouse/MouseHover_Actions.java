package mq.selenium.interactions.mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Actions 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Performing Mouse hover action at selected location
		WebElement Resources=driver.findElement(By.xpath("//a[@class='nav-link-hed'][contains(.,'Resources')]"));
		new Actions(driver).moveToElement(Resources).perform();
		Thread.sleep(2000);
		
		WebElement ProductOverview=driver.findElement(By.xpath("//a[@class='nav-link-hed'][contains(.,'Resources')]"));
		new Actions(driver).moveToElement(ProductOverview).perform();
		Thread.sleep(2000);
		
		//Click method using mouse interaction class
		WebElement HRM_ROI=driver.findElement(By.xpath("(//a[contains(.,'OrangeHRM ROI')])[1]"));
		new Actions(driver).click(HRM_ROI).perform();
		
	}

}
