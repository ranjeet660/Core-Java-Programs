package com.star;

public class CrossLines {

	public static void main(String[] args) {
		for(int i = 5; i >=1; i--) {
			for(int j = 5; j > i;j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <=(i * 2)-1; k++) {
				//System.out.print("*");
				if(k > 1 && k < (i*2)-1) {
					System.out.print(" ");
				}else {
					System.out.print("1");
				}
			}
			System.out.println("");
		}
		for(int i = 2; i <= 5 ; i++) {
			for(int j = 5; j > i ; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <=(i*2)-1; k++) {
				System.out.print("*");
//				if(k > 1 && k < (i*2)-1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("1");
//				}
			}
			System.out.println("");
		}
	}
}