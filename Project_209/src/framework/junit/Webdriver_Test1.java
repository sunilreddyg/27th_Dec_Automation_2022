package framework.junit;


import java.io.File;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webdriver_Test1 
{

	static WebDriver driver;
	
	//RUle helps to find get current constructed tests
	public @Rule TestName test=new TestName();
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(4000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\"+test.getMethodName()+".png"));
	}
	

	@Test
	public void Tc001_Verify_Signup_link() 
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup title verified");
	}
	
	@Test
	public void Tc002_Verify_Login_link()
	{
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals("Log in to Facebook", driver.getTitle());
		System.out.println("Login Link Verified");
	}

}
