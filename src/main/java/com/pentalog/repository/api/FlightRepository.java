package com.pentalog.repository.api;

import com.pentalog.model.FlightEntity;

/**
 * @author aboieriu
 */
public interface FlightRepository {
	FlightEntity create(FlightEntity flightToCreate);
	FlightEntity findByName(String flightName);
	void save(FlightEntity fl);
}
