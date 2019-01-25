package com.pentalog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author aboieriu
 */
public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("airport-application-context.xml");

		AirportManager airportManager = (AirportManager) context.getBean(AirportManager.class);
		AirportManager airportManager2 = (AirportManager) context.getBean(AirportManager.class);

		airportManager.handle();
	}
}
