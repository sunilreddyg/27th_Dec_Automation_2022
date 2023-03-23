package oops.Inheritance.webdriver;

import pageobjects.With_PageFactory.Pages.MenuTabs;
import pageobjects.With_PageFactory.Pages.PIM_AddEmployee;

public class PIM_Testcase extends TestBase
{
	
	MenuTabs tabs;
	PIM_AddEmployee pim;
	public PIM_Testcase() 
	{
		setupbrowser();
		userlogin();
		tabs=new MenuTabs(driver);
		pim=new PIM_AddEmployee(driver);
	}
	
	public void AddEmployee(String firstname,String middlename,String lastname)
	{
		click_element(tabs.pIM);
		click_element(pim.addEmployee);
		Type_text(pim.Firstname, firstname);
		Type_text(pim.MiddleName, middlename);
		Type_text(pim.Lastname, lastname);
		click_element(pim.save);
	}
	

}
