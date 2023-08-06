package com.assignment15;

import java.util.Scanner;

public class AccountDetails {

	public void getAccountDetails() {
		Scanner scanner = new Scanner(System.in);
		SavingAccount savingAccount = new SavingAccount();
		
		System.out.println("Enter Account Id: ");
		int id = scanner.nextInt();
		System.out.println("Enter account number");
		long accNo = scanner.nextLong();
		System.out.println("Enter Balance");
		int bal = scanner.nextInt();
		
		//set values
		savingAccount.setId(id);
		savingAccount.setAccountNumber(accNo);
		savingAccount.setBalance(bal);
		
		getWithdrawDetails(savingAccount);
	}
	
	public static int getWithdrawDetails(Account account) {
		SavingAccount savingAccount = new SavingAccount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		int withdraw = scanner.nextInt();
		savingAccount.setWithdrawAmount(withdraw);
		
		 int currentBal = account.getBalance();
		 if(account.getBalance() > savingAccount.getWithdrawAmount()) {
			 currentBal = account.getBalance() - savingAccount.getWithdrawAmount();
		 }
		System.out.println("Current balance is: "+ currentBal);
		return currentBal;		
	}
	
	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
		accountDetails.getAccountDetails();
	}
}
