package mq.selenium.interactions.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Actions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		WebElement From=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		new Actions(driver)
		.click(From).pause(1000)
		.sendKeys(Keys.BACK_SPACE).pause(1000)
		.sendKeys("DEL").pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER).perform();
	}

}
