package com.programs;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		System.out.println(b.x);
		b.methodB();
		b.methodA();
		
		A a = b;
		a.methodB();
		System.out.println(a.x);
		
		A c = new A();
		c.methodB();

	}

}
