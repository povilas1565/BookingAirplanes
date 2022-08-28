package com.example.services.flightbooking.airport.domain.repo;

import java.util.List;

import com.example.services.flightbooking.airport.domain.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FlightBookingRepository extends JpaRepository<FlightBooking, String> {

	List<FlightBooking> findByPassengerId(String passengerId);
}
