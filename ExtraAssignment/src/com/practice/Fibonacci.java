package com.practice;

public class Fibonacci {

	public static void getFibo(int n) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		int sum=0;
		for(int i = 0; i < n-1; i++) {
			sum = a + b;
			System.out.println(sum);
			a=b;
			b = sum;
		}
	}
	public static void main(String[] args) {
		getFibo(6);
	}
}
