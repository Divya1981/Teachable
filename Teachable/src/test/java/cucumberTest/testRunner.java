package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature_files",
		glue= {"stepDefinitions"},
		plugin = {"pretty","html:target/cucumber-htmlreport/cucumber.html",
				"junit:target/cucumber-junitreport/cucumber.xml",
				"json:target/cucumber-jsonreport/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		},
		monochrome = true
		
		)
public class testRunner {

}
