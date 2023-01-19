package mq.java.methods.parameters;

public class Calculator 
{
	//Global Variable
	int x;
	int y;
	
	//Constructor with parameters
	public Calculator(int a, int b) 
	{
		x=a;    //Local variable assigning values to global variables
		y=b;
	}
	
	public void add()
	{
		System.out.println(x+y);
	}
	
	public void mul()
	{
		System.out.println(x*y);
	}
	
	public static void main(String[] args)
	{
		new Calculator(10,30).add();
		new Calculator(30, 20).add();
		new Calculator(10, 5).mul();
	}

}
