package com.learning.general;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("shekhar");
		p.add("Hum");
		p.add("Tum");
		
		Iterator<String> Iter = p.iterator();
		while(Iter.hasNext())
			System.out.println(Iter.next());

	}

}
