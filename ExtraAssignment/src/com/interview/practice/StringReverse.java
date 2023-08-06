package com.interview.practice;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Ranjeet";
		String rev="";
		int len = str.length();
		for(int i = len-1; i >=0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
	}
}
