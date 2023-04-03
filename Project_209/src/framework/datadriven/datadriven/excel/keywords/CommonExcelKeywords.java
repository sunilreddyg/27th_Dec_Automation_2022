package framework.datadriven.excel.keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;

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
	
	//Get Row Data and Cell Data
	public static double GetNumericData(int row, int cell)
	{
		  Double CellData=sht.getRow(row).getCell(cell).getNumericCellValue();
		  return CellData;
	}
		
	
	//Get LastRowCount
	public static int GetLastRowCount()
	{
		return sht.getLastRowNum();
	}
	
	
	//Write Existing Cell Data
	public static void WriteCellData(int row, int cell, String CellData)
	{
		sht.getRow(row).getCell(cell).setCellValue(CellData);
	}
	
	
	//Create New Cell Data at existing row
	public static void WriteNewCellData(int row, int cell, String CellData)
	{
		sht.getRow(row).createCell(cell).setCellValue(CellData);
	}
	
	
	//Create New Cell Data at existing row
	public static void CreatenewCellAndNewRowData(int row, int cell, String CellData)
	{
		sht.createRow(row).createCell(cell).setCellValue(CellData);
	}
		
	
	
	//Write Into output file
	public static void CreateOutputFile(String Outputfile)
	{
		try {
			FileOutputStream fo=new FileOutputStream(path+Outputfile);
			book.write(fo);
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
