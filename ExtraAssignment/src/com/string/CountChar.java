package com.string;

public class CountChar {

	public static void main(String[] args) {
		String str="Hi this is java";
//		int count = 0;
//		for(int i = 0 ; i < str.length(); i++) {
//			char ch = str.toLowerCase().charAt(i);
//			if(ch >='a' && ch <='z') {
//				count++;
//			}
//		}
//		System.out.println("Total char "+count);
		
		String s[] = str.split(" ");
		for(int i = s.length-1; i >=0; i--) {
			System.out.println(s[i]);
		}
	}
}
