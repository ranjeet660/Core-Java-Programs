//Using implements Runnable interface

package com.multithread.example;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		for(int i=1; i <= 5; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		Thread thread = new Thread(threadTest);
		thread.start();
		//thread.run();  //This is also give output but this is not good approch
	}

}
