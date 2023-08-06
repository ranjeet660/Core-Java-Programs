package com.nine;

public class PermutionString {

private static void getParm(String str, String str1) {
		
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			String z = str.substring(0, i) + str.substring(i + 1);
			getParm(z, str1 + ch);
		}
		if(str.length() == 0) {
			System.out.println(str1 + "");
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		getParm(str , "");
	}

	
}
