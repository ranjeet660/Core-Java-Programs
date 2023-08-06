package com.ten;


public class WhiteSpace {

	public static void main(String[] args) {
		String str = "I am developer";
		String s = "";
		//System.out.println(str);
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			//System.out.println(ch);
			if(ch != ' ') {
				s = s + ch;
				
			}
		}
		System.out.println(s);
	}
}
