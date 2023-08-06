package com.oops;

public class B extends A{

	@Override
	public void Add() {
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		A b = new B();
		b.Add();
	}
}
