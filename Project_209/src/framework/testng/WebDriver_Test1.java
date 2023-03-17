package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_Test1 
{
	WebDriver driver;
	String url="http://facebook.com";
	
  @Test
  public void Verify_Signup_link() 
  {
	  driver.findElement(By.linkText("Sign Up")).click();
	  Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
	  Reporter.log("Singup link verified Expected Title Presented --> "+driver.getTitle());
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src, new File("screens\\"+method.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
		Thread.sleep(5000);
		driver.close();
  }

}
