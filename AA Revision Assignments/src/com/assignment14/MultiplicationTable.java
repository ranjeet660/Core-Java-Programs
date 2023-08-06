//Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.

package com.assignment14;

public class MultiplicationTable {

	public void getMultiplication() {
		for(int i = 2; i <=20; i++) {
			int mulTable = 0;
			for(int j = 1; j <= 10; j++) {
				mulTable = i * j;
				
				System.out.print(mulTable+"\t");
			}
			
			System.out.println(mulTable);
		}
	}
	
	public static void main(String[] args) {
		MultiplicationTable multiplicationTable = new MultiplicationTable();
		System.out.println("Multiplication is:");
		multiplicationTable.getMultiplication();
	}
}
