package com.pentalog;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author aboieriu
 */
@Component
@Qualifier("targetUserValidator")
public class UserValidator {

	public void validateUser(){
		System.out.println("Validating user from UserValidator");
	}
}
