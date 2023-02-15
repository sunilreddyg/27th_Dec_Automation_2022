package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_PageTitle {

	public static void main(String[] args) throws Exception {
		
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
	    	String PageTitle=driver.switchTo().window(Eachwindow).getTitle();
	    	if(PageTitle.contains("Meta"))
	    	{
	    		break;
	    	}
		}
		
	    //The assumption is once iteration finished by default control will be available at Second window
	    System.out.println("Currented Focused window is ---> "+driver.getTitle());
	    

	    //Closing Second window
	    driver.close();
	    
	    //Switch back to Mainwindow
	    driver.switchTo().window(MainwindowID);
	    System.out.println("Main window title is --->"+driver.getTitle());

	}

}
