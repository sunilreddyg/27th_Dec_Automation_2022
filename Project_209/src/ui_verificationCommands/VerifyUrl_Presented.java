package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl_Presented 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Verify browser protcal is secured
		if(driver.getCurrentUrl().contains("https://"))
		{
			System.out.println("Secured protocal");
			if(driver.getTitle().equals("OrangeHRM"))
			{
				System.out.println("Orange HRM title is presented");
				
				WebElement ForgotPassword=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
				ForgotPassword.click();
				Thread.sleep(3000);
				
				if(driver.getCurrentUrl().contains("requestPasswordResetCode"))
				{
					System.out.println("Forgotpassword page url verified");
				}
				else
				{
					System.out.println("Forgotpassword page url not verified");
				}
			}
			else
			{
				System.out.println("Wrong title presented");
			}
		}
		else
		{
			System.out.println("un Secured protocal");
		}
		
		
		

	}

}
