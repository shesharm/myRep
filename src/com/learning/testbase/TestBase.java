package com.learning.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {
	
	public static Properties prop;

	@Test
	public static  void init() throws IOException{
		 prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\learning\\util\\project.properties");
		prop.load(ip);
	}
	
}
