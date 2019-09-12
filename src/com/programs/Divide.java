package com.programs;

import java.util.HashSet;
import java.util.Set;

public class Divide {
	
	
	//Divide Without Divison or Modulus Operator
	public static void divideWithoutOperator(int numerator,int denominator)
	{
		int rem,quot=0;
		if(denominator!=0 && numerator!=0)
		{
			while(numerator>=denominator)
			{
				numerator-=denominator;
				quot++;
			}
			rem=numerator;
			
			System.out.println("Quotient:="+quot);
			System.out.println("Remainder:="+rem);	
		}
		else
			System.out.println("Not Divisible!");
	}
	
	//Angle Between Minute and Hour Hand of Given Time
	public static void angle(int hour,int min)
	{
		int hourdegree,mindegree;
		if(hour<12)
		hourdegree=hour*30;
		else if(hour>12)
		hourdegree=(hour-12)*30;
		else
		hourdegree=0;
		
		mindegree=min*6;
		
		int result= mindegree-hourdegree;
		
		System.out.println("Angle Between Hour and Minute Hand:="+result);
	}
	
	
	//Reverse a string recursively
	public static String reverse(String s)
	{
		
		if(s.isEmpty())
		return s;
		else
		return reverse(s.substring(1))+s.charAt(0);
	}
	
	
	//factorial
	public static int fact(int n)
	{
			int fact=1;
			for(int i=2;i<=n;i++) {
				fact*=i;
			}
			return fact;
			
	}
	
	//Pascal triangle
	public static void pascal(int n)
	{
		for(int i=1;i<=n;i++)
		{
			/*for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print((fact(i)/fact(i-j)*fact(j))+" ");
			}
			
			System.out.println();
		}*/
			for(int line=1;line<=n;line++)
	        {
	            for(i=0;i<=line;i++)
	            {
	                System.out.print((fact(line)/fact(line-i) * fact(i)) + " ");
	            }
	            System.out.println();
	        }
	}
	}
	
	//Print Unique Substring of String
	public static void printAllSubstring(String s) {
		String str;
		Set<String> hset= new HashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++) {
				str=s.substring(i,j);
				hset.add(str);
			}
		}
		
		hset.forEach(k->System.out.print(k+"   "));
	}
	

	public static void main(String[] args) {
		
		//String s;

		// TODO Auto-generated method stub
		
		//Divide.divideWithoutOperator(10,5);
		
		//Divide.angle(11,30);
		
		//String reverse = Divide.reverse("Hello World");
		//System.out.println(reverse);
		
		//Divide.pascal(5);
		
		Divide.printAllSubstring("aaaa");

	}

}
