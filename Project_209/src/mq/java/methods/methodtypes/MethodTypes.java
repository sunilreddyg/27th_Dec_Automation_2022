package mq.java.methods.methodtypes;

import io.netty.handler.ssl.SslContextOption;

public class MethodTypes 
{
	/*
	 * => Void is a method type
	 * => Void method doesn't return any value
	 * => otherthan void all methods return values
	 */
	public void method1() 
	{
		String name="Selenium";     //Local Variable
		System.out.println(name);
	}
	
	/*
	 * => Other than void methods we should write return keyword
	 * => Return keyword must write at the end of the method
	 * => Return value should match with method type
	 * => Finally value return to method name
	 */
	
	//String return type method
	public String method2()
	{
		return "9030248855";
	}
	
	//Integer return type method
	public int method3(int a, int b)
	{
		return a*b;
	}
	
	//Double return type method
	public double method4()
	{
		return 1234.12;
	}
	
	//boolean return method
	public boolean method5()
	{
		return true;
	}
	
	//char return method
	public char method6()
	{
		return 'A';
	}
	
	

	public static void main(String[] args) 
	{
	
			MethodTypes obj=new MethodTypes();
			obj.method1();  //Calling void method
			
			//Calling String return method
			String Mobile=obj.method2();
			System.out.println(Mobile.length());
			System.out.println(Mobile.startsWith("9030"));
			
			//Calling Integer return method
			int total=obj.method3(10,20);
			System.out.println(total+10);
			
			//Calling Double return method
			double price=obj.method4();
			System.out.println(price);
			
			//Calling boolean return method
			boolean flag=obj.method5();
			System.out.println(flag);
			
			//Calling char return method
			char ch=obj.method6();
			System.out.println(ch);

	}

}
