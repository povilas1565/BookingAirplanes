package com.example.services.flightbooking.airport.booking.model.converter;

import java.util.ArrayList;
import java.util.List;

import com.example.services.flightbooking.airport.booking.model.FlightBookingModel;
import com.example.services.flightbooking.airport.booking.model.FlightModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.example.services.flightbooking.airport.booking.model.PassengerModel;
import com.example.services.flightbooking.airport.domain.entity.FlightBooking;

@Component
public class ToFlightBookingModelConverter implements Converter<FlightBooking, FlightBookingModel> {

	@Override
	public FlightBookingModel convert(FlightBooking source) {
		
		List<FlightModel> flights = new ArrayList<>();

		if (!CollectionUtils.isEmpty(source.getFlights())) {
			source.getFlights().stream().forEach(flight -> {
				flights.add(new FlightModel(flight.getDeparture(), flight.getArrival(),
						flight.getDepartureDate().toString(), flight.getArrivalDate().toString()));
			});
		}

		return new FlightBookingModel(source.getId(), new PassengerModel(source.getPassenger().getFirstName(),
				source.getPassenger().getLastName(), source.getPassenger().getEmail()), flights);
	}

}
