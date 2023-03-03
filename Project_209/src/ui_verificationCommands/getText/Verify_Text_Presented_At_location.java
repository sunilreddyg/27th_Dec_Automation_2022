package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Presented_At_location {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("");
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		//Identifying error location and reding text
		WebElement ErrorLocation=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String ErrorText=ErrorLocation.getText();
		
		if(!ErrorText.isEmpty())
		{
			System.out.println("Location Contains text");
			String Exp_text="Enter a valid email address, phone number, or Skype name.";
			if(ErrorLocation.getText().equals(Exp_text))
				System.out.println("Testpass, Expected Text Presented at Location");
			else
				System.out.println("Testfail, Wrong Text presented at location");
		}
		else
		{
			System.out.println("Location doesn't contain text");
		}
		
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
