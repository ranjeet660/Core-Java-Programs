package com.defaults.method;

public interface Demo {

	//Using default keyword
	default void X2() {
		System.out.println("We can write default method in interface with body");
	}
	
	//This is not allowed / possible
//	void X1() {
//		System.out.println("We can write default method in interface with body");
//	}
	
	//Using static keyword
	//We can write satatics method in interface with body
	static void X1() {
		System.out.println("We can write static method in interface with body");
	}
}
