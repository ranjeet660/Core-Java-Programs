package com.string;

public class SplitString {

	public static void main(String[] args) {
		String str = "I am developer";
		System.out.println(str);
		String[] s = str.split("",3);
		//System.out.println(s + "-");
		for(String a : s) {
			System.out.println(a + "-");
		}
	}
}
