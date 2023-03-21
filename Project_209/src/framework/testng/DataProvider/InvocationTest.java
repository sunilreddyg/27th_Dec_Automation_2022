package framework.testng.DataProvider;

import org.testng.annotations.Test;

public class InvocationTest 
{
	
  @Test(invocationCount=10)
  public void f() 
  {
	  System.out.println("Test");
  }
}
