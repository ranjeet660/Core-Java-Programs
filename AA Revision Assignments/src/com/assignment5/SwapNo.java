//Write a program to swap the two numbers.

package com.assignment5;

public class SwapNo {

	public void getSwap() {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before swapping ");
		System.out.println(a);
		System.out.println(b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping ");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		SwapNo swapNo = new SwapNo();
		swapNo.getSwap();
	}
}
