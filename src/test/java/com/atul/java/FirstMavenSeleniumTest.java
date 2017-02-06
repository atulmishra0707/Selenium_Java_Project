package com.atul.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstMavenSeleniumTest {
	
	public static WebDriver webDriver;
  @Test
  public void fc_1() {	  
	  //System.out.println("Hello");
	  if(webDriver.findElement(By.name("q")).isDisplayed())
	  webDriver.findElement(By.name("q")).sendKeys("java");
  }
  @Test
  public void fc_2() {
	  //System.setProperty("webdriver.ie.driver", "pathToTheIEDriver");
	  if(webDriver.findElement(By.name("q")).isDisplayed())
	  webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @Parameters("browser")
  @BeforeClass
  public void launchBrowser(String browser){
	  if("Chrome".equalsIgnoreCase(browser)){
		  System.setProperty("webdriver.chrome.driver", "C:/Users/ADHYAN MISHRA/workspace/workspace1/Selenium_Java_Project/src/test/resources/webDriver/chromedriver.exe");
		  webDriver = new ChromeDriver();
	  }else if("FireFox".equalsIgnoreCase(browser)){
		  System.setProperty("webdriver.gecko.driver", "C:/Users/ADHYAN MISHRA/workspace/workspace1/Selenium_Java_Project/src/test/resources/webDriver/geckodriver.exe");
		  webDriver = new FirefoxDriver();
	  }else if("ie".equalsIgnoreCase(browser)){
		  System.setProperty("webdriver.ie.driver", "C:/Users/ADHYAN MISHRA/workspace/workspace1/Selenium_Java_Project/src/test/resources/webDriver/MicrosoftWebDriver.exe");
		  webDriver = new InternetExplorerDriver();
	  }
	  
	  if(webDriver != null)
		  webDriver.get("http://www.google.com");
  }
}
