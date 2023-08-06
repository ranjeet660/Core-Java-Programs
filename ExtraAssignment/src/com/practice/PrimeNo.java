 package com.practice;

public class PrimeNo {

	public static void getPrime(int n) {
		for(int i = 0; i <= n; i++) {
			int count=0;
			for(int j = 2; j <i;j++) {
				if ( i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		getPrime(10);
	}
}
