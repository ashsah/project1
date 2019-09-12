package com.programs;

public class SingleDriver {

	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}
}
