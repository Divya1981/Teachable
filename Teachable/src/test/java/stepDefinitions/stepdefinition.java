package stepDefinitions;

import pageobjects.loginpage;
import pageobjects.landingpage;
import pageobjects.signuppage;

import baseclass.base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class stepdefinition extends base {
	public landingpage landingpage;
	public loginpage loginpage;
	public signuppage signuppage;

	@Given("User navigates to correct url")
	public void user_navigates_to_correct_url() {
		String browserName = null;
		base base = new base();
		base.loadConfig();
		base.getDriver();
		base.launchApp(browserName);
		base.screenshot(driver, "projectScreenshots\\landingpage.png");
	}

	@Given("User Clicks on Login option")
	public void user_clicks_on_login_option() {
		base base = new base();
		landingpage = new landingpage();
		landingpage.webElement_login_option().click();
		System.out.println("----Login Button Clicked---");
		base.wait_time();
	}

	@Given("User enters correct email")
	public void user_enters_correct_email() {
		base base = new base();
		base.enter_email();

	}

	@Given("User enters correct password")
	public void user_enters_correct_password() {
		base base = new base();
		base.enter_password();

	}

	@When("User clicks Login button")
	public void user_clicks_login_button() {
		base base = new base();
		loginpage loginpage = new loginpage();
		loginpage.webElement_click_login().click();
		base.wait_time();
	}

	@Then("User should land on the homepage_signup with {string}")
	public void user_should_land_on_the_homepage_signup_with(String url) {
		base base = new base();
		base.wait_time();
		String currentURL = driver.getCurrentUrl();
		System.out.println("----Current URL---" + currentURL);
		Assert.assertEquals(currentURL, url);
		System.out.println("----User On Homepage---");
		base.screenshot(driver, "projectScreenshots\\home.png");

	}

	@Then("User should land on the homepage with {string}")
	public void user_should_land_on_the_homepage_with(String url) {
		base base = new base();
		base.wait_time();
		String currentURL = driver.getCurrentUrl();
		System.out.println("----Current URL---" + currentURL);
		Assert.assertEquals(currentURL, url);
		System.out.println("----User On Homepage---");
		base.screenshot(driver, "projectScreenshots\\home.png");

	}

	@Then("User exits the website")
	public void user_exits_the_website() {
		driver.quit();
	}

	@Given("User enters email as {string}")
	public void user_enters_email_as(String email) {
		loginpage = new loginpage();
		base base = new base();
		base.wait_time();
		loginpage.webElement_enter_email().sendKeys(email);
	}

	@Given("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginpage = new loginpage();
		loginpage.webElement_enter_password().sendKeys(password);
	}

	@Then("User should stay on the login page with login {string}")
	public void user_should_stay_on_the_login_page_with_login(String status) {
		base base = new base();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://sso.zeachable.com/secure/123/identity/login");
		System.out.println("----User On Login page---");
		System.out.println("----Login Status---" + status);
		base.screenshot(driver, "projectScreenshots\\login.png");
	}

	@When("User clicks Signup link at bottom of screen")
	public void user_clicks_signup_link_at_bottom_of_screen() {
		loginpage = new loginpage();
		loginpage.webElement_click_signup().click();
		System.out.println("----Signup Link Clicked---");
	}

	@Then("User should land on signup page")
	public void user_should_land_on_signup_page() {
		base base = new base();
		base.wait_time();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://sso.zeachable.com/secure/123/identity/sign_up/with_email");
		System.out.println("----User On Signup page---");
		base.screenshot(driver, "projectScreenshots\\signup.png");
	}

	@When("User clicks Forgot Password")
	public void user_clicks_forgot_password() {
		loginpage = new loginpage();
		loginpage.webElement_forgot_password().click();
		System.out.println("----Forgot Password Link Clicked---");
	}

	@Then("User should land on Reset Password page")
	public void user_should_land_on_reset_password_page() {
		base base = new base();
		base.wait_time();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://sso.zeachable.com/secure/123/identity/forgot_password");
		System.out.println("----User On Reset Password page---");
		base.screenshot(driver, "projectScreenshots\\reset_password.png");
	}

	@Given("User clicks on Signup option")
	public void user_clicks_on_signup_option() {
		base base = new base();
		landingpage = new landingpage();
		landingpage.webElement_signup_option().click();
		base.wait_time();
	}

	@Given("User enters name")
	public void user_enters_name() {
		signuppage = new signuppage();
		signuppage.webElement_enter_name().sendKeys("TestUser");
		System.out.println("----Name entered---");
	}

	@Given("User enters valid email")
	public void user_enters_valid_email() {
		base base = new base();
		signuppage = new signuppage();
		String email = base.getRandomEmail();
		signuppage.webElement_enter_email().sendKeys(email);
		System.out.println("----Email entered---" + email);
	}

	@Given("User enters valid password")
	public void user_enters_valid_password() {
		signuppage = new signuppage();
		signuppage.webElement_enter_password().sendKeys("Test1234");
		System.out.println("----Password entered---");
	}

	@When("User clicks signup button")
	public void user_clicks_signup_button() {
		base base = new base();
		signuppage = new signuppage();
		signuppage.webElement_signup().click();
		System.out.println("----Signup Button Clicked---");
		base.screenshot(driver, "projectScreenshots\\signup.png");
	}

	@When("User clicks Login link at bottom of screen")
	public void user_clicks_login_link_at_bottom_of_screen() {
		signuppage = new signuppage();
		signuppage.webElement_login_link().click();
		System.out.println("----Login Link Clicked---");
	}

	@Then("User should land on login page")
	public void user_should_land_on_login_page() {
		base base = new base();
		base.wait_time();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://sso.zeachable.com/secure/123/identity/login");
		System.out.println("----User On Login page---");
		base.screenshot(driver, "projectScreenshots\\login.png");
	}

	@Given("User enters Name as {string}")
	public void user_enters_name_as(String Name) {
		base base = new base();
		base.wait_time();
		signuppage = new signuppage();
		signuppage.webElement_enter_name().sendKeys(Name);
		System.out.println("----Name entered---" + Name);
	}

	@Given("User enters Email as {string}")
	public void user_enters_Email_as(String Email) {
		signuppage = new signuppage();
		signuppage.webElement_enter_email().sendKeys(Email);
		System.out.println("----Email entered---" + Email);
	}

	@Given("User enters Password as {string}")
	public void user_enters_Password_as(String Password) {
		signuppage = new signuppage();
		signuppage.webElement_enter_password().sendKeys(Password);
		System.out.println("----Password entered---" + Password);
	}

	@Then("User should not be able to signup with status {string}")
	public void user_should_not_be_able_to_signup_with_status(String status) {
		base base = new base();
		base.wait_time();
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://sso.zeachable.com/secure/123/identity/sign_up/with_email");
		System.out.println("----User is displayed an error message---" + status);
		base.screenshot(driver, "projectScreenshots\\signup_error.png");
	}

}
