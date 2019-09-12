package com.programs;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    	//Ashish Anupam Sah
    	//Write code here
        int n;
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++)
        {
            if(hmap.containsKey(arr[i]))
            hmap.put(arr[i],hmap.get(arr[i])+1);
            else
            hmap.put(arr[i],1);
        }
        int k=0;
        for(Integer i:hmap.values())
        {
            if(i>1)
            k++;
        }
        System.out.println(k);
   }
}
