package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_File 
{

	public static void main(String[] args) throws IOException 
	{
		
		
		String path="TestData\\InputData.xlsx";
		FileInputStream fi=new FileInputStream(path);
		System.out.println("File read successful");
		
		//Target Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target Sheet
		XSSFSheet sht=book.getSheet("config");
		
		//Target Row
		XSSFRow row=sht.getRow(1);
		
		//Target cell
		XSSFCell cell=row.getCell(0);
		
		//Read Text from cell
		String BrowserName=cell.getStringCellValue();
		System.out.println(BrowserName);
		
		//Using row reference get cell data
		String HRM_Url=row.getCell(1).getStringCellValue();
		System.out.println(HRM_Url);
		
		//Usig Row reference get cell data
	    String Username=row.getCell(2).getStringCellValue();
	    String Password=row.getCell(3).getStringCellValue();
	    
	    System.out.println(Username+"   "+Password);
		
	    String Header=sht.getRow(2).getCell(0).getStringCellValue();
	    System.out.println(Header);
	}

}
