package com.sixteen;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Ranjeet";
		String s1="";
		//Withput use method
//		for(int i= str.length()-1;i>=0;i--) {
//			char ch = str.charAt(i);
//			s1 = s1 + ch;
//		}
		
		//use String buffer
		StringBuffer sb = new StringBuffer(str);
		s1 = sb.reverse().toString();
		System.out.println(s1);
	}
}
