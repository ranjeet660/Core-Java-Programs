package com.string;


public class ReverseString {

	public static void main(String[] args) {
		String str = "sks";
		StringBuffer sb = new StringBuffer(str);
		String s = sb.reverse().toString();
		System.out.println(s);
		if(str.equals(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
