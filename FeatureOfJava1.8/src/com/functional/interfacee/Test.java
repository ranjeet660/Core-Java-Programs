package com.functional.interfacee;

public class Test implements Demo{
	
	@Override
	public void show(String str) {
		System.out.println("Hello "+ str);
		
	}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		test.show("Ranjeet");
		
	}

	
}
