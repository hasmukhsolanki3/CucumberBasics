package steps;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	@Before("@Sanity")
	public void setUp(){
		
		System.out.println("Launch browser");
	}
	
	@After("@Sanity")
	public void tearDown(){
		
		System.out.println("driver.quit()");
	}
	
	@Before("@prod")
	public void setUpProd(){
		
		System.out.println("Launch browser for Prod");
	}
	
	@After("@prod")
	public void tearDownProd(){
		
		System.out.println("driver.quit() for Prod");
	}

	@Given("^user naviagates to Facebook site$")
	public void user_naviagates_to_Facebook_site() throws Throwable {
		
		System.out.println("Given--> user naviagates to Facebook site");
	}

	@When("^user validates the login page title$")
	public void user_validates_the_login_page_title() throws Throwable {
	
		System.out.println("When--> user validates the login page title");
	}

	@And("^user enters \"([^\"]*)\" username$")
	public void user_enters_correct_username(String username) throws Throwable {
		
		System.out.println("And--> user enters "+username+" username");
	}

	@And("^user enters \"([^\"]*)\" password$")
	public void user_enters_correct_password(String password) throws Throwable {
		
		System.out.println("And--> user enters "+password+" password");
	}
	
	@And("^user select age category and location$")
	public void user_select_age_category_and_location(DataTable table) throws Throwable {
	   
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		System.out.println("And--> user selects age catgory as - " + data.get(1)
		.get("Age")+ " and Location as - "+ data.get(0).get("Location"));
		
	}

	@Then("^user \"([^\"]*)\" logged in to Facebook successfully$")
	public void user_shouldbe_logged_in_to_Facebook_successfully(String loginType) throws Throwable {
	
		System.out.println("Then--> user "+loginType+" logged in to Facebook successfully");
	}


}
