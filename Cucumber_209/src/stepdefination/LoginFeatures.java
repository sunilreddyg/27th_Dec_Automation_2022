package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatures 
{

	@Given("OpenChrome and load webpage")
	public void open_chrome_and_load_webpage() 
	{
	   System.out.println("Application is  Up and Ready to Use");
	}
	@When("User enter admin usernmae and password")
	public void user_enter_admin_usernmae_and_password() 
	{
	   System.out.println("Completed username and password entry");
	}
	@When("click on Login button")
	public void click_on_login_button() 
	{
	    System.out.println("Login Button Clicked");
	}
	
	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() 
	{
	    System.out.println("Valid Username and  invalid Password Entered");
	}
	@Then("Verify Password Error message displayed")
	public void verify_password_error_message_displayed() 
	{
	   System.out.println("Password error message displayed");
	}
	@Then("Verify Account Page displayed")
	public void verify_account_page_displayed() 
	{
	   System.out.println("Account Page is Displayed");
	}

}
