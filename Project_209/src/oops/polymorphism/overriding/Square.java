package oops.polymorphism.overriding;

public class Square extends Shape
{
	
	public void draw()
	{
		System.out.println("square Class Method");
	}
	
	

	public static void main(String[] args) 
	{
		
		Square obj=new Square();
		obj.draw();
		
		Shape ref=new Square();
		ref.draw();
		
	
	}

}
