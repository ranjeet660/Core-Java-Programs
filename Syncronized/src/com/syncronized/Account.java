package com.syncronized;

public class Account {

	int balance=5000;
	
	public int getBalance() {
		return balance;
	}
	
	public int getWithdraw(int amount) {
		balance = balance - amount;
		return balance;
	}
}
