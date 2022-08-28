package com.example.services.flightbooking.airport.airport;

import com.example.services.flightbooking.airport.AirportService;
import com.example.services.flightbooking.airport.domain.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("airports")
public class AirportController {
	
	@Autowired
	private AirportService airportService;

	
	@GetMapping
	public @ResponseBody
	List<Airport> getAllAirports() {
		return airportService.getAllAirports();
	}

	@GetMapping("/{data-code}")
	public @ResponseBody Airport getAirportById(@PathVariable("data-code") String dataCode) {
		return airportService.getAirportById(dataCode);
	}
}
