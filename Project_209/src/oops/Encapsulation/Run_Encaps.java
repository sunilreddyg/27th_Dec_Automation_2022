package oops.Encapsulation;


public class Run_Encaps 
{

	public static void main(String[] args) 
	{
		
		Encaps obj=new Encaps();
		
		obj.setName("Ajay");
		String UID=obj.getName();
		System.out.println(UID);
		
		obj.setPassword("admin@123");
		System.out.println(obj.getPassword());
		
		

	}

}
