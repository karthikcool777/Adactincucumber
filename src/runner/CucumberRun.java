package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featureff",glue="stepdefinetion" ,dryRun=false, monochrome=true ,tags= {"@tag5,@tag12"},plugin= {"pretty",
		"html:Reports\\HtmlReport","junit:Reports\\XmlReport\\home.xml","json:Reports\\JsonReport\\fb.json"})

public class CucumberRun {

	@AfterClass
	public static void jvmReportGenenration() 
	{
		JvmReport.generateJvmReport("C:\\Users\\DELL\\eclipse-workspace\\Cucumberday1\\Reports\\JsonReport\\fb.json");
	}
	
	
	
	
}
