package framework.junit;

import org.junit.Assert;
import org.junit.Test;

public class Test_Asserts 
{

	@Test
	public void test1() 
	{
		Assert.assertEquals("Active", "Active");
		System.out.println("test1 pass");
	}
	
	@Test
	public void test2() 
	{
		Assert.assertEquals("login", "login");
		System.out.println("test2 pass");
	}
	
	@Test
	public void test3() 
	{
		Assert.assertTrue(false);
		System.out.println("Test3 pass");
	}


}
