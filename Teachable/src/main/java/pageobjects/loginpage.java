package pageobjects;

import baseclass.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage extends base {

	  public WebElement webElement_enter_email() {

		WebElement U_email = driver.findElement(By.xpath("//input[@id='email']"));
		return U_email;
	}
	
	public WebElement webElement_enter_password() {

		WebElement U_password = driver.findElement(By.xpath("//input[@id='password']"));
		return U_password;
	}
	
	public WebElement webElement_click_login() {

		WebElement login = driver.findElement(By.xpath("//input[@name='commit']"));
		return login;
	}
	
	public WebElement webElement_click_signup() {

		WebElement signup = driver.findElement(By.xpath("//a[@href='/secure/123/identity/sign_up']"));
		return signup;
	}
	public WebElement webElement_forgot_password() {

		WebElement forgot_password = driver.findElement(By.xpath("//a[@href='/secure/123/identity/forgot_password']"));
		return forgot_password;
	}
}
