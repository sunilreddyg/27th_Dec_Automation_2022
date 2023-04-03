package framework.datadriven.excel;

import framework.datadriven.excel.keywords.CommonExcelKeywords;

public class Run_Selected_Tests {

	public static void main(String[] args) {
		
		
		CommonExcelKeywords.GetExcelConnection("InputData.xlsx", "Condition");
		
		int LastRowNum=CommonExcelKeywords.GetLastRowCount();
		for (int i = 1; i <=LastRowNum; i++)
		{
			//Get Execution status
			String Exe_status=CommonExcelKeywords.GetStringCellData(i, 2);
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=CommonExcelKeywords.GetStringCellData(i, 0);
				String PWD=CommonExcelKeywords.GetStringCellData(i, 1);
				System.out.println(UID+"   "+PWD);
			}
		}

	}

}
