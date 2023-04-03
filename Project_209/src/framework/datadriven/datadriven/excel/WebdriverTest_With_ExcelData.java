package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import miniproject.CommonObjects;
import miniproject.Common_Reusable_Actions;

public class WebdriverTest_With_ExcelData extends Common_Reusable_Actions implements CommonObjects
{
	
	XSSFWorkbook book;
	XSSFSheet sht;
	
	@BeforeClass
	public void SetUpExcel() throws IOException
	{
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("config");
	}

	@Test
	public void Tc001_VerifyUSerlogin()
	{
		String BrowserName=sht.getRow(1).getCell(0).getStringCellValue();
		String URL=sht.getRow(1).getCell(1).getStringCellValue();
		String UID=sht.getRow(1).getCell(2).getStringCellValue();
		String PWD=sht.getRow(1).getCell(3).getStringCellValue();
		
		LaunchBrowser(BrowserName);
		load_webpage(URL);
		set_explicitwait_time(10000);
		wait(5000);
		
		Type_text(obj_login_email, UID);
		Type_text(obj_login_password, PWD);
		click_element(obj_login_Submit_button);
		
	}

}
