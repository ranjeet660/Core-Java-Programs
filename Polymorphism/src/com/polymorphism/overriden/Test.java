package com.polymorphism.overriden;

public class Test extends DynamicBinding {

	@Override      // is used to represent that method is override already
	void demo(){
		System.out.println("Test method from test class");
	}
	 public static void main(String[] args) {
		Test test = new Test();
		test.demo();
	}
}
