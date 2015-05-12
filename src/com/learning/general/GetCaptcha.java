package com.learning.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetCaptcha {
	static WebDriver driver;
		
		@BeforeTest
		@Parameters({"browser"})
		public  void setup(String browser){
			
			if(browser.equals("FF")){
				System.out.println("Opening Firefox browser");
				driver = new FirefoxDriver();
			}else if(browser.equals("CH")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		
		
		@Test
		public void getValue(){
			int b = GetCaptcha();
			System.out.println(b);
		}
		

		
		@Test
		public int  GetCaptcha(){
			//driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		//	WebElement element = driver.findElement(By.xpath(".//*[@id='recaptcha_challenge_image']"));
			// element.click();
/*			 String val =element.getAttribute("value");
			 System.out.println("Captcha value "+val);*/
			
			int a = 1;
			return a;
			 
			 
		
		}

	

}
