package com.arraylist.program;

import java.util.Scanner;

public class ReverseString {

	public String getReverseString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scanner.nextLine();
		String rev ="";
		int len = str.length();
		for(int i = len-1 ; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		scanner.close();
		return rev;
	}
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String reverse = reverseString.getReverseString();
		System.out.println("Reverse String: \n"+ reverse);
	}
}
