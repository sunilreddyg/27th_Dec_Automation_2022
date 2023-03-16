package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ignore_MethodExecution 
{
  @Test(enabled=false,priority=0)
  public void tc001() 
  {
	  Reporter.log("tc001 Executed",true);
  }
  
  
  @Test(priority=1)
  public void tc002() 
  {
	  Reporter.log("Tc002 Executed",true);
  }
  
  @Test(priority=2,enabled=false)
  public void tc003() 
  {
	  Reporter.log("Tc003 Executed",true);
  }
  
  
  
}
