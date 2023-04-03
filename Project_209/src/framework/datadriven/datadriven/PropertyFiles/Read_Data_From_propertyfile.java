package framework.datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_propertyfile 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target Property file
		FileInputStream fi=new FileInputStream("src\\framework\\datadriven\\PropertyFiles\\input.properties");
		System.out.println("File located");
		
		//Create object for property files
		Properties repository=new Properties();
		//Loading input data to repository
		repository.load(fi);
		
		
		//Get Property value using propertyname
		String url=repository.getProperty("application.url");
		System.out.println(url);
		
		
		//Get Username and Password
		String UID=repository.getProperty("username");
		String PWD=repository.getProperty("password");
		System.out.println(UID+"   "+PWD);
		
		
		//Set Key and value to repository file
		repository.setProperty("Result", "Tc001_Executed Succesful");
		
		//Store Data to New Propery file
		FileOutputStream fo=new FileOutputStream("TestData\\OP.properties");
		repository.store(fo, "MY First Test result");
		
	}

}
