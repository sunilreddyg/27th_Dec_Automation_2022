package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_Location 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
		
		//Capturing screen at select location
	    WebElement FooterLocation=driver.findElement(By.xpath("//div[@class='_ab1y']"));
	    File src=FooterLocation.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("screens\\image2.png"));
	    
	    
	    
	    
	}

}
