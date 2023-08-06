//Java Program to replace the spaces of a string with a specific character

package com.twelve;

import java.util.Scanner;

public class SpaceToCharacter {

	private static String replaceSpaceToChar(String str) {
		String s1 = "";
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				ch = '%';
			}
			s1 = s1 + ch;
		}
		return s1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String in lower case");
		String str = scanner.nextLine();
		//String str = "ranjeet shivaji maskar";
		String s = replaceSpaceToChar(str);
		System.out.println(s);
	}

	
}
