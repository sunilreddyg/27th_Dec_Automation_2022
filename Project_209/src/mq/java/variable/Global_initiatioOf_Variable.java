package mq.java.variable;

public class Global_initiatioOf_Variable 
{
    static int a;
    
	public static void main(String[] args) 
	{
		
	     a=100;
		 System.out.println("Before "+a);
		 a=200;
		 System.out.println("After "+a);
		 
		 
		 //Global Variable using Condition
		 int x;
		 if(true)
		 {
			 x=300;
		 }
		 System.out.println(x);
		

	}

}
