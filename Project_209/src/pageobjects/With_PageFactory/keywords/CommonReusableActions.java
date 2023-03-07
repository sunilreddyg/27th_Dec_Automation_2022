package pageobjects.With_PageFactory.keywords;

import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonReusableActions 
{
	
	
	 WebDriver driver;
	 
	 //Keyword:--> Lanch any browser using browsername
	 public void LaunchBrowser(String browsername)
	 {
		 
		 switch (browsername) 
		 {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;

		default: System.out.println("browser name is mismatched");
			break;
		}
		 
	 }
	 
	 
	 //Loading webpage
	 public void loadingwebpage(String url)
	 {
		 if(driver!=null)
		 {
			 driver.manage().window().maximize();
		 }
		 else
			 System.out.println("Browser initiation failed");
	 }
	 
	 
	 
	 	//Get Current Class Driver Reference
	 	public WebDriver getDriver()
	 	{
	 		return driver;
	 	}
	 
	 
	    /* Keyword:--> set window size
		 * Aurhot:-->SunilReddy
		 * parameters used:--> Local parameters
		 */
		public void setwindow_size(int Width, int height)
		{
			driver.manage().window().setSize(new Dimension(Width, height));
		}
		
		
		/*
		 * KeyWord:--> This keyword manage implicit timeout
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		 public void set_implicitwait(int time_in_sec)
		 {
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time_in_sec));
		 }
		 
		 
		 
		 //Set static timeout
		 public void time(long tms)
		 {
			 try {
				Thread.sleep(tms);
			} catch (Exception e) {
				// TODO: handle exception
			}
		 }
	 
		 /*
		 * KeyWord:--> This keyword manage Page laod timeout
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		 public void set_page_load_timeout(long time_in_sec)
		 {
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(time_in_sec));
		 }
		 
		 
		 /*
		 * KeyWord:--> This keyword type text into Entrybox
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		 
		 public void TypeText(WebElement Element,String input)
		 {
			 try {
				Element.sendKeys(input);
			} catch (Exception e) {
				e.getStackTrace();
			}
		 }
		 
		 
		 /*
		 * KeyWord:--> This keyword type text into Entrybox
		 * Author:--> SunilReddy
		 * Parameters Used:-->  Local Parameter
		 */
		 
		 public void ClickElement(WebElement Element)
		 {
			 try {
				Element.click();
			} catch (Exception e) {
				e.getStackTrace();
			}
		 }
		 
		 
		 //Read Text from location
		 public boolean  VerifyTextPresented(WebElement element,String Exp_text)
		 {
			 try {
				return element.getText().contains(Exp_text);
				
			} catch (Exception e) {
				return false;
			}
		 }
		 
	         
	 

}
