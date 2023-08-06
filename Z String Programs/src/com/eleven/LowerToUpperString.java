//Java Program to replace lower-case characters with upper-case and vice-versa

package com.eleven;

import java.util.Scanner;

public class LowerToUpperString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String in lower case");
		String str = scanner.nextLine();
		//String str = "ranjeet shivaji maskar";
		String s1 ="";
		String s="";
		for(int i = 0; i < str.length();i++) {			
			char ch = str.charAt(i);
			s = s + ch;
			s1=s.toUpperCase();
		}
		System.out.println(s1);
	}
}
