package mq.selenium.interactions.mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTo_Element {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Scroll Page to Required location
		WebElement All=driver.findElement(By.xpath("//span[@filter-id='-1']"));
		new Actions(driver).scrollToElement(All).perform();
		
		//Scroll Down and Scroll page using x and y delta values..
		Thread.sleep(2000);
		new Actions(driver).scrollByAmount(0, 200).perform();

	}

}
