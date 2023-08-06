package com.assignment12.question2;

import java.util.Scanner;

public class HdfcBank extends Bank{

	void getHDFCBankDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principle amount");
		principleAmount = scanner.nextDouble();
		System.out.println("Enter tenure");
		tenure = scanner.nextInt();
		System.out.println("Enter Rate of Interest");
		rateOfInterest = scanner.nextFloat();
		
		getCalculateInterest(principleAmount, tenure, rateOfInterest);
	}
	
	public double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double intrest = (principleAmount * tenure * rateOfInterest)/100;
		System.out.println("Interest is: " + intrest);
		return intrest;
	}
	
	public static void main(String[] args) {
		HdfcBank hdfcBank = new HdfcBank();
		hdfcBank.getHDFCBankDetails();
	}
}
