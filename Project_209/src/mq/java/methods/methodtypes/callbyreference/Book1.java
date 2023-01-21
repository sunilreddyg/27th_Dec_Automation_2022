package mq.java.methods.methodtypes.callbyreference;

public class Book1 
{
	//instant variables
	String Name="Selenium1";
	double price=2500.00;
	
	
	//Instant Method
	public void PrintDetails()
	{
		System.out.println(Name+"    "+price);
	}
	
	public String  GetName()
	{
		return Name;
	}
	
	public double GetPrice()
	{
		return price;
	}
	
	public DisCount GetFinalDiscount()
	{
		return new DisCount();
	}

}
