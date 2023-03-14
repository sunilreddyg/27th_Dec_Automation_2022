package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass //Method invoke before execution of first @Test annotation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass  //Method invoke after execution of last @Test annotation
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class Postcondition");
	}

	@Test //@Test annotation invoke method to run without object creation
	public void tests() 
	{
		System.out.println("test1 Executed");
	}
	
	
	@Test //@Test annotation invoke method to run without object creation
	public void testx() 
	{
		System.out.println("test2 Executed");
	}
	
	@Test //@Test annotation invoke method to run without object creation
	public void testa() 
	{
		System.out.println("test3 Executed");
	}


}
