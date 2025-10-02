package com.example.nurseGetAll;

public class Nurse {
	private String name;
	private String lastName;

	public Nurse(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;

	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.lastName = surname;
	}

	@Override
	public String toString() {
		return "Nurse: " + name + " " + lastName;
	}

}
