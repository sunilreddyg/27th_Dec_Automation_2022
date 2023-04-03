package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_NumericCells {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Excel workbook using above location
	    XSSFWorkbook book=new XSSFWorkbook(fi);
		
	    //Get Sheet access using above workbook
	    XSSFSheet sht=book.getSheetAt(1);
	    
	    //Target row using sheet reference
	    XSSFRow row=sht.getRow(1);
	    
	    
	    //Get Cell value
	    double sn_in_dble=row.getCell(0).getNumericCellValue();
	    System.out.println("Serial Number in double --> "+sn_in_dble);
	    
	    //Converting double value into Int value
	    int sn_in_num=new Double(sn_in_dble).intValue();
	    System.out.println("Serial number in numeric ---> "+sn_in_num);
	    
	    //Convert double value into text
	    String sn_in_text=NumberToTextConverter.toText(sn_in_dble);
	    System.out.println("Serial number in text format --> "+sn_in_text);
	    
	    
	    //GetPrice value from Excel cell
	    double priceIn_Dble=row.getCell(2).getNumericCellValue();
	    System.out.println("Price value is ---> "+priceIn_Dble);
	    
	    
	    
		
	}

}
