package com.synchronisation.demo;

public class EmployeeData implements Runnable{

	Employee employee = new Employee();
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			makeWithdraw(500);
			if(employee.getSalary() <= 0) {  // 0 <= 0
				System.out.println(" Account balance is Zero");
			}
		}
		
	}

	private synchronized void makeWithdraw(int amt) {
		if(employee.getSalary() >= amt) {
			System.out.println(Thread.currentThread().getName()+ " transaction is processing");
		}
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		int bal = employee.getWithdraw(amt);
		System.out.println(Thread.currentThread().getName() + " Your remaining balance is "+ bal);
		
		
	}

}
