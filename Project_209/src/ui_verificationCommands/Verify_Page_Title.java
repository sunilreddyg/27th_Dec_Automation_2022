package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		if(driver.getTitle().contains("Outlook"))
		{
			System.out.println("Outlook tile Verified");
			WebElement SigninButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			SigninButton.click();
			Thread.sleep(3000);
			
			String Exp_loginPageTitle="Sign in to your Microsoft account";
			if(driver.getTitle().equals(Exp_loginPageTitle))
			{
				System.out.println("Login page title is presented");
			}
			else
			{
				System.out.println("Login page title is not presented");
			}
			
		}
		else
		{
			System.out.println("Wrong title presented for Outlook Homepage");
		}
		
		driver.close();

	}

}
