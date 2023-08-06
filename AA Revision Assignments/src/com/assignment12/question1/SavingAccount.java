package com.assignment12.question1;

import java.util.Scanner;

public class SavingAccount extends Account{
	private String accountType;
	private long balance;
	
	public void getSavingAccountDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account type");
		accountType = scanner.next();
		System.out.println("Enter balance");
		balance = scanner.nextLong();
		
		getSavingInformation(accountType, balance);
	}
	
	public void getSavingInformation(String accType, long bal) {
		System.out.println("Account Type: "+accType);
		System.out.println("Account balance is: "+bal);
	}

}
