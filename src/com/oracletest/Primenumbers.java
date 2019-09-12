package com.oracletest;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					count++;
					break;
				}
				else
					continue;
			}
			if(count==0)
				System.out.println(i);
		}

	}

}
