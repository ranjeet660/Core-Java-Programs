package com.design;

public class BookingFactory {

	public static Booking getBooking(String seat) {
		if(seat.equalsIgnoreCase("first")) {
			return new FirstTier();
		}else if (seat.equalsIgnoreCase("second")) {
			return new SecondTier();
		}else if (seat.equalsIgnoreCase("third")) {
			return new ThirdTier();
		}
		throw new IllegalArgumentException("Invalid Choice");
	}
}
