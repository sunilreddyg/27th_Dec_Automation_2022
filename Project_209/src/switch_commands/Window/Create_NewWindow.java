package switch_commands.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_NewWindow {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    
	    //Get Mainwindow ID
	    String MainwindowID=driver.getWindowHandle();
	   
	    WebDriver MetaWindow=driver.switchTo().newWindow(WindowType.WINDOW);
	    MetaWindow.get("https://about.meta.com/");
	    System.out.println(MetaWindow.getTitle());
	    String MetaWindowID=MetaWindow.getWindowHandle();
	    
	    MetaWindow.switchTo().window(MainwindowID);
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().window(MetaWindowID);
	    System.out.println(driver.getTitle());
	  

	}

}
