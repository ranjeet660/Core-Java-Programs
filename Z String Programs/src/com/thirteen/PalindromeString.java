//Java Program to determine whether a given string is palindrome

package com.thirteen;

import java.util.Scanner;

public class PalindromeString {

	private static void checkPalindrome(String str) {
		StringBuffer sb;
		StringBuffer stringBuffer = new StringBuffer(str);
		sb= stringBuffer.reverse();
		String s = sb.toString();
		if(str.equals(s)) {
			System.out.println(str + " string is palindrome");
		}else {
			System.out.println(str + " string is not palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.nextLine();
		checkPalindrome(str);
	}

	
}
