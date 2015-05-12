package com.learning.general;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.StringTokenizer;

public class StringFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	//convert char array into string
		 char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
		 String  arr = String.copyValueOf(ch);
		 
		 System.out.println(arr);
		 
		 // compare string with string buffer
	        String c = "We are comparing the content with a StringBuffer content";
	        StringBuffer sb =
	            new StringBuffer("We are comparing the content with a StringBuffer content");
	        *//**
	         * We can use contentEquals() method to compare content with a StringBuffer.
	         * It returns boolean value.
	         *//*
	        if(c.contentEquals(sb)){
	            System.out.println("The content is equal");
	        } else {
	            System.out.println("The content is not equal");
	        }
	        
	        
	        //for getting the position of char or substring - gives the first occurrence
	        System.out.println(c.indexOf("the"));
	        
	        //getting position in reverse order - gives the last occurrence
	        System.out.println(c.lastIndexOf("with"));

	        
	        //remove multiple spaces 
	        String str = "String    With Multiple      Spaces";
	        StringTokenizer st = new StringTokenizer(str, " ");
	        StringBuffer sb1 = new StringBuffer();
	        while(st.hasMoreElements()){
	            sb1.append(st.nextElement()).append(" ");
	        }
	        System.out.println(sb1.toString().trim());
	
*/	
		
		
		try {
			Robot rb = new Robot();
			String str = "F:/Data/Resume/New_Resumes/latest 7 july 2014/Shekhar_AutomationTesting.doc";
			for(int i=0;i<str.length();i++){
				char ch = str.charAt(i);
				String Char1 = str.valueOf(ch);
				rb.keyPress(ch);
				rb.keyRelease(ch);
				
			}
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		 

	}

}
