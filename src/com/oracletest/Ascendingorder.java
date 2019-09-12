package com.oracletest;

import java.util.Scanner;

public class Ascendingorder {

	public static void main(String[] args) {
		int temp;
		int A[] = new int[10];
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			A[i]=in.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(A[i]>A[j]) {
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<10;i++) {
			System.out.println(A[i]);
		}

	}

}
