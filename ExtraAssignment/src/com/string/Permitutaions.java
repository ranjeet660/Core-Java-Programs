package com.string;

public class Permitutaions {
	
	private static void getParmitation(String str , String ans) {
		if(str.length() == 0) {
			System.out.println(ans+ "");

		}
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			String s = str.substring(0, i) + str.substring(i+1);
			
			getParmitation(s, ans + ch);
			
		}
		
		
	}
	public static void main(String[] args) {
		String str = "abc";
		getParmitation(str , " ");
	}

	
}
