package com.learning.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {


	public static void main(String[] args) {
		
		
		//Hashtable<String, String> table = new Hashtable<>();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hari");
		al.add("Shekhar");
		al.add("Shikha");
		al.add(1, "Pankaj");
		
		//making copy of the array object
		ArrayList<String> al3 = (ArrayList<String>) al.clone();
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Gaurab");
		al2.add("Archana");
		
		al.addAll(1,al2);
		
		// Iterator runs in forward direction
		Iterator Iter = al3.iterator();
		while(Iter.hasNext()){
			System.out.println(Iter.next());
		}
		
		
		System.out.println("******************");
		ListIterator<String> Lt = al3.listIterator();
		
		while(Lt.hasNext()){
			System.out.println(Lt.next());
		}
		while(Lt.hasPrevious()){
			System.out.println(Lt.previous());
		}
		

	}

}
