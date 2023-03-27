package oops.Interface;

public class FirstEdition implements Book
{

	@Override
	public void Title() 
	{
		System.out.println("Selenium.1.0");
		
	}

	@Override
	public void Author() 
	{
		System.out.println("Simmon Stewart");
	}
	

	public static void main(String[] args) 
	{
		Book obj=new FirstEdition();
		obj.Author();
		obj.Title();
		obj.PrintAddress();
	}

}
