package mq.selenium.interactions.mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_On_Zoom_Button {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/product-image-magnifier-hover.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Photo=driver.findElement(By.xpath("//a[@title='Zoom & Compare Different Regions Of An Image - jQuery Doublezoom']"));
		new Actions(driver).moveToElement(Photo).perform();
		Thread.sleep(1000);

		WebElement zoomButton=driver.findElement(By.xpath("(//div[@class='vlb_zoom'])[1]"));
		zoomButton.click();
	}

}
