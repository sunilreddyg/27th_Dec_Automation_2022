package framework.datadriven.excel.keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonExcelKeywords 
{
	
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	public static String path="TestData\\";
	/*
	 * Target Excel Workbook And Sheet
	 */
	public static void GetExcelConnection(String WorkbookName,String sheetname) 
	{
		try {
			FileInputStream fi=new FileInputStream(path+WorkbookName);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Get Row Data and Cell Data
	public static String GetStringCellData(int row, int cell)
	{
		  String CellData=sht.getRow(row).getCell(cell).getStringCellValue();
		  return CellData;
	}
	
	
	
	

}
