package framework.datadriven.excel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.datadriven.excel.keywords.CommonExcelKeywords;
import miniproject.CommonObjects;
import miniproject.Common_Reusable_Actions;

public class TestWith_ExcelData2 extends Common_Reusable_Actions implements CommonObjects
{
	
	@BeforeClass
	public void Setup()
	{
		CommonExcelKeywords.GetExcelConnection("InputData.xlsx", "config");
	}
	
	@Test
	public void VerifyLogin()
	{
		LaunchBrowser(CommonExcelKeywords.GetStringCellData(1, 0));
		load_webpage(CommonExcelKeywords.GetStringCellData(1, 1));
		set_explicitwait_time(10000);
		Type_text(obj_login_email, CommonExcelKeywords.GetStringCellData(1, 2));
		Type_text(obj_login_password, CommonExcelKeywords.GetStringCellData(1, 3));
		click_element(obj_login_Submit_button);
	}
	
	
	
}
