package com.exception.handling.custom2;

public class WeightOverloadedException extends RuntimeException {

	private String msg;
	public WeightOverloadedException(String msg) {
		super(msg);
	}
}
