package baseclass;

import pageobjects.loginpage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static Properties prop;
	public static WebDriver driver;
    public loginpage loginpage;
    
	public void loadConfig() {

		System.out.println("==================loadConfig===========================");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\configurations\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebDriver getDriver() {

		return driver;
	}

	public void launchApp(String browserName) {
		
		String browserName1 = prop.getProperty("browser");

		System.out.println("---------Brower--------  " + browserName1);
		if (browserName1.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName1.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName1.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get(prop.getProperty("url"));
		System.out.println("----User is on Teachable site----");
	}

	public void enter_email() {
		loginpage=new loginpage();
		String email = prop.getProperty("email");
		System.out.println("Email   :-" + email);
		loginpage.webElement_enter_email().sendKeys(email);
	}

	public void enter_password() {
		loginpage=new loginpage();
		String password = prop.getProperty("password");
		System.out.println("Password   :-" + password);
		loginpage.webElement_enter_password().sendKeys(password);

	}

	public void wait_time() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void screenshot(WebDriver driver, String fileWithPath) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(fileWithPath));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

	public String getRandomEmail() {

		return getSaltString() + "@aol.com";

	}

}
