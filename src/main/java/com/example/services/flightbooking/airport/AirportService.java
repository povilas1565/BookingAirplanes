package com.example.services.flightbooking.airport;

import java.util.List;

import com.example.services.flightbooking.airport.domain.entity.Airport;

public interface AirportService {
	Airport getAirportById(String airportId);
	List<Airport> getAllAirports();
}
