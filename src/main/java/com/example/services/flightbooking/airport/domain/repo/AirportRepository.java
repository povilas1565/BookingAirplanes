package com.example.services.flightbooking.airport.domain.repo;

import com.example.services.flightbooking.airport.domain.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AirportRepository extends JpaRepository<Airport, String> {
	
}
