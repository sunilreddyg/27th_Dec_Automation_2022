package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundCheck 
{
	@Given("Navigating to Page")
	public void navigating_to_page() 
	{
	    System.out.println("All Preconditions setup");
	}
	@When("book1 is selected")
	public void book1_is_selected() 
	{
	    System.out.println("Book 1 is Selected");
	}
	@Then("Check Author of book is {string}")
	public void check_author_of_book_is(String string) 
	{
	    System.out.println("Book1 Author name is --> "+string);
	}
	
	@When("book2 is selected")
	public void book2_is_selected() 
	{
	  System.out.println("Book 2 is Selected");
	}
	@Then("Check Author of book2 is {string}")
	public void check_author_of_book2_is(String string) 
	{
	    System.out.println("Book 2 Author name is ---> "+string);
	}
	
	@When("book3 is selected")
	public void book3_is_selected() {
	    System.out.println("Book 3 is Selected");
	}
	@Then("Check Author of book3 is {string}")
	public void check_author_of_book3_is(String string) 
	{
	    System.out.println("book 3 author name is --> "+string);
	}


}
