package com.assignment_15;

import java.util.Scanner;

public class AccountDetails {

	public void getAccountDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		System.out.println("Enter account number");
		String accNo = scanner.next();
		System.out.println("enter Balance");
		int bal = scanner.nextInt();
		
	
		
		Account account = new SavingAccount();
		account.setId(id);
		account.setAccountNumber(accNo);
		account.setBalance(bal);
		
		
		getWithdrawalDetails(account);
	}

	private static int getWithdrawalDetails(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter withdrawal balance: ");
		int withBal = scanner.nextInt();
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.setWithdrawAmount(withBal);
		
		int remainingBalance = account.getBalance() ;		
		if(account.getBalance() > savingAccount.getWithdrawAmount()) {
			remainingBalance = account.getBalance() - savingAccount.getWithdrawAmount();			
		}
		System.out.println("Current balance is: "+ remainingBalance);
		return remainingBalance;
			
	}
	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
		accountDetails.getAccountDetails();
	}
}
