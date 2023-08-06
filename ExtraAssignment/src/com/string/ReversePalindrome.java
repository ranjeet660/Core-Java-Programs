package com.string;

public class ReversePalindrome {

	public static void main(String[] args) {
		String str = "RanjeeteejnaR";
		StringBuffer sb = new StringBuffer(str);
		String s = sb.reverse().toString();
		if(s.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
