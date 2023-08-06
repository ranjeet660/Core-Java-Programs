//Java Program to find all subsets of a string

package com.seven;

import java.util.Scanner;

public class SubsetsStringsByArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String str = scanner.nextLine();
		
		int len1 = str.length();
		String arr[] = new String[len1*(len1+1)/2];						//using arry
		int cnt = 0;
		int len = str.length();
		for(int i = 0; i < len; i++) {		
			for(int j = i+1; j<= len; j++) {
				arr[cnt]= str.substring(i, j);
				cnt++;
			}			
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		System.out.println("\n Total subsets are "+cnt);
	}
}
