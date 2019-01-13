package CucumberFramework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	ChromeDriver driver;

	@Before()
	public void setup(Scenario scenario) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\hcastillo\\projects\\cucumber\\code\\01_tmp\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		System.out.println("------------------------------");
//		System.out.println("Starting - " + scenario.getName());
//		System.out.println("------------------------------");

	}

	@After()
	public void tearDown(Scenario scenario) throws Exception {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			driver.close();
			driver.quit();
			driver = null;	
		}
		
//		System.out.println("------------------------------");
//		System.out.println("Ending - " + scenario.getName());
//		System.out.println("------------------------------");
	}

	@Given("^user navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		driver.get("https://stackoverflow.com/");
	}

	@Given("^user clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		// driver.findElement(By.xpath("/html/body/header/div/ol/li[6]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Log In')]")).click();
		Thread.sleep(5000);
	}

	@Given("^user enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hgcr89@gmail.com");
	}

	@Given("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Onix_128");
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
	}

	@Then("^user should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Thread.sleep(9000);
		WebElement askQuestionButton = driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
		Assert.assertEquals(true, askQuestionButton.isDisplayed());
	}

}
