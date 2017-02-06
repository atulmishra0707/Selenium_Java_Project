package com.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GoogleTest1 {

	public static void main(String [] args) throws AWTException{
		System.out.println("Hello Selenium");
		
		// Block code for FireFox Browser  
		System.setProperty("webdriver.gecko.driver","C:/opt/cda/workspace/SeleniumTest/resource/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://172.22.49.239:8100/#/app/cardboard/home");
		driver.get("https://www.google.com");
		//driver.findElement(By.id("lst-ib")).sendKeys("Java");
		driver.findElement(By.linkText("Gmail")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.id("returnButton")).click();
		//driver.findElement(By.name("Gmail")).sendKeys("Java");
		//WebElement elem1 = driver.findElement(By.id("returnButton"));
		//WebElement elem1 = driver.findElement(By.xpath("//button[@id='returnButton']"));
		//WebElement elem1 = driver.findElement(By.xpath("//button[text()='Go Back']"));
		//WebElement elem1 = driver.findElement(By.xpath("//button[contains(text(),'Go Back')]"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", elem1);
		
		//elem1.click();
		
		
		// Block code for Chorme Browser
		System.setProperty("webdriver.chrome.driver","C:/opt/cda/workspace/SeleniumTest/resource/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("http://172.22.49.239:8100/#/app/cardboard/home");
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		
		driver.findElement(By.name("btnG")).click();
		//or
		/*WebElement elem = driver.findElement(By.name("btnG"));
		elem.click();*/
		//or 
		/*driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);*/
		
		/*// Block code for IE Browser
		System.setProperty("webdriver.ie.driver","C:/opt/cda/workspace/SeleniumTest/resource/MicrosoftWebDriver.exe");
		driver = new InternetExplorerDriver();
		//driver.get("http://172.22.49.239:8100/#/app/cardboard/home");
		driver.get("https://www.google.com");
		driver.findElement(By.id("q")).sendKeys("Java");
		driver.findElement(By.name("btnG")).click();*/
		
		
		// Handle Multiple Controls in Selenium.
		WebDriver wd = new FirefoxDriver();  // get the Web Driver
		//wd.manage().window().maximize();// Maximize the browser		
		wd.get(""); //get the page by URL.
		wd.findElement(By.linkText("")).click(); // find element by link text for Hyper link and perform click event.
		wd.findElement(By.id("")).click(); // find element by Id and perform click event.
		wd.findElement(By.name("")).click(); // find element by name and perform click event.
		wd.findElement(By.name("")).sendKeys(""); // find element by name and perform sendKeys event to assign value.
		new Select(wd.findElement(By.name(""))).selectByVisibleText(""); // find select box element by name and select option by visible text. here select is an class to perform operation on select control.
		wd.findElement(By.xpath("\\input[@value='bad']")).click(); // find element by xpath and perform event like Handle radio button.
		wd.findElement(By.xpath("\\input[@id='name']")).getText(); // find element by xpath and get text.
		wd.findElement(By.name("")).getAttribute("title");// get tooltip text by get attribute
		wd.findElement(By.name("")).getCssValue("background-color");// get tooltip text by get attribute
		
		// handle Alert to verify alert message.
		wd.switchTo().alert().getText();
		//or
		Alert alert = wd.switchTo().alert();
		alert.getText();
		
		wd.switchTo().alert().accept();
		
		// handle Confirmation Box with Ok and Cancel button.
		wd.switchTo().alert().accept(); // Ok
		wd.switchTo().alert().dismiss(); // Cancel
		
		
		//Key board access
		wd.findElement(By.name("")).sendKeys(Keys.CONTROL + "A");
		wd.findElement(By.name("")).sendKeys(Keys.CONTROL + "C");
		wd.findElement(By.name("")).sendKeys(Keys.TAB);
		wd.findElement(By.name("")).sendKeys(Keys.CONTROL + "V");
		
		
		// Drag and Drop element from src to dest.
		WebElement wes = wd.findElement(By.name("")); // get source element
		WebElement wed = wd.findElement(By.name(""));// get destination element
		Actions actionBuilder = new  Actions(wd); // perform Drag and drop.
		actionBuilder.dragAndDrop(wes,wed).build().perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		//handle Parent Window
		wd.getWindowHandle();
		//handle child window properties
		for(String childwin : wd.getWindowHandles()){
			wd.switchTo().window(childwin);
		}
	}	
}


// Add TestNG plugin - TestNG - http://beust.com/eclipse
// To Generate report need 3 API's as below - 
/*ReportNG API
Guice API
Velocity dep API*/
