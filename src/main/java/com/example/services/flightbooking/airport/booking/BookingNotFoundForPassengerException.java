package com.example.services.flightbooking.airport.booking;

import com.example.services.flightbooking.airport.system.ResourceNotFoundException;

public class BookingNotFoundForPassengerException extends ResourceNotFoundException {
	
	private static final long serialVersionUID = -3880429246973279969L;

	public BookingNotFoundForPassengerException(String passengerId) {
		super("Booking for Passenger", "passenger-id", passengerId);
	}

}
