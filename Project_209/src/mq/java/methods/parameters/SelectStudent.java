package mq.java.methods.parameters;

public class SelectStudent 
{
	String StudentName;
	
	public SelectStudent(String name) 
	{
		StudentName=name;
	}
	
	public void  ApplyJob(String Jobname)
	{
		System.out.println(StudentName+" Applied for "+Jobname);
	}
	
	public static void main(String[] args) 
	{
		new SelectStudent("Raj").ApplyJob("Java");
		new SelectStudent("Sam").ApplyJob("selenium");
	}

}
