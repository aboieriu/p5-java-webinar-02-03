package com.pentalog;

import org.springframework.stereotype.Component;

/**
 * @author aboieriu
 */
@Component
public class FlightHandler {

	public void handleFlight(){
		System.out.println("handle flight from FlightHandler");
	}
}
