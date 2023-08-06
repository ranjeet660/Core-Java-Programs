//Java Program to count the total number of punctuation characters exists in a String
// Ascii values
// 32 to 47 && 58 to 64 && 91 to 96  && 123 to 126		(Special characters)

package com.three;

import java.util.Scanner;

public class PunctuationCounter {

	public static int getPunctuation(String str) {
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch > 32 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126) {
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String str = scanner.nextLine();
		int c = getPunctuation(str);
		if(c > 0) {
			System.out.println("Total punctuation characters>>"+ c);
		}else {
			System.out.println("Punctuation characters are not available");
		}
		
	}
}
