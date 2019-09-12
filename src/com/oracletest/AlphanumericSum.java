package com.oracletest;

import java.util.Scanner;

public class AlphanumericSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
//			if (Character.isDigit(s.charAt(i)))
				sum+=Character.getNumericValue(s.charAt(i));
			else
				continue;
		}
		
		System.out.println("Sum := "+sum);

	}

}
