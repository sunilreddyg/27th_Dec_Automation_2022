package pageobjects.With_PageFactory.FbPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_FB_LoginPage 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Pagefactory class helps identifying of @Findby methods
		FB_LoginPage login=PageFactory.initElements(driver, FB_LoginPage.class);
		
		//Calling page Elements from pageobject class
		if(login.Email.isDisplayed())
		{
			login.Email.sendKeys(login.UID);
			login.password.sendKeys(login.PWD);
			login.login_submit_button.click();
		}

		//Calling Reusable methods from pageobject class
		login.Enterusername();
		login.Enterpassword();
		login.clickonloginbutton();
		
		
		//calling Modular method from page objects class
		login.FbUserlogin();

	}

}
