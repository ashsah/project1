package com.oracletest;

public class ReverseString {

	public static void main(String[] args) {
		
		String name= "madam";
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			
			rev = rev + name.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equals(name))
			System.out.println("its pallindrome");
		else
			System.out.println("its not");

	}

}
