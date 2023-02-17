package browser_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Run_Headless_Browser {

	public static void main(String[] args) throws Exception 
	{
		
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		option.addArguments("--headless");
		

		WebDriver driver=new ChromeDriver(option);
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    System.out.println("browser is Up and Ready to use");
	    
	    
	    //This action open alert at webbrowser
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    System.out.println("Alert is Opened");
	   
	    driver.switchTo().alert().accept();
	    System.out.println("Alert Closed");
	    
	    driver.close();
	    System.out.println("Browser is Closed");
	    
	    

	}

}
