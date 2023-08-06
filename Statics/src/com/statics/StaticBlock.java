package com.statics;

public class StaticBlock {

	static {
		System.out.println("This is static block");
	}
	static {
		System.out.println("This is first block");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
	}
}
