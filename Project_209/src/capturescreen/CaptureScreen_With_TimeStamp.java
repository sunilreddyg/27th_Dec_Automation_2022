package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_TimeStamp 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Create Java time stampt
	    Date date=new Date();
	    //Create simple date foramt
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE dd-hh-mm-ss");
	    //Convert date using simple formatter
	    String time=sdf.format(date);
	    
	  //Capturing screen at select location
	    WebElement FooterLocation=driver.findElement(By.xpath("//div[@class='_ab1y']"));
	    File src=FooterLocation.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("screens\\image2"+time+".png"));
		
		

	}

}
