package com.question6;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		a = a+b;	//30
		b = a - b;	// 30 - 20=10
		a = a - b;	// 30 - 10=20
		System.out.println(a);
		System.out.println(b);
	}
}
