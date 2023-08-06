package com.assignment12.question3;

import java.util.Scanner;

public class LifeInsurance extends Insurrance{

	int premiumAmount;
	
	
	
	public int getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	void getLifeInsuranceDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter premium account");
		premiumAmount = scanner.nextInt();
		
		setPremiumAmount(premiumAmount);
	}
	
	void getLifeInsuranceInformation() {
		System.out.println("Premiun acc: "+ getPremiumAmount());
	}
}
