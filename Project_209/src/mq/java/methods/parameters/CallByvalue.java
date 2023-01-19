package mq.java.methods.parameters;

public class CallByvalue 
{
	
	//Method with string parameter
	public void method1(String name) 
	{
		System.out.println(name);
	}
	
	//Method with integer parameter
	public void method2(int num)
	{
		System.out.println(num);
	}
	
	//Method with boolean parameter
	public void method3(boolean flag)
	{
		System.out.println(flag);
	}
	
	//Method with double parameter
	public void method4(double val)
	{
		System.out.println(val);
	}
	
	//Method with char parameter
	public void method5(char ch)
	{
		System.out.println(ch);
	}
	

	public static void main(String[] args) 
	{
		
		CallByvalue obj=new CallByvalue();
		obj.method1("sunil");
		obj.method2(150);
		obj.method3(true);
		obj.method4(15000.00);
		obj.method5('A');
		
	}
}
