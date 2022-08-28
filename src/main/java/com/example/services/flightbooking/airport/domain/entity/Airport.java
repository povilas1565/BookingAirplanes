package com.example.services.flightbooking.airport.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport {

	@Id
	private String dataCode;
	private String name;
	private String countryIsoCode;

	public Airport() {
		super();
	}

	public Airport(String dataCode, String name, String countryIsoCode) {
		super();
		this.dataCode = dataCode;
		this.name = name;
		this.countryIsoCode = countryIsoCode;
	}

	public String getDataCode() {
		return dataCode;
	}

	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryIsoCode() {
		return countryIsoCode;
	}

	public void setCountryIsoCode(String countryIsoCode) {
		this.countryIsoCode = countryIsoCode;
	}

}
