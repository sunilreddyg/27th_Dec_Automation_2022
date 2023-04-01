package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_MultipleRows 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Excel workbook using above location
	    XSSFWorkbook book=new XSSFWorkbook(fi);
		
	    //Get Sheet access using above workbook
	    XSSFSheet sht=book.getSheetAt(3);
	    
	    //Get First row number and Lastrow number where data contains
	    
	    int FirstRowNum=sht.getFirstRowNum();
	    int LastRowNum=sht.getLastRowNum();
	    
	   for (int i = 1; i <= LastRowNum; i++) 
	   {
		    String UID=sht.getRow(i).getCell(0).getStringCellValue();
		    String PWD=sht.getRow(i).getCell(1).getStringCellValue();
		    
		    System.out.println(UID+"    "+PWD);
	   }
	    
	    
	    
	    
	    
	    

	}

}
