package com.example.services.flightbooking.airport.passenger;

import java.util.List;

import com.example.services.flightbooking.airport.domain.entity.Passenger;

public interface PassengerService {
	
	Passenger getPassengerById(String passengerId);

	List<Passenger> getAllPassengers();
}
