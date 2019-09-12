package com.oracletest;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		
		int n,count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				count++;
				break;}
			else
				continue;		
		}
		
		if(count==0) 
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}

}
