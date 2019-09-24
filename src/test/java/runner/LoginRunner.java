package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="featureFile",
		glue= {"stepDefination"},
		plugin={"html:target/Reports",
				"json:target/jsonreport.json",
				"pretty:target/pretty-report.txt",
				"usage:target/usage-report.json",
				"junit:target/junit-report.xml"},
		monochrome=true)
public class LoginRunner {

}
