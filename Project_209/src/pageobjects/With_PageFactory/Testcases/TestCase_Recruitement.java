package pageobjects.With_PageFactory.Testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.With_PageFactory.Pages.HRM_Loginpage;
import pageobjects.With_PageFactory.Pages.MenuTabs;
import pageobjects.With_PageFactory.Pages.RecruitementPage;
import pageobjects.With_PageFactory.keywords.CommonReusableActions;

public class TestCase_Recruitement 
{
	WebDriver driver;
	CommonReusableActions keywords;
	HRM_Loginpage login;
	MenuTabs tabs;
	RecruitementPage rec;
	
	String browsername="chrome";
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/";
	
	public TestCase_Recruitement()
	{
	
		  keywords=new CommonReusableActions();
		  keywords.LaunchBrowser(browsername);
		  keywords.loadingwebpage(url);
		  this.driver=keywords.getDriver();
		  
		 
		  login=new HRM_Loginpage(driver);
		  tabs=new MenuTabs(driver);
		  rec=new RecruitementPage(driver);
		 
	}
	
	
	public void Add_Vacant_EmployeeDetails()
	{
		  keywords.time(2000);
		  keywords.TypeText(login.username, login.UID);
		  keywords.TypeText(login.password, login.PWD);
		  keywords.ClickElement(login.login);
		  keywords.time(3000);
		  
		  keywords.ClickElement(tabs.recruitment);
		  keywords.time(2000);
		  
		  keywords.ClickElement(rec.vacancies);
		  keywords.time(2000);
		  
		  keywords.ClickElement(rec.add);
		  keywords.time(2000);
		  
		  if(keywords.VerifyTextPresented(rec.pageheader, rec.ExpHeader))
		  {
			  keywords.TypeText(rec.Firstname, rec.Fname);
		  }
		  else
		  {
			  System.out.println("Wrong Header displayed");
		  }
	}
	
	
	public static void main(String[] args) 
	{
		  TestCase_Recruitement tc=new TestCase_Recruitement();
		  tc.Add_Vacant_EmployeeDetails();
	}

}
