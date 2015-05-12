package com.learning.general;

import java.util.ArrayList;
import java.util.List;

public class findDuplicate {


	public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i=1;i<30;i++){
    	list.add(i);

    }
    list.add(22);

    findDuplicate dn = new findDuplicate();
    dn.findDuplicateNumber(list);
    System.out.println("Duplicate number is "+dn.findDuplicateNumber(list));
    

	}
	
	 public int findDuplicateNumber(List<Integer> numbers){
         
	        int highestNumber = numbers.size() - 1;
	        System.out.println("highestnumber "+highestNumber);
	        int total = getSum(numbers);
	        System.out.println(total);
	        int duplicate = total - (highestNumber*(highestNumber+1)/2);
	        return duplicate;
	    }
	
	public int getSum(List<Integer> numbers){
		
		int sum=0;
		for(int num:numbers){
			sum +=num;
		}
		return sum;
		
	}
	
	

}
