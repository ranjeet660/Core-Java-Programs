package com.star.pattern;

public class EmptyTriangke {

	public static void main(String[] args) {
		int n = 8;
		for(int r = 1; r <= n ; r++) {
			for(int c = n -1 ; c >= r ; c--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= (r*2)-1 ; k++) {
				//System.out.print("*");
				if(k > 1 && k < (r*2)-1 && r != n) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
