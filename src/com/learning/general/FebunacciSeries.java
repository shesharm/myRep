package com.learning.general;

public class FebunacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "coding   ";
		
		StringBuffer bfr = new StringBuffer(str);
		System.out.println(bfr.substring(3));
		System.out.println(bfr.append("is fun"));
		System.out.println(str);
		System.out.println(bfr.insert(3, "wowwwww"));
		System.out.println(str);
		
		System.out.println(str.matches(""));
		System.out.println(bfr.reverse());
		System.out.println(bfr.replace(7, 9, "apc"));
	

	}

}
