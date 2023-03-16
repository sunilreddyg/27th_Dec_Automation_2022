package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngTest 
{
  
  @Test
  public void tc001() 
  {
	  Reporter.log("Tc001 Successful",true);
  }
  
  
  @Test
  public void tc002() 
  {
	  Reporter.log("Tc002 Successful",true);
  }
  
  
  @Test
  public void tc003() 
  {
	  Reporter.log("Tc003 Successful",true);
  }
  
  
}
