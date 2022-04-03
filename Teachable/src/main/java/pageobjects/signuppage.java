package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.base;

public class signuppage extends base{
	
	public WebElement webElement_enter_name() {
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		return name;
	}
	public WebElement webElement_enter_email() {
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		return email;
	}
	public WebElement webElement_enter_password() {
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        return password;
	}
	public WebElement webElement_signup() {
        WebElement signup = driver.findElement(By.xpath("//input[@name='commit']"));
        return signup;
	}
	public WebElement webElement_login_link() {
        WebElement login_link = driver.findElement(By.xpath("//a[@href='/secure/123/identity/login']"));
        return login_link;
	}
}
