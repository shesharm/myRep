package com.learning.general;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserName {

	static WebDriver driver;
		
		@BeforeTest
		public void setUp(){
			driver = new FirefoxDriver();
		}
		
		@Test
		public void OpenBrowser(){
			driver.get("http://google.com");
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			System.out.println(js.executeScript("return navigator.appCodeName"));
			
			String s = (String) js.executeScript("return navigator.userAgent");
			System.out.println("Browser name-- "+s);
			
			System.out.println("title--"+driver.getTitle());
		}
		
		@AfterTest
		public void close(){
			driver.quit();
		}
		
		
		



}
