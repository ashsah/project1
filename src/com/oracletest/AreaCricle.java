package com.oracletest;

import java.util.Scanner;

public class AreaCricle {

	public static void main(String[] args) {
		int radius = 0;
		double Area;
		Scanner in=new Scanner(System.in);
		System.out.println("enter radius");
		radius=in.nextInt();
		Area = Math.PI*radius*radius;
		System.out.println("Area is "+Area);

	}

}
