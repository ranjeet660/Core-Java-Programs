//Design method public int getReverseNumber(int num) which return int value to that method and 
//result print into main method.(Enter the no=125 then output will be 521(int no)  
//which returns int value to that method.

package com.assignment7;

import java.util.Scanner;

public class ReverseNumber {

	public int getReverseNumber(int num) {
		int rev = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		
		return rev;		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no: ");
		int n = scanner.nextInt();
		
		ReverseNumber reverseNumber = new ReverseNumber();
		int reverse = reverseNumber.getReverseNumber(n);	
		System.out.println("Reverse no is: "+reverse);
	}
}
