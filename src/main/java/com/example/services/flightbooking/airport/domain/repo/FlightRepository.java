package com.example.services.flightbooking.airport.domain.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.example.services.flightbooking.airport.domain.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FlightRepository extends JpaRepository<Flight, String> {
	
	List<Flight> findByDepartureAndDepartureDateGreaterThan(String departure, LocalDateTime departureDate);
}
