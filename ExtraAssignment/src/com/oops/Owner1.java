package com.oops;

public class Owner1 extends Car{

	@Override
	public void getCar() {
		System.out.println("My car name Alto");
		
	}
	public static void main(String[] args) {
		Owner1 owner1 = new Owner1();
		owner1.getCar();
		owner1.color();
	}
}
