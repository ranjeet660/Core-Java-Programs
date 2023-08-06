//Constructor Chaining:-
//			Constructor called from another constructor in same class is called constructor chaining
// When we create a object of child class then all the constructor from parent class are first invoked , after that constructor calling child class constructor is invoked

//Rule:
//	The expression that uses this keyword must be the first line in constructor.
//  Order does not matter in constructor
//  There must exist at least one constructor that does not use this keyword.

//within same class 
// If the constructor is in same class then use this keyword

package com.constructor.chaining;

public class Example {

	public Example() {
		this(20);
		System.out.println("Default constructor");  //3rd print
	}

	public Example(int i) {
		this("Ranjeet");
		System.out.println("Constructor with int argument"); // 2nd print
	}
	
	public Example(String name) {
		System.out.println("This is my name");  //It will print first
	}
	
	public static void main(String[] args) {
		Example example = new Example();
	}
}
