package com.assignment13;

import java.util.Scanner;

public class AccountImpl implements Account{

	@Override
	public void getSavingAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Enter Balance");
		float balance = scanner.nextFloat();
		
		getUserDetails(name, balance);
		
	}

	@Override
	public void getUserDetails(String name, float balance) {
		System.out.println("Account holder name: "+ name);
		System.out.println("Account balance is: "+ balance);
		
	}

	public static void main(String[] args) {
		AccountImpl accountImpl = new AccountImpl();
		accountImpl.getSavingAccount();
	}
}
