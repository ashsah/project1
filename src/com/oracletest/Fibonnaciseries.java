package com.oracletest;

public class Fibonnaciseries {

	public static void main(String[] args) {
		
		int f1 = 0,f2 = 1,f3;
		for (int i=0;i<10;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}

	}

}
