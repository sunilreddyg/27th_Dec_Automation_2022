package mq.java.methods;

public class Calling_Methods 
{
	
	public static void Method1() 
	{
		System.out.println("Method 1 is Executed");
		
		//Calling non static method with in Static method
		new Calling_Methods().Method2();
	}
	
	public void Method2() 
	{
		System.out.println("Method 2 Executed");
	}
	
	public void Method3()
	{
		Method1();    //Calling Static method with in Instant method
		Method2();   //Calling instant method with in Instant method 
	}
	
	public static void main(String args[])
	{
		Method1();
		new Calling_Methods().Method2();
	}
}
