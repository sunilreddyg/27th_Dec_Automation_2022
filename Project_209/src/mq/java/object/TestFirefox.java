package mq.java.object;

public class TestFirefox 
{
	
	public  TestFirefox()
	{
		System.out.println("Firefox is Opened");
	}
	
	public void minimize()
	{
		System.out.println("Firefox is Minimized");
	}
	
	public void maximize()
	{
		System.out.println("Firefox is Maximized");
	}
	

	public static void main(String[] args) 
	{
		
		new TestFirefox().minimize();
		new TestFirefox().maximize();
		
		
		
		/*
		 * Object Creation syntax:-->
		 * 	Classname obj=new Classname();
		 *  obj.methodname();
		 */
		TestFirefox obj=new TestFirefox();
		obj.minimize();
		obj.maximize();
		

	}

}
