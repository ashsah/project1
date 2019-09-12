package com.oracletest;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,mul = 1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(int i=n;i>0;i--) {
			mul=mul*i;
		}
		System.out.println("factorial of n is "+mul);
	}

}
