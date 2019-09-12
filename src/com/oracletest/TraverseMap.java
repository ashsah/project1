package com.oracletest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TraverseMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mp = new TreeMap();
		
		mp.put(3,"Ashish");
		mp.put(2, "Aman");
		mp.put(1, "Anup");
		
		Iterator itr = mp.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry mapentry = (Entry) itr.next();
			System.out.println(mapentry.getKey()+","+mapentry.getValue());
		}
		
		for (Map.Entry mapentry: mp.entrySet()) {
			System.out.println(mapentry.getKey()+","+mapentry.getValue());
		}
		
	}

}
