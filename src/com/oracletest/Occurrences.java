package com.oracletest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Occurrences {

	public static void main(String[] args) {
		String name = "ashish";
		
		HashMap<Character,Integer> occ = new HashMap();
		
		for(int i=0;i<name.length();i++) {
			
			if(occ.containsKey(name.charAt(i)))
				occ.put(name.charAt(i), occ.get(name.charAt(i))+1);
			else
				occ.put(name.charAt(i),1);
		}
		
		System.out.println("Created hashmap is" + occ); 
		Iterator itr = occ.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry mapElement = (Map.Entry)itr.next();
			System.out.println(mapElement.getKey()
					+","+mapElement.getValue());
		}
		
	}

}
