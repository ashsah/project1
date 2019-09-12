package com.programs;

public class Student implements Comparable<Student>{
	
	int rollno,marks;
	String name;
	public Student(int rollno, int marks, String name) {
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.marks>o.marks?-1:this.marks<o.marks?1:0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}
}
