package com.superr.variables;

public class Demo extends Example{

	int a = 70;
	void getVariable() {
		//Access parent class variable
		
			Example example = new Example();
			System.out.println(example.a);  //using object of parent class..that is not good approach ..wasting memory
			System.out.println(super.a);  //using super keyword
	}
	public static void main(String[] args) {
	
		Demo demo = new Demo();
		demo.getVariable();
		
	}
	
	
}
