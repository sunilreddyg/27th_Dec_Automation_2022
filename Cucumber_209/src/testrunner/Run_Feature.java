package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\background.feature",glue="stepdefination",dryRun=false,monochrome=true)
public class Run_Feature 
{
	
}
