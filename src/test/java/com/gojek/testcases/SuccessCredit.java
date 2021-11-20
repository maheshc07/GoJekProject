package com.gojek.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gojek.base.Base;
import com.gojek.pageactions.HomePageActions;

public class SuccessCredit extends Base {
	public HomePageActions hpa;
	public WebElement name;

	@BeforeClass(alwaysRun = true)
	public void setup() {
		Reporter.log("Browser Started");
		Base.initConfiguration();
	}

	@Test(priority = 1)
	public void mainPage() {
		Reporter.log("Home Page Loaded");
		hpa = new HomePageActions();
		hpa.buyNowPillow();
		name = driver.findElement(By.xpath("//span[contains(.,'Shopping Cart')]"));
		Assert.assertEquals(name.getText(), "Shopping Cart  ");
	}

	@Test(priority = 2)
	public void shoppingCart() {
		Reporter.log("Shopping Cart Loaded");
		hpa.shoppingCart();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().frame("snap-midtrans");
		String text = driver.getTitle();
		System.out.println(text);
		name = driver.findElement(By.xpath("//p[@class='text-page-title-content'][contains(.,'Order Summary')]"));

		Assert.assertEquals(name.getText(), "Order Summary");
	}

	@Test(priority = 3)
	public void orderSummary() {
		Reporter.log("Order Summary Loaded");
		hpa.orderSummary();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String text = driver.getTitle();
		System.out.println(text);
		name = driver.findElement(By.xpath("//p[@class='text-page-title-content'][contains(.,'Select Payment')]"));
		Assert.assertEquals(name.getText(), "Select Payment");
	}

	@Test(priority = 4)
	public void cardPayment() {
		Reporter.log("Card Payment Loaded");
		hpa.cardpayment();
		name = driver.findElement(By.xpath("//p[@class='text-page-title-content'][contains(.,'Credit Card')]"));
		Assert.assertEquals(name.getText(), "Credit Card");
	}

	@Test(priority = 5)
	public void cardDetails() throws InterruptedException {
		Reporter.log("Credit Card Details");
		hpa.cardDetails1();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		name = driver.findElement(By.xpath("//div[@class='row page-header'][contains(.,'Issuing Bank')]"));
		Assert.assertEquals(name.getText(), "Issuing Bank");
	}

	@Test(priority = 6)
	public void transactionCompleted() {
		Reporter.log("Transaction Page Loaded");
		hpa.transactionCompleted();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.switchTo().parentFrame();
		name = driver.findElement(By.xpath("//span[contains(.,'Thank you for your purchase.')]"));
		Assert.assertEquals(name.getText(), "Thank you for your purchase.");

	}
	
	@AfterClass(alwaysRun = true)
	public static void tearDown() {
		Reporter.log("Browser Ended");
		driver.quit();
	} 

}
