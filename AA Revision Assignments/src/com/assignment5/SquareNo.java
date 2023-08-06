package com.assignment5;

import java.util.Scanner;

public class SquareNo {

	public int getSquare(int x) {
		int squ = (x * x);
		return squ;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any no: ");
		int x = scanner.nextInt();
		
		SquareNo squareNo = new SquareNo();
		int result = squareNo.getSquare(x);
		System.out.println(x + " square is "+ result);
	}
}
