package otherpackage;

import mq.java.constructor.TestGear;
import mq.java.methods.TestChrome;

public class TestRun 
{

	public static void main(String[] args) 
	{
		
		TestChrome obj=new TestChrome();
		obj.OpneChrome();
		obj.NavigateToFB();
		obj.EnterLoginDetails();
		
		TestGear ref=new TestGear();
		ref.ChangeToFirstGear();
		ref.ChangeToSecondGear();
		
	}

}
