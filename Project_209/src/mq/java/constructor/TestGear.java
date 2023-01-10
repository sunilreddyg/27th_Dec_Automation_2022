package mq.java.constructor;

public class TestGear 
{
	public TestGear() 
	{
		System.out.println("Hold Clutch");
	}
	
	public void ChangeToFirstGear() 
	{
		System.out.println("FirstGear Changed");
	}
	
	public void ChangeToSecondGear() 
	{
		System.out.println("SecondGear Changed");
	}
	

	public static void main(String[] args) 
	{
		new TestGear().ChangeToFirstGear();
		new TestGear().ChangeToSecondGear();
	}

}
