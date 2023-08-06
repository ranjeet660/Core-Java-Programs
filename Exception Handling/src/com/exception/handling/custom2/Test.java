package com.exception.handling.custom2;

public class Test {

	public static void checkWeight(int weight) {
		try {
			if(weight > 100) {//150 > 100
				throw new WeightOverloadedException("Weight is overloaded becoz "+ weight +" weight is more than 100 kg");
			}else {
				System.out.println("Weight is "+ weight + "kg");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		checkWeight(15);
	}
}
