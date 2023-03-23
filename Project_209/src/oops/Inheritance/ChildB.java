package oops.Inheritance;

public class ChildB extends ChildA
{

	public void method3()
	{
		method1();    //From parent class
		method2();    //From ChildA class
	}
	

	public static void main(String[] args) 
	{
		
		ChildB abc=new ChildB();
		abc.method1();     //Parent Class method
		abc.method2();     //ChildA class method
		abc.method3();     //ChildB class method
		

		ChildA obj=new ChildB();
		obj.method1();   //Parent Class
		obj.method2();   //ChildA class method
		
		
		Parent ref=new ChildB();
		ref.method1();  //Parent Class

	}

}
