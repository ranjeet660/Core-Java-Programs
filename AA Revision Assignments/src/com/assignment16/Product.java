//1. Design the Product class in which design void productCheck(int weight) in check 
//   whether weight is less than 100, then throw the ProductException  with meaningful message. 
//2. Design the ProductException class in which write custom exceptions.
//3. Create MainProduct class in which pass the input to productCheck method with try and catch block.

package com.assignment16;

public class Product {

	public void productCheck(int weight) {
		try {
			if (weight < 100 ) {
				throw new ProductException("Weight is less than 100kg");
			}
			System.out.println(weight + "kg Weight is greater than 100 kg");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
