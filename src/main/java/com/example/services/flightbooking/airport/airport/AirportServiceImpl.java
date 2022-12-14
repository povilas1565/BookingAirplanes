package com.example.services.flightbooking.airport.airport;

import java.util.List;

import com.example.services.flightbooking.airport.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.services.flightbooking.airport.domain.entity.Airport;
import com.example.services.flightbooking.airport.domain.repo.AirportRepository;

@Service
@Transactional(readOnly = true)
public class AirportServiceImpl implements AirportService {

	@Autowired
	private AirportRepository airportRepo;

	@Override
	public Airport getAirportById(String airportId) {
		return airportRepo.findById(airportId).orElseThrow(() -> new AirportNotFoundException(airportId));
	}

	@Override
	public List<Airport> getAllAirports() {
		return airportRepo.findAll();
	}

}
