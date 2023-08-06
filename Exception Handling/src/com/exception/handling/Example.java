package com.exception.handling;

public class Example {

	public static void main(String[] args) {
		//Case 1
//		try {
//			  //Not allowed
//		}
		
		//Case 2
//		try {
//				//allowed
//		} catch (Exception e) {
//			
//		}
		
		//Case 3
//		try {
//			   //allowed
//		} finally {
//		
//		}
		
		//Case 4
//		try {
//								//allowed
//		}catch (Exception e) {
//			
//		}finally {
//			
//		}
		
		//Case 5
		// 
//		try {
//									//allowed
//		}catch (ArithmeticException ae) {
//			
//		}catch (Exception e) {
//			
//		}
		
		//Case 6
		// we can't write bigger exception in first catch block because it will handle all exception and there will be no chance to reach the second catch block 
//		try {
//								//not allowed
//		}catch (Exception e) {
//			
//		}catch (ArithmeticException ae) {
//			
//		}
		
	}
}
