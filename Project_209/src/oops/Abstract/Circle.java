package oops.Abstract;

public class Circle extends Shape
{
	

	@Override
	void draw() 
	{
		System.out.println("Draw Executed");
	}
	
	public static void main(String[] args) 
	{
		
		Circle obj=new Circle();
		obj.draw();
		obj.corners();

	}

	

}
