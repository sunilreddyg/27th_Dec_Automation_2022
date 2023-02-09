package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Dropdown_Option_Using_JS {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Enable Javascript Executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		WebElement CreateAct=driver.findElement(By.xpath("//a[contains(.,'Create new account')]"));
		js.executeScript("arguments[0].click()", CreateAct);
		Thread.sleep(3000);
		
		//Using Javascript Dropdown selection with value property
		WebElement DOB_Day=driver.findElement(By.xpath("//select[@title='Day']"));
		js.executeScript("arguments[0].value='6'", DOB_Day);
		
		//Using Javascript Dropdown selection with Index value
		WebElement DOB_Month=driver.findElement(By.xpath("//select[@title='Month']"));
		js.executeScript("arguments[0].selectedIndex='3'", DOB_Month);
		
		
		//Select Radio button
		WebElement Female=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked=true", Female);
		
	}

}
