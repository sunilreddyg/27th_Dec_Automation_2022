package miniproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Run_Testcases extends TestCases
{
  @Test
  public void Test1_VerifyLogin() 
  {
	  Tc001_UserLogin();
	  wait(4000);
	  Assert.assertTrue(CheckObjectVisibility(obj_Logout_Menu));
  }
}
