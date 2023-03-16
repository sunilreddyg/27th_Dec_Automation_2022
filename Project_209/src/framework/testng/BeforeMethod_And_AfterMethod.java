package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod {
 
	
  @Test
  public void tc001() 
  {
	  System.out.println("Tc001 executed successful");
  }
  
  
  @Test
  public void tc002() 
  {
	  System.out.println("Tc002 executed successful");
  }
  
  @Test
  public void tc003() 
  {
	  System.out.println("Tc003 executed successful");
  }
  
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Test Precondition");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Test PostCondition");
  }

}
