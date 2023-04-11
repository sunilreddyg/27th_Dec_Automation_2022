package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumTest 
{
	WebDriver driver;
	@Given("navigate to outlook page")
	public void navigate_to_outlook_page() 
	{
	   driver=new ChromeDriver();
	   driver.get("http://outlook.com");
	   driver.manage().window().maximize();
	}
	@Given("clicking on sigin button")
	public void clicking_on_sigin_button() 
	{
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
	}
	@When("user enter invalid email address")
	public void user_enter_invalid_email_address() 
	{
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("qadarshan@gmail.com");

	}
	@When("click on next button")
	public void click_on_next_button() 
	{

		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
	}
	@Then("verify Error Message Displayed")
	public void verify_error_message_displayed() 
	{
	    System.out.println("Error Message Displayed");
	}


}
