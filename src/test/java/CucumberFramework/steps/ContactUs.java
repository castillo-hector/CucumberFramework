package CucumberFramework.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs {

	@Before
	public void beforeScenario(Scenario scenario) {
//		System.out.println("------------------------------");
//		System.out.println("Starting - " + scenario.getName());
//		System.out.println("------------------------------");
	}

	@After
	public void afterScenario(Scenario scenario) {
//		System.out.println("------------------------------");
//		System.out.println("Ending - " + scenario.getName());
//		System.out.println("------------------------------");
	}
	
	@Given("^user navigates to system webdriveruniversity$")
	public void user_navigates_to_system_webdriveruniversity() throws Throwable {
		System.out.println("ContactUs - 1");
	}

	@When("^user clicks on the contact us button$")
	public void user_clicks_on_the_contact_us_button() throws Throwable {
		System.out.println("ContactUs - 2");
	}

	@When("^user enter his user first name$")
	public void user_enter_his_user_first_name() throws Throwable {
		System.out.println("ContactUs -3");
	}

	@When("^user enter his user last name$")
	public void user_enter_his_user_last_name() throws Throwable {
		System.out.println("ContactUs - 4");
	}

	@When("^user enter his \"([^\"]*)\" user email$")
	public void user_enter_his_user_email(String arg1) throws Throwable {
		System.out.println("ContactUs - 5");
	}

	@When("^user enter his comment$")
	public void user_enter_his_comment() throws Throwable {
		System.out.println("ContactUs - 6");
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		System.out.println("ContactUs - 7");
	}

	@Then("^then information should succesfully be submitteb via the contact us form$")
	public void then_information_should_succesfully_be_submitteb_via_the_contact_us_form() throws Throwable {
		System.out.println("ContactUs - 8");
	}

	@Then("^the system sends warning message$")
	public void the_system_sends_warning_message() throws Throwable {
		System.out.println("ContactUs - 9");
	}


}
