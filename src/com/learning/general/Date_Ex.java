package com.learning.general;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Ex {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
	
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		
		long milli = System.currentTimeMillis();
		Date d2 = new Date(milli);
		System.out.println(d2);
		
		System.out.println(d2.toString());
		

		String date2 = DateFormat.getTimeInstance().format(d2);
		System.out.println(date2);
		
		String strDate = "31 Mar, 2015";
		Date d3 =DateFormat.getDateInstance().parse(strDate);
		System.out.println(d3);
		//System.out.println(fd.parse());
		
		//Converting string into date
		String str2 = "12-01-2013";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(formatter.parse(str2));
		
		
		Calendar c = Calendar.getInstance();
		c.setTime(d3);
		System.out.println("year: "+c.get(Calendar.YEAR));
		System.out.println("Day of month: "+c.get(Calendar.DAY_OF_MONTH));
	}
	

}
