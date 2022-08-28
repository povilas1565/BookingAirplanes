package com.example.services.flightbooking.airport.flight;

import java.util.List;

import com.example.services.flightbooking.airport.domain.entity.Flight;

public interface FlightService {
	
	Flight getFlightById(String flightId);

	List<Flight> getAllFlights();
}
