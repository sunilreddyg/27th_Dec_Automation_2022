package framework.testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Inputdata2 
{
  @Test(dataProvider = "mobile_info")
  public void TestMobliePrices(String phonename,double price, boolean status) 
  {
	  
  }

  @DataProvider
  public Object[][] mobile_info() 
  {
    return new Object[][] 
    {
      new Object[] { "iphone",35000.00,true},
      new Object[] { "samsung",32000.00,false},
      new Object[] { "oneplus",22000.00,true},
      new Object[] { "vivo",0,true},
    };
  }
}
