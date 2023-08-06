package com.star.pattern;

public class R {

	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		for(int r = 1 ; r <= n ; r++) {
			for(int c= 1; c < n ; c++) {
				if(r == 1 || c == 1 || r == 3 || ( r <= 3  & c == n-1) || r + c == k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			k = k + 2;
		}
	}
}
