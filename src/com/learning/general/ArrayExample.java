package com.learning.general;

import java.util.Arrays;

public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		 int[] myArr = {2,4,2,4,5,6,3};
	        System.out.println("Array size before copy: "+myArr.length);
	        int[] newArr = Arrays.copyOf(myArr, 10);
	        System.out.println("New array size after copying: "+newArr.length);
	        //print array values
	        for(int i=0;i<newArr.length;i++){
	        	System.out.print(newArr[i]+"--");
	        }	
	        System.out.println("");
	        	
	        //Compare 2 arrays	
	            String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
	            String[] strArrCopy = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
	            System.out.println("Are strArr and strArrCopy same? "
	                        +Arrays.deepEquals(strArr, strArrCopy));
	            String[] strArrMod = {"JAVA", "C++", "PERL", "STRUTS"};
	            System.out.println("Are strArr and strArrMod same? "
	                        +Arrays.deepEquals(strArr, strArrMod));
	            
	            
	           
	   
	        
	

	}

}
