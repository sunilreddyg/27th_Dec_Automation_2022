package oops.Inheritance.webdriver;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TestBase extends Common_Reusable_Actions
{
	String location_uid="//input[@name='username']";
	String location_pwd="//input[@type='password']";
	String location_login_button="//button[contains(.,'Login')]";
	String browser="chrome";
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UID="Admin";
	String PWD="admin123";
	
	public void setupbrowser()
	{
		LaunchBrowser(browser);
		load_webpage(url);
		maximizeBrowser();
		set_explicitwait_time(50);
	}
	
	public void userlogin()
	{
		Type_text(location_uid, UID);
		Type_text(location_pwd, PWD);
		click_element(location_login_button);
	}
	
	public void endbrowser()
	{
		close_browser();
	}
	
	

}
