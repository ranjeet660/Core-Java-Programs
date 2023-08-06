package com.question1;

public class TryCatchBlock {

	public static void main(String[] args) {
		try{
			System.out.println("1");				//1 will print
			int i=10/0;				
		}catch(NullPointerException e){				//Exception will not handle becoz here occur Airthmatic exception  
		System.out.println("2");
			try{
				System.out.println("3");
				int i=20/0;
			}catch(ArithmeticException e1){
				System.out.println("4");
				e1.printStackTrace();
			}
		}
	}
}
