package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration 
{
	
	@Given("site url as {string}")
	public void site_url_as(String string) 
	{
		System.out.println("Url is Opened");
	}
	@Given("click on Register with us")
	public void click_on_register_with_us() 
	{
	    System.out.println("Register button get clicked");
	}
	@When("user enter valid mobilenumber {string}")
	public void user_enter_valid_mobilenumber(String string) 
	{
	    System.out.println("Mobile Entry Successful---> "+string);
	}
	@When("Enter firstname as {string}")
	public void enter_firstname_as(String string) 
	{
	    System.out.println("Firstname Entry Successful --> "+string);
	}
	@When("Enter Surname as {string}")
	public void enter_surname_as(String string) 
	{
	    System.out.println("Surname Entry Successful --> "+string);
	}
	
	@When("Enter password and retype password  {string} and {string}")
	public void enter_password_and_retype_password_and(String string, String string2) 
	{
		System.out.println("Password entered ---> "+string);
		System.out.println("Retype password entered ---> "+string2);
	}

	@When("Enter age as {int}")
	public void enter_age_as(Integer int1) 
	{
	    System.out.println("Entry Age Completed --> "+int1);
	}
	@When("click on Register")
	public void click_on_register() 
	{
	    System.out.println("Click on Register button");
	}
	@Then("verify Sucessful message")
	public void verify_sucessful_message() 
	{
	   System.out.println("Account created Successful");
	}


}
