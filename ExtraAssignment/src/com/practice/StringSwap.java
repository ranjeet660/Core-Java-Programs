package com.practice;

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1 = scanner.nextLine();
		System.out.println("Enter 2st string");
		String str2 = scanner.nextLine();
		
		System.out.println(str1);
		System.out.println(str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After "+ str1);
		System.out.println("After "+ str2);
	}
}
