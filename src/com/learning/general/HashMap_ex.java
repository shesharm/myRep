package com.learning.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Name");
		hm.put(2, "City");
		hm.put(3, "Country");
		hm.put(4, "Zip");
		
		Set<Entry<Integer, String>> k = hm.entrySet();
		ArrayList<String> li  = new ArrayList<String>();
		
		
		Iterator<Entry<Integer, String>> Iter = k.iterator();
		Collections.sort(li);

		while(Iter.hasNext()){
			Entry<Integer,String> val = Iter.next();
			Integer key = val.getKey();
			String str = val.getValue();
			System.out.println(key+" "+str);
	
		}
//		for(Map.Entry m: hm.entrySet()){
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		
		
	

	}

}
