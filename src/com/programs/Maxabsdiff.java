package com.programs;

public class Maxabsdiff {

	public static void main(String[] args) {
		
		int num[]= {0,2,3,4,5,6};
		int result=maxabsdiff(num);
		System.out.println(result);

	}

	private static int maxabsdiff(int[] num) {
		int max=num[0];
		int min=num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>max)
				max=num[i];
			if(num[i]<min)
				min=num[i];
		}
		return max-min;
	}

}
