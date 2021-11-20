package com.gojek.listeners;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.gojek.base.Base;

public class CustomListener extends Base implements ITestListener {

	public void onFinish(ITestContext result) {

	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*****Test case failed and details are " + result.getName() + "*****");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****Test case skipped and details are " + result.getName() + "*****");

	}

	public void onTestStart(ITestResult result) {
		System.out.println("*****Test case started and details are " + result.getName() + "*****");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****Test case success and details are " + result.getName() + "*****");

	}

	public void onFinish(ISuite result) {

	}

	public void onStart(ISuite result) {
		// TODO Auto-generated method stub

	}

}
