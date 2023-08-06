package com.abstraction.interfce;

public class Test implements Example{

	@Override
	public void x1() {
		System.out.println("Interface method calling from implement class");
	}
}
