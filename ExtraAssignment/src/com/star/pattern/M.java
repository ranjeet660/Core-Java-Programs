package com.star.pattern;

public class M {

	public static void main(String[] args) {
		int n = 10;
		int fp = 0, sp = 0;
		for(int r = 1; r <= n ; r++) {
			for(int c = 1 ; c <= n+1 ; c++) {
				if(c == 1 || c == n+1 || (c == fp || c == sp) && r <= n/2+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
			if(r == 1) {
				fp = 1;
				sp = n+1;
			}
			fp++;
			sp--;
		}
		
	}
}
