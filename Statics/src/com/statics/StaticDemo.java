package com.statics;

public class StaticDemo {

	void x1() {
		System.out.println("This is x1 non static method");
		x2();  // calling x2 method in x1.
	}
	
	static void x2() {
		System.out.println("This is x2 static method");
	}
	
	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
		staticDemo.x1();  //calling non static method  using object
	}
}
