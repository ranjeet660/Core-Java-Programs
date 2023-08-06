package com.string;

public class ReplaceString {

	public static void main(String[] args) {
		String str = "I was rabjeet";
		System.out.println(str);
		String s = str.replace('b', 'n');
		String s1 = s.replaceAll("was", "am");
		System.out.println(s);
		System.out.println(s1);
	}
}
