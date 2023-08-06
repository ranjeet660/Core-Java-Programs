//Design method void multiplication (int no) and print the multiplication table. 
//( Example enter the no=5 then output like 5*1=5.......5*10=50)

package com.assignment6;

import java.util.Scanner;

public class MultiplicationTable {

	
	public void getMultiplication(int no) {
		for( int i = 1; i <= 10; i++) {
			int mul = no * i;
			System.out.println(no + "*" + i + "=" + mul);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ay no: ");
		int no = scanner.nextInt();
		MultiplicationTable multiplicationTable = new MultiplicationTable();
		multiplicationTable.getMultiplication(no);
	}
}
