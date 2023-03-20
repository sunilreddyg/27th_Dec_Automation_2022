package framework.testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
	
  @Test(dataProvider="dp")
  public void VerifyOperator(String mobile,String operator) 
  {
	  System.out.println(mobile+"   "+operator);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "9030248855","Airtel" },
      new Object[] { "9441213490","BSNL" },
      new Object[] { "9030244444","Jio" },
      new Object[] { "9030256666","Airtel" },
    };
  }
  
  
  @DataProvider
  public Object[][] data() 
  {
    return new Object[][] 
    {
      new Object[] { "chrome","Darshan" },
      new Object[] { "firefox","Sam" },
      new Object[] { "ie","kumar" },
     
    };
  }
}
