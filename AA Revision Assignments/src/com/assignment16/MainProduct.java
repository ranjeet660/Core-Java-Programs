package com.assignment16;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		Product product = new Product();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight in kg");
		int weight = scanner.nextInt();
		product.productCheck(weight);
	}
}
