package com.assignment_19;

import java.util.Scanner;

public class ReverseString {

	public String getReverseString(String reverse) {
		int len = reverse.length();
		for(int i = len -1; i >= 0; i--) {
			char ch = reverse.charAt(i);
			System.out.print(ch);
		}
		return reverse;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scanner.nextLine();
		
		ReverseString reverseString = new ReverseString();
		reverseString.getReverseString(str);
	}
}
