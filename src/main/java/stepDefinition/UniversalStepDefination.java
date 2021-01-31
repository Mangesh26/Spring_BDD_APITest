package stepDefinition;


import org.apache.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UniversalStepDefination{

	 //Define Logs
	 static Logger logger = Logger.getLogger("Login_Steps.class");
	 
	
	 @Given("^Get the list of users$")
	 public void get_the_list_of_users() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     System.out.println("Calling Given...");
	 }
	
	 @When("^access the api$")
	 public void access_the_api() {
		 System.out.println("Calling When..");
	 }
}
