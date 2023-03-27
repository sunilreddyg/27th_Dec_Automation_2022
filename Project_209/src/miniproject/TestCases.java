package miniproject;


public class TestCases extends Common_Reusable_Actions implements CommonObjects,InputData
{
	
	public void Tc001_UserLogin()
	{
		LaunchBrowser(IP_browsername);
		load_webpage(IP_Page_url);
		set_explicitwait_time(30);
		wait(3000);
		Type_text(obj_login_email, IP_login_email);
		Type_text(obj_login_password, IP_login_password);
		click_element(obj_login_Submit_button);
	}
	
	
	
	
}
