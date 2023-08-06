package com.factory.design;

import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {
		System.out.println("Enter insurance type");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		Insurance i = InsuranceFactory.getInsurance(str);
		System.out.println("Insurance type is "+i.insuranceType());
	}
}
