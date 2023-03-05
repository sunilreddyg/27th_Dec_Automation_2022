package pageobjects.With_PageFactory.FbPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_LoginPage 
{
	
	@FindBy(id="email") 
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@data-testid='royal_login_button']")
	public WebElement login_submit_button;

	@FindBy(xpath = "//a[contains(.,'Forgotten password?')]")
	public WebElement Forgotpassword;
	
	String Act_PageTitle="Facebook – log in or sign up";
	String UID="Darshan";
	String PWD="Darsh@123";
	
	public void Enterusername()
	{
		Email.sendKeys(UID);
	}
	
	public void Enterpassword()
	{
		password.sendKeys(PWD);
	}
	
	public void clickonloginbutton()
	{
		login_submit_button.click();
	}
	
	public void FbUserlogin()
	{
		Enterusername();
		Enterpassword();
		clickonloginbutton();
	}

}
