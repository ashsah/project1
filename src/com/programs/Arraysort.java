package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraysort {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(9);
		li.add(11);
		li.add(8);
		
		System.out.println(li);
		
		Comparator<Integer> obj = ( o1, o2) -> {
				if(o1 < o2)
					return 1;
				return -1;
		};
		Collections.sort(li, obj);
		System.out.println(li);
	}

}
