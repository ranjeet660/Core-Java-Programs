//Java Program to replace lower-case characters with upper-case and vice-versa

package com.eleven;

public class LowerToUpperCaseArray {

	public static void main(String[] args) {
		String str = "ranjeet shivaji maskar";
		String strArr[] = new String[str.length()];
		String temp="";
		char ch[] = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);			
			String s = temp+ch[i];
			strArr[i] = s.toUpperCase();
		}
		for(int k = 0; k < strArr.length;k++) {
			System.out.println(strArr[k]);
		}
	}
}
