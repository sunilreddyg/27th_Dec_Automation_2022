package miniproject;

public interface CommonObjects 
{
	//By Default Interface class variables are static and Final
	String obj_login_email="//input[@name='username']";
	String obj_login_password="//input[@name='password']";
	String obj_login_Submit_button="//button[contains(.,'Login')]";
	String obj_Logout_Menu="//p[contains(.,'Paul Collings')]";
	String obj_logout_option="//a[@href='/web/index.php/auth/logout']";

}
