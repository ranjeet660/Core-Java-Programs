package com.practice;

import java.util.Scanner;

public class PalindromeString {

	void revString(String str) {	
		int len = str.length();
		String rev = "";	
//		String s = str;
		for(int i = len - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		if(str.equals(rev)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}		
	}
	public static void main(String[] args) {
	
		PalindromeString reverseString = new PalindromeString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = scanner.next();
		reverseString.revString(str1);
	}
}
