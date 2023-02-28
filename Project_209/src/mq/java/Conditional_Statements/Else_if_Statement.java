package mq.java.Conditional_Statements;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Else_if_Statement {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Elseif:-->
		 * 		Multiple decision take place here..
		 */
		
		int month=3;
		
		if (month==1) 
		{
			System.out.println("jan");
		}
		else if (month==2) 
		{
			System.out.println("feb");
		}
		else if (month==3) 
		{
			System.out.println("mar");
		}
		else
		{
			System.out.println("Month Mismatched");
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browsername");
		String Browser=sc.nextLine();
		
		
		WebDriver driver = null;
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(Browser.equals("edge"))
		{
			driver=new  EdgeDriver();
		}
		
		
		//Decision accept only when browser successfully initiated
		if(driver!=null)
		{
			driver.get("http://facebook.com");
		}
		else
		{
			System.out.println("Browser initiation failed");
		}
		
		
		
		
	}

}
