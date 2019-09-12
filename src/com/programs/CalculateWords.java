package com.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CalculateWords {

	public static void main(String[] args) throws IOException {
		File f = new  File("C:\\Users\\Ashish\\Desktop\\compareword.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); 
		  
		  String para = "",st; 
		  while ((st = br.readLine()) != null) 
		    para+=st;
		
		String[] paraarray = para.split(" ");
		int i=1;
		System.out.println(paraarray.length);
		
		Map<String,Integer> obj = new TreeMap<String,Integer>();
		
		for(String s: paraarray) {
			if(obj.get(s)==null)
				obj.put(s, 1);
			else
			{
				int c =obj.get(s) +1;
				if(c>i)
				{
					i=c;
				}
				obj.put(s, c);
			}			
		}		
		System.out.println(obj);
		for(Map.Entry<String, Integer> mp : obj.entrySet())
		{
			if(mp.getValue()==i) {
				System.out.println(mp.getKey()+"\t\t"+i);
			}
		}
	}

}
