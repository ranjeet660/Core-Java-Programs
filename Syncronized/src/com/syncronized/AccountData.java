package com.syncronized;

public class AccountData implements Runnable{

	Account account = new Account();
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			makeWithdraw(500);
			if(account.getBalance() <= 0) {
				System.out.println("Oop's Balance is Zero");
			}
		}
		
	}

	private synchronized void makeWithdraw(int amt) {
		if(account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " your req is processing... ");
		
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		
			int bal = account.getWithdraw(amt);
			System.out.println(Thread.currentThread().getName() + " your withdrawal has done & remaining balance is: "+ bal);
		}
	}

}
