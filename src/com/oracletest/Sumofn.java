package com.oracletest;

import java.util.Scanner;

public class Sumofn {

	public static void main(String[] args) {
		int n,sum = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of n numbers is "+sum);
	}

}
