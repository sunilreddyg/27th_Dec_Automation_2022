package framework.testng;

import org.testng.annotations.Test;

public class Method_Description 
{
	
	
	@Test(description="Verifying login with valid data")
	public void Tc001()
	{
		System.out.println("Login Test passed");
	}
	
	@Test(description="Verifying login with Invalid data")
	public void Tc002()
	{
		System.out.println("Login Test failed");
	}

}
