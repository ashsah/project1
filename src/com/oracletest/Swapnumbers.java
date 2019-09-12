package com.oracletest;

import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {
		
		int x,y;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number");
		x=in.nextInt();
		System.out.println("Enter second number");
		y=in.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("value of X and y after swapping is"+"X="+x+" and y="+y);
	}

}
