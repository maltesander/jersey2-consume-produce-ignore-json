package com.tutorialacademy.rest.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserIgnorePassword {
	private String name = null;
	
	@JsonIgnore
	private String password = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserIgnorePassword [name=" + name + ", password=" + password + "]";
	}
	
}
