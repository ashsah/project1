package com.programs;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=in.nextInt();
		
		int result=factorial(num);
		System.out.println(result);
	}

}
