//Java Program to determine whether two strings are the anagram

package com.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void checkAnagram(String s1, String s2) {
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		//Ranj
		//anRj
		if (str1.length() == str2.length()) {
			char charStr1[] = str1.toCharArray();
			char charStr2[] = str2.toCharArray();
			Arrays.sort(charStr1);
			Arrays.sort(charStr2);

			if (Arrays.equals(charStr1, charStr2)) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("String is not Anagram");
			}
		} else {
			System.out.println("Not Anagram");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		checkAnagram(s1, s2);
	}
}
