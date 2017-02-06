package com.atul.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
	WebDriver webDriver;
  @Test
  public void fc_1() {
	  
	  //System.out.println("Hello");
	  System.setProperty("webdriver.chrome.driver", "C:/Users/ADHYAN MISHRA/workspace/workspace1/Selenium_Java_Project/src/test/resources/chromedriver.exe");
	  
	  webDriver = new ChromeDriver();
	  webDriver.get("http://www.google.com");
	  webDriver.findElement(By.name("q")).sendKeys("java");
  }
  @Test
  public void fc_2() {
	  //System.setProperty("webdriver.ie.driver", "pathToTheIEDriver");
	  //System.setProperty("webdriver.chrome.driver", "C:/Users/ADHYAN MISHRA/workspace/workspace1/Selenium_Java_Project/test/main/resources/chromedriver.exe");
	  //System.setProperty("webdriver.gecko.driver", "C:/Users/ADHYAN MISHRA/workspace/workspace1/Selenium_Java_Project/test/main/resources/geckodriver.exe");
	  //webDriver = new ChromeDriver();
	  //webDriver.get("http://www.google.com");
	  webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
}
