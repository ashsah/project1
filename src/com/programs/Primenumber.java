package com.programs;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=in.nextInt();
		System.out.println("prime numbers are:");
		for(int j=2;j<=num;j++) {
		int count = 0;
		for(int i=2;i<=Math.sqrt(j);i++) {
			if(j%i==0)
				count++;
		}
		if (count==0)
			System.out.println(j);
		}
	}
}
