package oops.Inheritance.webdriver;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RunTestcase extends PIM_Testcase
{
  @Test
  public void VerifyAddEmployeeButton() throws Exception 
  {
	  AddEmployee("Aryan", "Tej", "Kumar");
	  Thread.sleep(5000);
	  Assert.assertTrue(verify_text_visible_at_webpage("Personal Details"));
  }
  

}
