package com.string;

public class RemoveLetter {

	public static void main(String[] args) {
		String s1 = "Rajnjeet";
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++) {
			
			char ch = s1.charAt(i);
			if(ch != 'a' && ch != 'e') {
				s2 = s2 + ch;
			}			
		}
		System.out.println(s2);
	}
}
