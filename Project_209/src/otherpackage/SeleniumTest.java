package otherpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest 
{

	public static void main(String[] args) 
	{
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		
		String pagetitle=chrome.getTitle();
		System.out.println(pagetitle);

	}

}
