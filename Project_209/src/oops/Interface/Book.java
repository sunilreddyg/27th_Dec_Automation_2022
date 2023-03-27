package oops.Interface;

interface  Book 
{
	String publisher="MQ";   //In Interface class variable are by default final and Static 
	
	public void Title();   //By default methods are abstracted
	public void Author();
	
	public default  void PrintAddress()
	{
		System.out.println("HYD,PinCode 500075");
	}
	
	
}
