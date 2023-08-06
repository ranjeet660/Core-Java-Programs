package com.statics;

public class StaticVariable {

	static int a = 20;
	
	public static void main(String[] args) {
		System.out.println(StaticVariable.a);  //by using class name
		
		StaticVariable staticVariable = new StaticVariable();  //by using object
		System.out.println(staticVariable.a);
		
		System.out.println(a);  //direct way
	}
}
