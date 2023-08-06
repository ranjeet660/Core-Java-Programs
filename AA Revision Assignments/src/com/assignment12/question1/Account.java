package com.assignment12.question1;

import java.util.Scanner;

public class Account {

	private int accountNumber;
	private String accountName;
	
	public void getAccountDetails() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter account name");
		accountName = scanner.next();
		
		getAccountInformation(accountNumber, accountName);
	}
	public void getAccountInformation(int accNo, String accName) {
		System.out.println("Account number is: "+ accNo);
		System.out.println("Account name is: "+ accName);
	}
}
