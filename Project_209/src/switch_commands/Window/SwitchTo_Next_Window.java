package switch_commands.Window;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	   
	    //This link will open extra window
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(2000);
	    
	 
	    //Getting all window id's
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
	    //Converting set of string values into iterator
	    Iterator<String> Iterator=AllWindowIDS.iterator();
	    
	    //Read each iterator with next keyword
	    String Window1=Iterator.next();
	    String Window2=Iterator.next();
	  
		
	    //Switch to Next window
	    driver.switchTo().window(Window2);
	    System.out.println("Window2 Title is ---> "+driver.getTitle());
	    
	    //Switch Controls back to Window1
	    driver.switchTo().window(Window1);
	    System.out.println("Window1 Title is ---> "+driver.getTitle());
	    
	    
	}

}
