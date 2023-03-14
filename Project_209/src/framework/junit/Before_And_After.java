package framework.junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After 
{

	@Before //Invoke method before each @Test annotation
	public void setUp() throws Exception 
	{
		System.out.println("Test PreCondition");
	}

	@After //Invoke method after each @Test annotation
	public void tearDown() throws Exception 
	{
		System.out.println("Test postcondition");
	}

	@Test //@Test annotation invoke method to run without object creation
	public void test1() 
	{
		System.out.println("test1 Executed");
	}
	
	
	@Test //@Test annotation invoke method to run without object creation
	public void test2() 
	{
		System.out.println("test2 Executed");
	}
	
	@Test //@Test annotation invoke method to run without object creation
	public void test3() 
	{
		System.out.println("test3 Executed");
	}

}
