package com.oracletest;

import java.util.Scanner;

public class SumandAvg {

	public static void main(String[] args) {
		int x,y,sum;
		float avg;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number");
		x=in.nextInt();
		System.out.println("Enter second number");
		y=in.nextInt();
		
		sum=x+y;
		avg=(float)(x+y)/2;
		System.out.println("Sum is "+sum+" Avg is "+avg);
	}

}
