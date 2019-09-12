package com.programs;

public class Singleton {
	private static Singleton singletonInstance=null;
	public String str=null;
	
	private Singleton() {
		str="Abcd";
	}

	public static Singleton getInstance() {
		if(singletonInstance==null)
			singletonInstance=new Singleton();
		return singletonInstance;
	}
}
