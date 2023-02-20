package mq.java.variable.Global;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository 
{
	public WebDriver driver;
	public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	By UID=By.xpath("//input[@name='username']");
	By PWD=By.xpath("//input[@type='password']");
	By Login_Btn=By.xpath("//button[@type='submit']");
	
	public void OpenChrome()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void LoadPage()
	{
		driver.get(url);
	}
	
	public void SetupBrowser()
	{
		OpenChrome();
		LoadPage();
	}
	
	public void AccountLogin(String Usenrame,String Password)
	{
		driver.findElement(UID).sendKeys(Usenrame);
		driver.findElement(PWD).sendKeys(Password);
		driver.findElement(Login_Btn).click();
	}

}
