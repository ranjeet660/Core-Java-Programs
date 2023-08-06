//Create custom exception
// Step:-
//		1) Create new class
//		2) user defined class extends runtime exceptions
//		3) create parameterized constructor with String argument

package com.exception.handling.custom.exception;

public class InsufficientAccountBalance extends RuntimeException{

	public InsufficientAccountBalance(String msg) {
		super(msg);
	}
}
