package com.learning.general;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vector<String> vc = new Vector<String>();
		vc.add("Shekhar");
		vc.add("Sharma");
		vc.add("Menu");
		
		
		Iterator Iter = vc.iterator();
		while(Iter.hasNext()){
			System.out.println(Iter.next());
		}
		
		Enumeration en = vc.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
	}

}
