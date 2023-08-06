package com.nine;

public class Permitations {

	private static void getParmitutaion(String str, String s) {
		if(str.length() == 0) {
			System.out.println(s + " ");
		}
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			String s1 = str.substring(0, i)+ str.substring(i + 1);
			getParmitutaion(s1, s + ch);
		}
		
	}
	public static void main(String[] args) {
		String str = "abc";
		getParmitutaion(str, "");
	}

	
}
