package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_Object_Using_JS 
{

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		//Enable Javascript Executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Setting outline to object using Javascript
		WebElement DOB_Day=driver.findElement(By.xpath("//select[@title='Day']"));
		js.executeScript("arguments[0].style.outline ='thick solid red'", DOB_Day);

		//Setting background color to object using Javascript
		WebElement DOB_Month=driver.findElement(By.xpath("//select[@title='Month']"));
		js.executeScript("arguments[0].style.backgroundColor ='yellow'", DOB_Month);
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
	}

}
