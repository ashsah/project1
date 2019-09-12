package com.oracletest;

import java.util.HashSet;
import java.util.Iterator;

public class Substring {

	public static void main(String[] args) {
		
		String name = "Ashish";
		
		HashSet<String> hs = new HashSet();
		
		for(int i=0;i<name.length()-1;i++)
		{	
			for(int j=i+1;j<=name.length();j++) {
				hs.add(name.substring(i, j));
			}
		}
		
		System.out.println(hs.size());
		Iterator itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"   ");
		}
	}

}
