package com.star.pattern;

public class DiamondReverse {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 2 ; j <=i ; j++) {
				System.out.print(" ");
			}
			for(int k = i ; k <= n; k++) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}
}
