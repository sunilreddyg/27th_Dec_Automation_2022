
package framework.testng.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndependentTest
{
	
@Test(dataProvider = "dp1" ,threadPoolSize=3,invocationCount=1)
public void testMethod(int number)
{
    Long id = Thread.currentThread().getId();
    System.out.println("HELLO :  " + id);
}


@DataProvider(parallel=true)
public Object[][] dp1() 
{
  return new Object[][] 
	{
      new Object[] { 1 },
      new Object[] { 2 },
      new Object[] { 3 },
      new Object[] { 4 },
      new Object[] { 5 },
      new Object[] { 6 },
      new Object[] { 7 },
      new Object[] { 8 }

     };
}

}