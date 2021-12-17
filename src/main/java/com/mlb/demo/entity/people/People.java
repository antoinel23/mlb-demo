package com.mlb.demo.entity.people;

import java.util.List;

import com.mlb.demo.entity.roster.Person;

public class People extends Person {
	private String firstName;
	private String lastName;
	private int primaryNumber;
	private int currentAge;
	private String birthCity;
	private String birthCountry;
	private String height;
	private int weight;
	private Position primaryPosition;
	private int draftYear;
	private List<Stats> stats;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPrimaryNumber() {
		return primaryNumber;
	}

	public void setPrimaryNumber(int primaryNumber) {
		this.primaryNumber = primaryNumber;
	}

	public int getCurrentAge() {
		return currentAge;
	}

	public void setCurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}

	public String getBirthCity() {
		return birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public String getBirthCountry() {
		return birthCountry;
	}

	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Position getPrimaryPosition() {
		return primaryPosition;
	}

	public void setPrimaryPosition(Position primaryPosition) {
		this.primaryPosition = primaryPosition;
	}

	public int getDraftYear() {
		return draftYear;
	}

	public void setDraftYear(int draftYear) {
		this.draftYear = draftYear;
	}

	public List<Stats> getStats() {
		return stats;
	}

	public void setStats(List<Stats> stats) {
		this.stats = stats;
	}
}