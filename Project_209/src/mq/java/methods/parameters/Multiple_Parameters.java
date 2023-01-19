package mq.java.methods.parameters;

public class Multiple_Parameters 
{

	//Sequence parameters
	public void method1(int a, int b)
	{
		System.out.println(a+b);
	}
	
	//Method with different parameters
	public void method2(String productname,int quantity)
	{
		System.out.println(productname+"    "+quantity);
	}
	
	//Method overloading
	public void method2(int quantity,String productname)
	{
		System.out.println(productname+"    "+quantity);
	}

	public static void main(String[] args) 
	{
		Multiple_Parameters obj=new Multiple_Parameters();
		
		//Calling method with sequence parameters
		obj.method1(100, 200);
		
		//Calling emthod with different parameters
		obj.method2("iphone", 3);

	}

}
