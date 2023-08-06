package com.star;
import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		
		for (int i=1 ; i<=row; i++) {
			for(int j=row-1; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
				//System.out.print(" *");  // pyramid
			}
			System.out.println();
		}
	}
}


//    *
//   **
//  ***
// ****
//*****

//    *
//   * *
//  * * *
// * * * *
//* * * * *