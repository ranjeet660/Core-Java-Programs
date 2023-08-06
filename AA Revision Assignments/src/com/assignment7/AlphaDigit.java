//Design method to check whether the character is alphabet, digit and special symbol.

package com.assignment7;

import java.util.Scanner;

public class AlphaDigit {

	void checkAlphabetDigit(char ch) {
		if((ch >= 'A' && ch <= 'Z') || ch > 'a' && ch < 'z') {
			System.out.println("This is alphabet");
		}else if (ch >= '0' && ch <= '9') {
			System.out.println("This is digit");
		}else if(ch >= 32 && ch <= 47 || (ch >= 91 && ch <= 96)) {
			System.out.println("Special symbol");
		}else {
			System.out.println("It is not digit, alphabet, spl symbol");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter anything and check");
		char word = scanner.next().charAt(0);
		
		AlphaDigit alphaDigit = new AlphaDigit();
		alphaDigit.checkAlphabetDigit(word);
	}
}
