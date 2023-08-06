package com.inheritance.heirachical;

public class Test {

	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.getLoan();
		homeLoan.getHomeLoan();
		
		PersonalLoan personalLoan = new PersonalLoan();
		personalLoan.getPersonalLoan();
		
		BikeLoan bikeLoan = new BikeLoan();
		bikeLoan.getBikeLoan();
	}
}
