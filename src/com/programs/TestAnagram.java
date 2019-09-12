package com.programs;

import java.util.HashMap;
import java.util.Map;

public class TestAnagram {
	
	static boolean testAnagram(String s1,String s2) {
		
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		Map<Character,Integer> map1 = new HashMap<Character, Integer>();
		for(int i=0; i<a1.length;i++) {
			if(map1.get(a1[i]) == null)
				map1.put(a1[i], 1);
			else
			{
				int c=map1.get(a1[i]);
				map1.put(a1[i], ++c);
			}				
		}
		Map<Character,Integer> map2 = new HashMap<Character, Integer>();
		for(char b : a2) {
			if(map2.get(b) == null)
				map2.put(b, 1);
			else
			{
				int c=map2.get(b);
				map2.put(b, ++c);
			}
		}
		
		return map1.equals(map2);		
	}
	
	public static void main(String[] args) {
		
		String s1 ="ABCD";
		String s2 ="ACBD";
		
		if(testAnagram(s1,s2))
			System.out.println("Both string s1 and s2 are Anagram");
		else
			System.out.println("Both string s1 and s2 are not Anagram");
	}
}
