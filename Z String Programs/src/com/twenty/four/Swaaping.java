package com.twenty.four;

public class Swaaping {

	public static void main(String[] args) {
		String s1 ="Ranjeet";
		String s2 = "Maskar";
		System.out.println(s1 );
		System.out.println(s2);
		
		s1 = s1 + s2;										// a = a + b
		s2 = s1.substring(0, s1.length()- s2.length());		// b = a - b
		s1 = s1.substring(s2.length());						// a = a - b
		System.out.println(s1 );
		System.out.println(s2);
		
		
	}
}
