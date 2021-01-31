package StoryRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/resources/Feature/GetApi.feature",
 	glue={"stepDefinition"},
	tags = {"@Sanity"}
 )
 
public class TestRunner {
 
}