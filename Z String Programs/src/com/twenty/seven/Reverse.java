package com.twenty.seven;

public class Reverse {

	public static String getReverse(String str) {
		String str1="";
		for(int i = str.length()-1; i >=0;i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		return str1;		
	}
	
	public static void main(String[] args) {
		String rev = getReverse("Ranjeet");
		System.out.println(rev);
	}
}
