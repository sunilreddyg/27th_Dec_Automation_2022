package pageobjects.With_PageFactory.RunPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.With_PageFactory.Testcases.LeaveTest;
import pageobjects.With_PageFactory.Testcases.TestCase1;

public class SampleRun {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		/*TestCase1 tc=new TestCase1(driver);
		tc.Add_Valid_EmployeeDetails();*/
		
		
		LeaveTest test=new LeaveTest(driver);
		test.ApplyLeaveonvalidDate();
		
	}

}
