package com.four;

import java.util.Scanner;

public class CountVowelConsnunts {

	public static void getCount(String str) {
		int vowel=0;
		int consnunt=0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch =='a' || ch =='A' || ch =='e' || ch =='E' || ch =='i' || ch =='I' || ch =='o' || ch =='O' || ch =='u' || ch =='U') {
				vowel++;
			}else if(ch >='A' && ch<='Z' || ch >='a' && ch <='z') {
				if (ch !='a' || ch !='A' || ch !='e' || ch !='E' || ch !='i' || ch !='I' || ch !='o' || ch !='O' || ch !='u' || ch !='U') {
					consnunt++;
				}
			}
		}
		System.out.println("Total vowels: "+vowel);
		System.out.println("Total consnunts: "+consnunt);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String str = scanner.nextLine();
		getCount(str);
		
	}
}
