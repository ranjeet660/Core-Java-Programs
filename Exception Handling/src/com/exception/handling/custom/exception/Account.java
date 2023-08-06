package com.exception.handling.custom.exception;

public class Account {

	private float balance = 5000;
	
	public float getBalance() {
		return balance;
	}
	
	public void getWithdrawAmount(float amount) {
		
		if ( amount > balance ) {
			throw new InsufficientAccountBalance("Insufficient account balance");
		}
		balance = balance - amount;
	}
}
