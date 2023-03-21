package framework.testng.DataProvider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageobjects.With_PageFactory.keywords.CommonReusableActions;

public class WebDriverTest_With_DataProvider 
{
	
	String url="http://facebook.com";
	CommonReusableActions actions;
	
	
	@AfterMethod
	public void CloseBrowser() throws Exception
	{
		Thread.sleep(4000);
		actions.CloseBrowser();
	}
	
  @Test(dataProvider="data",dataProviderClass=InputData.class,threadPoolSize=2)
  public void TestwithBrowsers(String browsername,String username) 
  {
	   actions=new CommonReusableActions();
	   actions.LaunchBrowser(browsername);
	   actions.loadingwebpage("http://facebook.com");
	   actions.TypeText("//input[@id='email']", username);
  }
}
