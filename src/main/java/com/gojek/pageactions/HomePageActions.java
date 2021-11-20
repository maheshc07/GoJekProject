package com.gojek.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.gojek.base.Base;
import com.gojek.base.Constants;
import com.gojek.pagelocators.HomePageLocators;

public class HomePageActions extends Base {
	public HomePageLocators HomePageActions;

	public HomePageActions() {
		this.HomePageActions = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(factory, this.HomePageActions);
	}

	public HomePageActions buyNowPillow() {
		click(HomePageActions.buyNow);
		return this;
	}

	public HomePageActions shoppingCart() {
		click(HomePageActions.cartCheckout);
		return this;
	}

	public HomePageActions orderSummary() {
		click(HomePageActions.orderContinue);
		return this;
	}

	public HomePageActions cardpayment() {
		click(HomePageActions.creditcard);
		return this;
	}

	public HomePageActions cardDetails1() {
		type(HomePageActions.cardNumber, Constants.credit1);
		type(HomePageActions.expiryDate, Constants.expiry);
		type(HomePageActions.cvvNumber, Constants.cvvNumber);
		click(HomePageActions.payNow);
		return this;
	}

	public HomePageActions cardDetails2() {
		type(HomePageActions.cardNumber, Constants.credit2);
		type(HomePageActions.expiryDate, Constants.expiry);
		type(HomePageActions.cvvNumber, Constants.cvvNumber);
		click(HomePageActions.payNow);
		return this;
	}

	public HomePageActions transactionCompleted() {
		type(HomePageActions.password, Constants.bankOtp);
		click(HomePageActions.okTransaction);
		return this;
	}
}
