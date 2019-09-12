package com.oracletest;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the year");
		year=in.nextInt();
		
		if((year%100==0)||((year%100!=0)&&(year%4==0)))
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}
}
