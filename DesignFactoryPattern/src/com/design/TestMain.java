package com.design;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("Enter here Tier and check seat avalibility");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		Booking book = BookingFactory.getBooking(str);
		book.getSeatAvailability();
	}
}
