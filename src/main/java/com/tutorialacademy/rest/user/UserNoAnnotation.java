package com.tutorialacademy.rest.user;

public class UserNoAnnotation {
	private String name = null;
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
		return "UserNoAnnotation [name=" + name + ", password=" + password + "]";
	}
}
