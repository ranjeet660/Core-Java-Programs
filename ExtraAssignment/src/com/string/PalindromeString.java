package com.string;

import java.util.Scanner;

public class PalindromeString {

	public static void getPalindromeString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String rev = "";
		String str = scanner.nextLine();
		int len = str.length();
		for(int i = len-1 ; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		if(str.equals(rev)) {
			System.out.println(str + " String is palindrome");
		}else {
			System.out.println(str + " String is not palindrome");
		}
		scanner.close();
		
	}
	
	public static void main(String[] args) {
		PalindromeString.getPalindromeString();
		
	}
}
