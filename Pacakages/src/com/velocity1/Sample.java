package com.velocity1;

import com.velocity.Add;

public class Sample {

	public void getStudent() {
		System.out.println("this class from velocity1 pacakage");
		
	}
	public static void main(String[] args) {
	
		Add add = new Add();		//this method is from Add class
		int sum = add.addition(50, 45);
		System.out.println("Addition is :"+ sum);
	}
}
