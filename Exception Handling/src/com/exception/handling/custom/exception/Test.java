package com.exception.handling.custom.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		System.out.println("Available balance is: "+ account.getBalance());
		System.out.print("Enter withdraw amount: ");
		float bal = scanner.nextFloat();
		account.getWithdrawAmount(bal);
		System.out.println("Your current balance is: "+ account.getBalance());
	}
}	
