package mq.java.methods;

public class TestChrome 
{
	
	public void OpneChrome() 
	{
		System.out.println("Chorme is Up and ready to use");
	}
	
	public void NavigateToFB()
	{
		System.out.println("FB page is Opened");
	}
	
	public void EnterLoginDetails()
	{
		System.out.println("Login Is successfull");
	}
	
	public static void main(String[] args) 
	{
		new TestChrome().OpneChrome();
		new TestChrome().NavigateToFB();
		new TestChrome().EnterLoginDetails();
	}

}
