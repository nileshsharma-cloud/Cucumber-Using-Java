package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:/cucumberDemo/CucumberDemo/src/main/java/features/login.feature",
		glue = {"stepDefinition"}
		
		)

public class TestRunner {

}

