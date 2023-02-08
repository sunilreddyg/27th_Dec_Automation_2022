package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Click_Action_Using_Javascript {

	public static void main(String[] args) {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identify Object using xpath
		WebElement SignIn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		js.executeScript("arguments[0].click()", SignIn);
		
		
	}

}
