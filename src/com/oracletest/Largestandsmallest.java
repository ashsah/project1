package com.oracletest;

public class Largestandsmallest {

	public static void main(String[] args) {
		int largest=0;
		int smallest;
		int arr[]=new int[]{1,2,3,4,5};
		smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		System.out.println("largest number is "+largest);
		System.out.println("Smallest number is "+smallest);

	}

}
