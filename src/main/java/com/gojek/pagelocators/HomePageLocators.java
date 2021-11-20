package com.gojek.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gojek.base.Base;

public class HomePageLocators extends Base {

	@FindBy(xpath = "//a[@class='btn buy'][contains(.,'BUY NOW')]")
	public WebElement buyNow;

	@FindBy(xpath = "//div[@class='cart-checkout'][contains(.,'CHECKOUT')]")
	public WebElement cartCheckout;

	@FindBy(xpath = "//a[@class='button-main-content']")
	public WebElement orderContinue;

	@FindBy(xpath = "//div[@class='list-title text-actionable-bold'][contains(.,'Credit Card')]")
	public WebElement creditcard;

	@FindBy(xpath = "//input[contains(@name,'cardnumber')]")
	public WebElement cardNumber;

	@FindBy(xpath = "//input[contains(@placeholder,'MM / YY')]")
	public WebElement expiryDate;

	@FindBy(xpath = "//input[contains(@maxlength,'6')]")
	public WebElement cvvNumber;

	@FindBy(xpath = "//a[@class='button-main-content'][contains(.,'Pay Now')]")
	public WebElement payNow;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit'][contains(.,'OK')]")
	public WebElement okTransaction;

}
