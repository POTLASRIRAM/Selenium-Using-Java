package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		             features = {".//featureFiles/Login.feature"},
		             glue = "stepDefinitionFile"
		
		
		)


public class TestRunner {

}
