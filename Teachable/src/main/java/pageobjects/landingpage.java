package pageobjects;

import baseclass.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class landingpage extends base {
	
	public WebElement webElement_login_option() {

		WebElement login_option = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
		return login_option;
	}
	
	public WebElement webElement_signup_option() {

		WebElement signup_option = driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right btn-lg']"));
		return signup_option;
	}
	
}
