package com.atul.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CumtomListner extends TestListenerAdapter{

	@Override
	public void onTestFailure(ITestResult arg) {
		//super.onTestFailure(arg);
		System.out.println("Test case failed :: " + arg.getName());
		File scrFile = ((TakesScreenshot) FirstMavenSeleniumTest.webDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("..//target/"+ arg.getName() +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult arg) {
		//super.onTestSuccess(arg);
		System.out.println("Test case pass :: " + arg.getName());
	}
}
