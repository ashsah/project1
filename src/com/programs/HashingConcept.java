package com.programs;

import java.util.HashSet;
import java.util.Set;

public class HashingConcept {

	public static void main(String[] args) {
		
		Set<Student> s = new HashSet<Student>();
		s.add(new Student(1, 50, "Ashish"));
		s.add(new Student(1, 50, "Ashish"));
		
		Set<Student> s1 = new HashSet<Student>();
		s1.add(new Student(1, 50, "Ashish"));
		s1.add(new Student(1, 50, "Ashish"));
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Boolean b = s.equals(s1);
		System.out.println(b);
	}

}
