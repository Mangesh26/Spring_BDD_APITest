package stepDefinition;


import java.io.FileReader;
import java.util.Properties;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UniversalStepDefination{

	 //Define Logs
	 static Logger logger = Logger.getLogger("Login_Steps.class");
	 
	
	 @Given("^Get the list of users$")
	 public void get_the_list_of_users() throws Throwable {
		 String path = System.getProperty("user.dir");
		 path = path+"\\src\\main\\resources\\application.properties";
		 FileReader reader=new FileReader(path);  
	      
		    Properties p=new Properties();  
		    p.load(reader);  
		      
		    System.out.println(p.getProperty("GET_URL"));  
		    System.out.println(p.getProperty("USER_AGENT"));
	 }
	
	 @When("^access the api$")
	 public void access_the_api() {
		 System.out.println("Calling When..");
	 }
}
