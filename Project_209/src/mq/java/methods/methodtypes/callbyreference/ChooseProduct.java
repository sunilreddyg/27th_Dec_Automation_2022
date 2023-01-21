package mq.java.methods.methodtypes.callbyreference;

public class ChooseProduct 
{
	
	
	public static Book1 SelectFirstBook()
	{
		return new Book1();
	}
	
	public static Book2 SelectSecondBook() {
		return new Book2();
	}
	
	public static void main(String[] args) 
	{
		String BookName=ChooseProduct.SelectFirstBook().GetName();
		double BookPrice=ChooseProduct.SelectFirstBook().GetPrice();
		
		System.out.println(BookName+"   "+BookPrice);
		
		double price=ChooseProduct.SelectFirstBook().GetFinalDiscount().PerCentage10();
		System.out.println(price);
		
		
	}

}
