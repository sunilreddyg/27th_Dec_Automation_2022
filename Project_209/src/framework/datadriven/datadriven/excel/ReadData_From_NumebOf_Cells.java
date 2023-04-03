package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_NumebOf_Cells {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Excel workbook using above location
	    XSSFWorkbook book=new XSSFWorkbook(fi);
		
	    //Get Sheet access using above workbook
	    XSSFSheet sht=book.getSheetAt(4);
	    
	    
	    //Get First cell number and Lastcell number where data contains at selected row
	    XSSFRow row=sht.getRow(3);
	    
	    int FirstCellNum=row.getFirstCellNum();
	    int LastCellNum=row.getLastCellNum();
	    
	    
	    for (int i = FirstCellNum; i < LastCellNum; i++) 
	    {
			  String Cellvalues=row.getCell(i).getStringCellValue();
			  System.out.println(Cellvalues);
		}
	    
	    
	}

}
