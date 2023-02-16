package capturescreen;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_ScreenShot 
{

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    //Capturing screen and storing into output file format
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    //Create Folder under project
	    FileHandler.createDir(new File("screens"));

	    //Copy file to project
	    FileHandler.copy(src, new File("screens\\image.png"));
	    /*
	     * PNG:--> Portable network graphic [It is a image extension]
	     */
	  

	}

}
