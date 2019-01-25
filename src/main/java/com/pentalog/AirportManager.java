package com.pentalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author aboieriu
 */
@Component
public class AirportManager {

	@Autowired
	private FlightHandler flightHandler;
	@Autowired
	private UserHandler userHandler;

	public AirportManager() {
	}

	public AirportManager(FlightHandler flightHandler, UserHandler userHandler) {
		this.flightHandler = flightHandler;
		this.userHandler = userHandler;
	}

	@PostConstruct
	public void customInit(){
		System.out.println("Custom init from AirportManager");
	}

	public void handle(){
		flightHandler.handleFlight();
		userHandler.handleUser();
	}

	public FlightHandler getFlightHandler() {
		return flightHandler;
	}

	public void setFlightHandler(FlightHandler flightHandler) {
		this.flightHandler = flightHandler;
	}

	public UserHandler getUserHandler() {
		return userHandler;
	}

	public void setUserHandler(UserHandler userHandler) {
		this.userHandler = userHandler;
	}
}
