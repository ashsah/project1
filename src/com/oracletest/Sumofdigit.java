package com.oracletest;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		int n,r,sum = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum of number is "+sum);
	}
}
