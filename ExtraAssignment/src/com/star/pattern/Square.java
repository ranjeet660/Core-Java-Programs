package com.star.pattern;

public class Square {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				//System.out.print("*");
				if(i > 1 && i < n && j > 1 && j < n) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
