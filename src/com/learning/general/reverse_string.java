package com.learning.general;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class reverse_string {


	public static void main(String[] args) {
	
		//first way
		
/*		String val = "This is my program";
		String con="";
		int strlen = val.length();
		
		for(int i=0;i<strlen;i++){
			String str1 = val.valueOf(val.charAt(i));
			con = str1+con;
		}
		System.out.println(con);*/
		
		
		//2nd way 
		
/*	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);*/
		
		
	//3rd way	
		
/*		String val = "This is my program";
		String con="";
		int strlen = val.length();
		
		for(int i=0;i<strlen;i++){
			con =val.charAt(i)+con;

		}
		System.out.println(con);*/
		
		//4th way 
	/*	String val = "Java is fun";
		StringBuffer str = new StringBuffer(val);
		
		System.out.println(str.reverse());
		
*/	
		
	//5th way
		String s = "Program";
		

		System.out.println(reverse(s));

	}


	public static String reverse(String s) {
		if (s.length() == 1) 
			return s;
		else
			return reverse(s.substring(1)) + s.charAt(0);
		}
}
