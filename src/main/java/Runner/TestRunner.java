package Runner;

import org.junit.runner.RunWith;

//import org.testng.annotations.Test;

//import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\eclipse\\workspace\\Cucumber\\src\\main\\java\\Feature", 
	
		glue={"StepDefinition"}, 
		format= {"pretty","html:target/Cucumber", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true, tags= {"@Sanity,@Bvt"},
				strict = true, 
				dryRun = false
)




public class TestRunner { 
//extends AbstractTestNGCucumberTests {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 

}
 