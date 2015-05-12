package com.learning.general;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// HashSet contains only unique elements but ArrayList can contain duplicate
		
		//HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		
		hs.add("Ravi");
		hs.add("Shyam");
		hs.add("Ravi");
		hs.add("");
		hs.add("Hari");
		
	
		
		Iterator<String> Iter  = hs.iterator();
		while(Iter.hasNext()){
			System.out.print(Iter.next()+",");
		}
		
		System.out.println("**********************");
		System.out.println("*********Treeset *************");
		TreeSet<String> hs1 = new TreeSet<String>();
		//TreeSet class-- Maintains Assending Order
		
		hs1.add("Ravi");
		hs1.add("Shyam");
		hs1.add("Ravi");
		hs1.add(null);
		hs1.add("Hari");
		
		Iterator<String> Iter1  = hs1.iterator();
		while(Iter1.hasNext()){
			System.out.print(Iter1.next()+",");
		}

	}

}
