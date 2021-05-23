package stepDefinition;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Action.Action;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class UniversalStepDefination{

	//Define Logs
	static Logger logger = Logger.getLogger("Login_Steps.class");
	 
	 
	@Autowired
	private Action action;
	 
	 @Given("^Get the list of users$")
	 public void get_the_list_of_users() throws Throwable {
		 //action.inilization().inilizeFile();
		   System.out.println("hello"); 
		 //  action.format();
	 }
	
	 @When("^access the api$")
	 public void access_the_api() {
		 System.out.println("Calling When..");
	 }
	 
}
