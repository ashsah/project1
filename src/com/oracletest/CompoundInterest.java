package com.oracletest;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		double principal,interest,time,CI;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter principal amount");
		principal=in.nextDouble();
		System.out.println("Enter interest rate");
		interest=in.nextDouble();
		System.out.println("Enter time interval");
		time=in.nextDouble();
		CI= principal*Math.pow((1+interest/100),time);
		System.out.println("CI is "+CI);
	}

}
