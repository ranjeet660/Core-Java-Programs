package com.constructor.chaining;

public class Demo extends Test{

	public Demo() {
		
		System.out.println("Default from child");
	}
	
	public Demo(String s) {
		super(200);
		System.out.println("Const with string argument");
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
	}
}
