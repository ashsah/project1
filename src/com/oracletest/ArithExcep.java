package com.oracletest;

public class ArithExcep {

	public int cal(int b) {
		int a = 0;
		try {
			a = b/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Aman");
		return a;
	}
}
