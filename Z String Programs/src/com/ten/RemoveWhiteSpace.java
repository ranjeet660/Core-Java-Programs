// Java Program to remove all the white spaces from a string

package com.ten;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String str = scanner.nextLine();
		//String str = "I am developer";
//		String strArr[] = new String[str.length()];
		//int temp=0;
		String s="";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				s = s + ch;
				//temp++;
			}
		}
		System.out.println(s);
//		for(int k =0; k < strArr.length; k++) {
//			System.out.println(strArr[k]);
//		}
	}
}
