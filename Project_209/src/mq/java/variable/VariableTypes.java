package mq.java.variable;
public class VariableTypes 
{
	//Global variable instant type
	int a=200;
	String name="Selenium";
	
	//Global variable static type
	static int b=300;
	static double price=25000.00;
	
	public static void main(String args[])
	{
		//Calling Instant variable using object creation
		VariableTypes obj=new VariableTypes();
		int x=obj.a;
		System.out.println(x);  
		System.out.println(obj.a);
		
		String toolname=obj.name;
		System.out.println(toolname);
		
		//Calling static variable using object creation
		int y=VariableTypes.b;
		System.out.println(y);
		
		double val=VariableTypes.price;
		System.out.println(val);
		
		
	}

}
