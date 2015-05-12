package com.learning.naukri;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.learning.testbase.TestBase;

public class naukri extends TestBase {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("siteUrl"));
		Thread.sleep(10000);
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys("sharmashekhar86@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("boolean@1234");
		driver.findElement(By.xpath(prop.getProperty("submit"))).click();
		driver.findElement(By.xpath(prop.getProperty("view_update_profile"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("uploadResume"))).click();
		driver.findElement(By.xpath(prop.getProperty("browse_bttn"))).click();
		
		/*Process proc = new ProcessBuilder(System.getProperty("user.dir")+"\\src\\com\\learning\\util\\temp2.exe",
				"F:\\Data\\Testing\\Resume\\New_Resumes\\latest 7 july 2014\\Shekhar_AutomationTesting.doc","Open").start();
		*/Thread.sleep(5000);
/*		Actions act = new Actions(driver);
		act.sendKeys("F:\\Data\\Testing\\Resume\\New_Resumes\\latest 7 july 2014\\Shekhar_AutomationTesting.doc").perform();
		act.sendKeys(Keys.SHIFT).perform();
		act.sendKeys(Keys.ENTER).perform();*/
		
	/*	try {
			Robot rb = new Robot();
			String str = "F:/Data/Resume/New_Resumes/latest 7 july 2014/Shekhar_AutomationTesting.doc";
			for(int i=0;i<str.length();i++){
				char ch = str.charAt(i)
			}
		} catch (AWTException e) {
			
			e.printStackTrace();
		}*/
	
		driver.findElement(By.xpath(".//*[@id='editForm']/div[8]/button")).click();


	}

}
