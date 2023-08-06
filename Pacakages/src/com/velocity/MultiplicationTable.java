//Design method void multiplication (int no) and print the multiplication table.
//( Example enter the no=5 then output like 5*1=5.......5*10=50)

package com.velocity;

import java.util.Scanner;

public class MultiplicationTable {
	void multiplication(int no) {
		for (int i=1; i <=10 ; i++) {
			int mul = no * i;
			System.out.println(no + "*" + i + "=" + mul);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter any no");
		Scanner scanner = new Scanner(System.in);
		int multi = scanner.nextInt();
		MultiplicationTable multiplicationTable = new MultiplicationTable();
		multiplicationTable.multiplication(multi);
		
	}
}
