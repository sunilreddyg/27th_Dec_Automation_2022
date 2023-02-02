package mq.selenium.interactions.mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveto_OffSet {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		WebElement TrashBin=driver.findElement(By.xpath("//div[@class='trash']"));
		
		
		new Actions(driver).moveByOffset(36, 231).clickAndHold()
		.moveToElement(TrashBin).release().perform();
		Thread.sleep(2000);
		
		
		new Actions(driver).moveByOffset(36, 231).clickAndHold()
		.moveToElement(TrashBin).release().perform();
	}

}
