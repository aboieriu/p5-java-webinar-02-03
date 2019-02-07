package com.pentalog;

import com.pentalog.service.FlightServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author aboieriu
 */
public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("airport-application-context.xml");

		FlightServiceImpl airportManager = (FlightServiceImpl) context.getBean(FlightServiceImpl.class);

		//airportManager.createFlight("ZSC_1234");
		//airportManager.createFlight("FS-231");
		//airportManager.createFlight("FASDA-5");

		//airportManager.createUser("aboieriu@pentalog.fr", "alex", "boieriu");

		//airportManager.assignUserToFlight("aboieriu@pentalog.fr", "PTG-5");


	}
}
