package com.example.nurseGetAll;

public class Nurse {
	private String name;
	private String lastName;
	private int age;
	private String genre;

	public Nurse(String name, String lastName, int age, String genre) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.genre = genre;

	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getGenre() {
		return genre;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.lastName = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Nurse: " + name + " " + lastName + " " + age + " " + genre;
	}

}
