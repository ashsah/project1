package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(1,100,"Ashish"));
		stud.add(new Student(2,80,"Shashank"));
		stud.add(new Student(3,90,"Anup"));
		
		Collections.sort(stud);
		
		for(Student s:stud)
			System.out.println(s);

	}

}
