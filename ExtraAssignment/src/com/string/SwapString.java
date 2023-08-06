package com.string;

import java.util.Scanner;

public class SwapString {

	public static void getSwapping() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1 = scanner.nextLine();
		System.out.println("Enter 2st string");
		String str2 = scanner.nextLine();
		
		str1 = str1 + str2;		//ran + jeet = ranjeet
		str2 = str1.substring(0, str1.length() - str2.length());		//ranjeet (7 - 4)
		str1 = str1.substring(str2.length());
		System.out.println("After swaaping");
		System.out.println(str1);
		System.out.println(str2);
		
		scanner.close();
	}
	public static void main(String[] args) {
		SwapString.getSwapping();
	}
}
