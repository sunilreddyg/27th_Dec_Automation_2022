package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_CellData_into_Excel
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		
		//Get Existing Workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Target sheet
		XSSFSheet sht=book.getSheet("Condition");
		
		//Replace existing data
		sht.getRow(1).getCell(2).setCellValue("Y");
		
		//Create Cell Data at existing row
		sht.getRow(1).createCell(3).setCellValue("Testpass");
		
		//Create Row and Create cell
		sht.createRow(13).createCell(0).setCellValue("SunilReddy");
		
		//Create Output File
		FileOutputStream fo=new FileOutputStream("TestData\\Output.xlsx");
		//Write data to new output file
		book.write(fo);
		book.close();   //Save file
		
		
}

}
