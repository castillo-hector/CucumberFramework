package CucumberFramework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps2 {
	@Given("^user navigates to stackoverflow website_(\\d+)$")
	public void user_navigates_to_stackoverflow_website_(int arg1) throws Throwable {
		System.out.println("user_navigates_to_stackoverflow_websit");
	}

	@Given("^user clicks on the login button on homepage_(\\d+)$")
	public void user_clicks_on_the_login_button_on_homepage_(int arg1) throws Throwable {
		System.out.println("user_clicks_on_the_login_button_on_homepage");
	}

	@Given("^user enters a valid username_(\\d+)$")
	public void user_enters_a_valid_username_(int arg1) throws Throwable {
		System.out.println("user_enters_a_valid_username");
	}

	@Given("^user enters a valid password_(\\d+)$")
	public void user_enters_a_valid_password_(int arg1) throws Throwable {
		System.out.println("user_enters_a_valid_password");
	}

	@When("^user clicks on the login button_(\\d+)$")
	public void user_clicks_on_the_login_button_(int arg1) throws Throwable {
		System.out.println("user_clicks_on_the_login_button");
	}

	@Then("^user should be taken to the successful login page_(\\d+)$")
	public void user_should_be_taken_to_the_successful_login_page_(int arg1) throws Throwable {
		System.out.println("user_should_be_taken_to_the_successful_login_page");
	}

}
