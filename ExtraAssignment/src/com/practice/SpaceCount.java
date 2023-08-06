package com.practice;

import java.util.Scanner;

public class SpaceCount {

	void getCountString(String str) {
		int len = str.length();
		System.out.println(len);
		int count = 0;
		for(int i = 0; i <= len-1; i++) {
			char ch = str.charAt(i);
			if( ch == ' ') {
				count++;
			}
		}
		System.out.println("Total spaces is: "+ count);
	}
	
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter statement");
		String s = scanner.nextLine();
		System.out.println(s);
		SpaceCount spaceCount = new SpaceCount();
		spaceCount.getCountString(s);
	}
}
