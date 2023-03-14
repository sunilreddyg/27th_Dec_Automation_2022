package framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
		({ 
			Before_And_After.class, 
			BeforeClass_And_AfterClass.class, 
			MyJunitTest.class, 
			Test_Asserts.class,
			Webdriver_Test1.class 
		})
public class AllTests 
{

}
