package com.practice;

import java.util.Scanner;

public class RemoveDupliLetter {

	public static String removeLetter(String str) {
		System.out.println("Original String: "+ str);
		String str1= "";
		char[] s1 = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			int temp=0;
			for(int j = i + 1; j < str.length(); j++) {
				if(s1[i] == s1[j]) {
					temp++;
					System.out.println("Duplicates: "+ s1[j]);
				}
			}
			if( temp == 0) {
				str1 = str1 + s1[i];
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String str2= RemoveDupliLetter.removeLetter(s);
		System.out.println("After remove duplicate- "+ str2);
	}
}
