package StepDefinition;



import java.util.List;
import java.util.Map;

//import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep {
	
	@Before
	public void Setup() {
		System.out.println("Launch the Browser");
		
		
	}
	@After
	public void teardown() {
		System.out.println("driver.quit()");
	}
	@Before("@Prod")
	public void SetupProd()
	{
		System.out.println("Launch the Browser for Production");
		
		
	}
	@After("@Prod")
	public void teardownProd() {
		System.out.println("driver.quit() for Production");
	}




	
	 @Given("^user navigates to facebook website$")
	 public void user_navigates_to_facebook_website(){
	
	 System.out.println("@Given--user navigates to facebook website");
	 }
	
	
	 @When("^user validates to facebook homepage title$")
	 public void user_validates_to_facebook_homepage_title(){
	 System.out.println("@When-- user_validates_to_facebook_homepage_title");
		 }
	
	

@Then("^user entered  \"(.*?)\" username$")
public void user_entered_username(String arg1) throws Throwable {
System.out.println("@Then--user entered username");
}

@Then("^user entered  \"(.*?)\" password$")
public void user_entered_password(String arg1) throws Throwable {
System.out.println("@Then--user entered password");
}

@Then("^user \"(.*?)\" sucessfully logged in$")
public void user_sucessfully_logged_in(String validateLogin) throws Throwable {


	 System.out.println("@Then--user "+validateLogin+" sucessfully logged in");
}


@Then("^user select age category$")
public void user_select_age_category(DataTable table) throws Throwable {
   
   List<Map<String,String>> data = table.asMaps(String.class, String.class);
		   System.out.println("@Then--user select age category:"+data.get(1).get("Age") +"---Selected location as :"+data.get(0).get("location"));
   

}
	
}
