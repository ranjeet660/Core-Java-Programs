package com.assignment12.question3;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance{

	int duration;
	
	
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	void getTermPolicyDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter duration");
		duration = scanner.nextInt();
		
		setDuration(duration);
	}
	
	void getTermPolicyInformation() {
		System.out.println("Duration is : "+ getDuration() + "Years");
	}
	
	public static void main(String[] args) {
		TermPolicy termPolicy = new TermPolicy();
		termPolicy.getInsuranceDetails();
		termPolicy.getLifeInsuranceDetails();
		termPolicy.getTermPolicyDetails();
	}
}
