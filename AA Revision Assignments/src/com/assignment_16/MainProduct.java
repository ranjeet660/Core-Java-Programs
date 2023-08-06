package com.assignment_16;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight in kg ");
		int weight = scanner.nextInt();
		Product product = new Product();
		product.productCheck(weight);
	}
}
