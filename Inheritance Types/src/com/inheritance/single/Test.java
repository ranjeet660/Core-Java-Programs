package com.inheritance.single;

public class Test {

	public static void main(String[] args) {
		HealthInsurance healthInsurance = new HealthInsurance();
		healthInsurance.getInsurance();  //This is from Insurance
		healthInsurance.getHealthInsurance();  //This is from HealthInsurance
	}
}
