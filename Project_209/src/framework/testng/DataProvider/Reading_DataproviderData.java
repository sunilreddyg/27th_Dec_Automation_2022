package framework.testng.DataProvider;

import org.testng.annotations.Test;

public class Reading_DataproviderData 
{
	
	/*
	 * Reading dataprovider data from different class
	 */
	
	@Test(dataProvider="mobile_info",dataProviderClass=Inputdata2.class)
	public void TestMobile(String mobile,double price,boolean status)
	{
		
	}

}
