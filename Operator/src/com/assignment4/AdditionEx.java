package com.assignment4;
//Write the java program to design method for addition of two number which returns int results to that method 
//and result should be print into main method.

public class AdditionEx {
							//non static method it will call by using create object only.
	int addition(int a, int b) {
		int c = a + b;
		return c;	
	}
	
								//static method
	static int add(int x, int y) {
		return (x + y);
	}
	public static void main(String[] args) {
													//Calling non static method
		AdditionEx additionEx = new AdditionEx();
		int result = additionEx.addition(50, 100);
		System.out.println("Addition of two number using Non Static method : "  + result);
		
													//calling static method by using class name
		int result1= AdditionEx.add(200,300);
		System.out.println("Addition of two number using Static method : " + result1);
		
		int result2 = add(25 , 35);
		System.out.println("Addition by using direct way :" + result2);}
}
