package com.strings.programs;

public class Demo1 {

	public static void main(String[] args) {
		
		String test = "Ranjeet Maskar";
		
		System.out.println(test); //Ranjeet Maskar
		System.out.println(test.charAt(12));  // k
		System.out.println(test.concat(" From Hasur Kh")); //Ranjeet Maskar From Hasur Kh
		System.out.println(test.compareTo("Ranjeet")); 
		System.out.println(test.toLowerCase()); //ranjeet maskar
		System.out.println(test.toUpperCase());   //RANJEET MASKAR
	}
}
