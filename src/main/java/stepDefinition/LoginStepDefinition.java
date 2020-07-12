package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition{

	WebDriver driver;
	
	@Given("User is already on login page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}
	
	@When("user should be on title page")
	public void user_should_be_on_title_page() {
		System.out.println("User is title page.");
	}


	@Then("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}


	@Then("user is click on login button")
	public void user_is_click_on_login_button() {
		System.out.println("user click on login button.");
	}


	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("user navigated to home page.");
	}




	
}
