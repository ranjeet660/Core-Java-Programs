package com.syncronized;

public class Test {

	public static void main(String[] args) {
		AccountData accountData = new AccountData();
		Thread thread = new Thread(accountData);
		Thread thread2 = new Thread(accountData);
		thread.setName("Ranjeet");
		thread2.setName("Sourabh");
		thread.start();
		thread2.start();
	}
}
