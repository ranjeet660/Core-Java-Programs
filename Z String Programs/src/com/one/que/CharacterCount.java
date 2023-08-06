//Java Program to count the total number of characters in a string

package com.one.que;

import java.util.Scanner;

public class CharacterCount {

	public static int getCount(String str) {
		int count=0;
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			if( ch >='a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String str = scanner.nextLine();
		int c = getCount(str);
		System.out.println("Total number of character is: "+ c);
		
	}
}
