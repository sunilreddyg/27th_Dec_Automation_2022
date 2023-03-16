package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
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
  
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Class PreCondition");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Class Postcondition");
  }

}
