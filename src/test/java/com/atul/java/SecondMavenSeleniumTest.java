package com.atul.java;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SecondMavenSeleniumTest {
	@Test
	public void fc_3() throws InterruptedException{
		Thread.sleep(3000);
		FirstMavenSeleniumTest.webDriver.findElement(By.linkText("Free Java Download")).click();
	}

}
