package com.assignment4;
//Write the java program to design method for multiplication of two number which returns int value to that method
//and result should be print into main method.

public class Multiplication {
	
	int multi(int n, int m) {
		return (n * m);
	}

	static int multiOne(int d , int e) {
		return (d * e);
	}
	public static void main(String[] args) {
		
		Multiplication multiplication = new Multiplication();
		int result = multiplication.multi(5, 8);
		System.out.println("Multiplication of two no is : " + result);
		
		int result1 = Multiplication.multiOne(6, 9);
		System.out.println("Multiplication of two no is : " + result1);
	}
}
