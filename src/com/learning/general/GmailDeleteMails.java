package com.learning.general;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailDeleteMails  extends GetPassword{

	static WebDriver driver;
	@BeforeTest
	public void SetUp(){
		driver = new FirefoxDriver();
		
		
	}
	
	
	@Test
	public void OpenBrowser(){
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//GetPassword obj = new GetPassword();
		
		String strpwd = GeneratePwd("boolean@123");
		byte[] decode  = Base64.decodeBase64(new String(strpwd));
		System.out.println("correct password is "+new String(decode));
		
		
		driver.findElement(By.id("Email")).sendKeys("sharmashekhar86@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys(new String(decode));
		driver.findElement(By.id("signIn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Social = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='aKz' and text()='Social']"))); 
		//WebElement Social = driver.findElement(By.xpath(".//div[@class='aKz' and text()='Social']"));
		Social.click();
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=':m2']/tbody/tr/td[1]"));
		System.out.println(rows.size());
		
	}

}
