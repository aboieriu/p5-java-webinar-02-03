package com.pentalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author aboieriu
 */

@Entity
@Table(name = "t_user")
public class UserEntity extends AbstractBaseEntity {

	@Column(name = "email")
	private String email;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	public UserEntity(){
		// Default empty constructor
	}

	public UserEntity(String email, String fname, String lname) {
		this.email = email;
		this.fname = fname;
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}


}
