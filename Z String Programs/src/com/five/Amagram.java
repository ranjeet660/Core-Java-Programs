package com.five;

import java.util.Arrays;
import java.util.Scanner;

public class Amagram {

	public static void checkAnagram(String s1, String s2) {
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
			
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Strings are anagram");
		}else {
			System.out.println("String are not anagram");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st strings: ");
		String s1= scanner.nextLine();
		System.out.println("Enter 1st strings: ");
		String s2= scanner.nextLine();
		if(s1.length() == s2.length()) {
			checkAnagram(s1, s2);
		}else {
			System.out.println("Strings are not anagram");
		}
		
	}
}
