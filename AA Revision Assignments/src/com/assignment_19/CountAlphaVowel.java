package com.assignment_19;

import java.util.Scanner;

public class CountAlphaVowel {

	public void getCount(String str) {
		int len = str.length();
		int alphaCount = 0;
		int vowelCount = 0;
		int numCount = 0;
		for(int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alphaCount++;
			}
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
				vowelCount++;
			}else if(ch >= '0' && ch <= '9') {
				numCount++;
			}
		}
		System.out.println("Alphabets count is: "+ alphaCount);
		System.out.println("Vowel Count is: "+ vowelCount);
		System.out.println("Number count is: "+ numCount);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Anything");
		String str1 = scanner.nextLine();
		CountAlphaVowel countAlphaVowel = new CountAlphaVowel();
		countAlphaVowel.getCount(str1);
	}
}
