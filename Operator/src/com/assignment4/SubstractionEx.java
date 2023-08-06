package com.assignment4;
//Write the java program to design method for substraction of two number which returns int value to that method
//and result should be print into main method.

public class SubstractionEx {
								//Non static method
	int substraction(int x, int y) {
		return (x - y);
	}
	
								//static method
	static int substractionOne(int a, int b) {
		return (a - b);
	}

	public static void main(String[] args) {
								//calling non static
		SubstractionEx substractionEx= new SubstractionEx();
		int result = substractionEx.substraction(75, 60);
		System.out.println("Substraction is : "+ result);
		
								//Calling static method using class name
		int result1 = SubstractionEx.substractionOne(99, 33);
		System.out.println("Substraction is : "+ result1);
		
		int result2 = substractionOne(115, 15);
		System.out.println("Substraction is : "+ result2);
	}
}
