package mq.java.methods.parameters.CallByReference;

public class GetDetails 
{
	
	public void GetStudentAddress(StudentDetails std)
	{
		std.GetAddress();
	}

	public static void main(String[] args)
	{
		GetDetails obj=new GetDetails();
		obj.GetStudentAddress(new StudentDetails());

	}

}
