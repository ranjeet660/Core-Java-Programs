package com.star;

public class OneSideCross {

	public static void main(String[] args) {
		int n = 5;
		for(int i = n ; i >= 1 ; i--) {
			for(int j = n-1 ; j >= i ; j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= (i*2)-1; k++) {
				//System.out.print("*");
				if (k > 1 && k < (i*2)-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		for(int i = 1; i <= n  ; i++) {
			for(int j = n-1 ; j >= i ; j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= (i*2)-1 ; k++) {
				//System.out.print("*");
				if (k > 1 && k < (i*2)-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
