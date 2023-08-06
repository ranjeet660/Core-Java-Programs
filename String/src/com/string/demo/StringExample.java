//String is class that represent sequence of character.
// it present in java.lang package
// String class implements serializable, comparable, char sequence interface
// String is immutable, once create string object, it cant be changed but new string object is created
package com.string.demo;

public class StringExample {

	
	public static void main(String[] args) {
		
		String test =  "Ranjeet";   //String literal
		test = test.concat(" Maskar");
		//test = test.replace("Maskar", "Sourabh");
		System.out.println(test);
	}
}
