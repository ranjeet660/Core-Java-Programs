//Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.)

package com.assignment7;

import java.util.Scanner;

public class Factors {

	public void getFactor(int no) {
		//By using while loop
		int i=1;
		while(i <= no) {
			if(no % i == 0) {
				System.out.println("Factor "+i);
			}
			
			i++;
		}
		// By Using for loop
//		for(int i = 1; i <= no; i++) {
//			if (no % i == 0) {
//				System.out.println("Factor "+i);
//			}
//		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no: ");
		int n = scanner.nextInt();
		
		Factors factors = new Factors();
		factors.getFactor(n);
	}
}
