package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Bollean_And_DateCell_Data {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Excel workbook using above location
	    XSSFWorkbook book=new XSSFWorkbook(fi);
		
	    //Get Sheet access using above workbook
	    XSSFSheet sht=book.getSheetAt(2);
	    
	    //Target row using sheet reference
	    XSSFRow row=sht.getRow(1);
	    
	    //Get Boolean value from excel
	    boolean flag=row.getCell(1).getBooleanCellValue();
	    //Convert primitive value to non primitive and Convert into Text
	    String flag1=new Boolean(flag).toString();
	    System.out.println("boolean value into string is --> "+flag1);
	    
	    
	    
	    //Read date cell value from excel
	    Date date=row.getCell(2).getDateCellValue();
	    System.out.println(date.toString());
	    
	    //Convert date using simple formatter
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    System.out.println(sdf.format(date));
	    
	    
	    
	}

}
