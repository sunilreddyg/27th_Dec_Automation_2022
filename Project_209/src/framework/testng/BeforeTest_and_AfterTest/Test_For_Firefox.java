package framework.testng.BeforeTest_and_AfterTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test_For_Firefox
{
	
	

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  
	  @Test
	  public void Logout()
	  {
		  System.out.println("Logout");
	  }
	  
	  
	  @BeforeSuite
	  public void beforesuite()
	  {
		  System.out.println("Browser Initiation Successful");
	  }
}
