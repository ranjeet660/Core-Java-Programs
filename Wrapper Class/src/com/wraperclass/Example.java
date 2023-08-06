package com.wraperclass;

public class Example {

	public static void main(String[] args) {
		int a = 10;
		
		Integer intger = new Integer(a);  //Autoboxing
		
		System.out.println("Object "+intger);  //Object
		int x = intger.intValue();    		//Unboxing
		System.out.println("Primitive type " +x);
	}
	
}
