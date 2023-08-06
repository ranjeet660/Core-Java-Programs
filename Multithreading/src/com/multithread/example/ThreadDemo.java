//Using Extend Thread class

package com.multithread.example;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		for(int i = 1; i <=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo threadDemo = new ThreadDemo();
		threadDemo.start();
	}
}
