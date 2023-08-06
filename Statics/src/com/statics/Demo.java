package com.statics;

public class Demo {

	public static void main(String[] args) {
		System.out.println(Test.x);  //By using Class name
		
		Test test = new Test();
		System.out.println(test.x);
	}
}
