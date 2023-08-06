package com.multithreading;

public class Example extends Thread{

	@Override
	public void run() {
		for(int i=1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Example example = new Example();
		Example example2 = new Example();
		example.start();
		example2.start();
	}

}
