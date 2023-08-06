package com.assignment_16;

public class Product {

	public void productCheck(int weight) {
		try {
			if( weight < 100) {
				throw new ProductException(weight+ "kg Weight is less than 100kbg");
			}
			System.out.println(weight + "kg weight is greater than 100kg");
		}catch (RuntimeException e1) {
			e1.printStackTrace();
		}
		
	}
}
