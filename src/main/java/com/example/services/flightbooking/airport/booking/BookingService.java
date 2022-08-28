package com.example.services.flightbooking.airport.booking;

import java.util.List;

import com.example.services.flightbooking.airport.domain.entity.FlightBooking;

public interface BookingService {
	
	FlightBooking getBooking(String bookingId);
	
	List<FlightBooking> getAllBookingsByPassenger(String passengerId);

	List<FlightBooking> getAllMultiFlightBookingsByPassenger(String passengerId);

	List<FlightBooking> getAllMultiFlightBookings();
	
	void createSampleBookings();

}
