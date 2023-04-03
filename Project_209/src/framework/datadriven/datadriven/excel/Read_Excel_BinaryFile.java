package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_BinaryFile 
{

	public static void main(String[] args) 
	{
		
		FileInputStream fi=null;
		
		try {
			fi=new FileInputStream("TestData\\InputData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(fi!=null)
		{
			System.out.println("File read succesful");
			
			XSSFWorkbook book;
			try {
				book=new XSSFWorkbook(fi);
				String Browsername=book.getSheet("config").getRow(1).getCell(0).getStringCellValue();
				System.out.println(Browsername);
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		else
		{
			System.out.println("File reading failed");
		}
		
		

	}

}
