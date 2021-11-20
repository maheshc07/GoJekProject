package com.gojek.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {

	public static WebDriver driver;
	public static String browser;

	public static WebDriverWait wait;

	public static void initConfiguration() {
		if (Constants.browser.equals("chrome")) {
			String path = "C:\\Users\\Admin PC\\eclipse-workspace\\GoJekAutomation\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();

		} else if (Constants.browser.equals("firefox")) {
			String path = "C:\\Users\\Admin PC\\eclipse-workspace\\GoJekAutomation\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser is not Supported");
		}
		driver.manage().window().maximize();
		driver.get(Constants.URL);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	public static void type(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void click(WebElement element) {

		element.click();
	}

	public static void isdisplay(WebElement element) {

		element.isDisplayed();

	}

	public static void isenabled(WebElement element) {

		element.isEnabled();

	}

	public static void clear(WebElement element) {

		element.clear();

	}

	public static void pageText(WebElement element) {

		element.getText();

	}

	public static void quitBrowser() {

		driver.quit();

	}
}
