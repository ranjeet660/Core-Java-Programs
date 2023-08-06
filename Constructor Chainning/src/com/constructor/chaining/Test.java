package com.constructor.chaining;

public class Test {

	public Test() {
		this(10);
		System.out.println("This is parent default constructor");
	}
	
	public Test(int i) {
		this("Jeet");
		System.out.println("Parameterized constructor with int argument");
	}
	
	public Test(String name) {
		System.out.println("This is name");
	}
}
