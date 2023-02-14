package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_SecondWindow 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Capture mainwindow id
	    String MainwindowID=driver.getWindowHandle();
	    
	   
	    //This link will open extra window
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(2000);
	    
		
	    //Get All window handles
	    Set<String> AllwindowIds=driver.getWindowHandles();
	    for (String Eachwindow : AllwindowIds) 
	    {
	    	//Switch to Every window and getting title of window
			String WindowTitle=driver.switchTo().window(Eachwindow).getTitle();
			if(WindowTitle.contains("Meta"))
			{
				System.out.println("now controls Presented at Meta window");
				break;
			}
		}
		
	    
	    System.out.println("Currented Focused window is ---> "+driver.getTitle());
	    

	}

}
