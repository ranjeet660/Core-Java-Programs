//Java Program to divide a string in 'N' equal parts.

package com.six;

import java.util.Scanner;

public class DivideString {

	public static void getEquals(String str) {
		int len = str.length();
		String str1 = "";
		String str2 = "";
		for(int i = 0 ; i < len/2; i++) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		for(int i =len/2 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			str2 = str2 + ch;
		}
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String s1 = scanner.nextLine();		
		
		if(s1.length() % 2 == 0) {
			getEquals(s1);
		}else {
			System.out.println("String does not divide in equal parts");
		}
		scanner.close();
	}
}
