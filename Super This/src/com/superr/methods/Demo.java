package com.superr.methods;

public class Demo extends Example{
	void Test() {
		System.out.println("Child class");
	}
	void Test2() {
		super.Test1();
//		Example example = new Example();
//		example.Test1();
		this.Test();
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.Test2();
	}
}
