package com.learning.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Highlight {
	static WebDriver driver;
	
		
		@BeforeTest
		public void SetUp(){
			driver = new FirefoxDriver();
			
			
		}
		
		
		@Test
		public void OpenBrowser(){
			driver.get("https://www.google.co.in/?gws_rd=ssl");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
			highlight(driver, element);
		}
		
		
		@Test
		public void highlight(WebDriver driver,WebElement element){
			
			for(int i=0;i<2;i++){
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].setAtrribute('style',arguments[1]);", element, "color: yellow; border: 2px solid yellow;");
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
				Alert alert = driver.switchTo().alert();
				
			}
		}

	}


