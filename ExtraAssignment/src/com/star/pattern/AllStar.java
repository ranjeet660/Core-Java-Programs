package com.star.pattern;

public class AllStar {

	public static void main(String[] args) {
		int n = 6;
		int fp = 0;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1; j <= i ; j++) {
				//System.out.print("*");
				if(j > 1 && j < i && i != n) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
//				if(j == 1 || i == n || j == fp && i <= n) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
			}

			System.out.println();
			if (i == 1) {
				fp = 1;
			}
			fp++;
		}
		
	}

}
