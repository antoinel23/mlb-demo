package com.mlb.demo.entity.team;

public class Team {

	private int id;
	private String name;
	private String teamName;
	private String locationName;
	private String abbreviation;
	private int firstYearOfPlay;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public int getFirstYearOfPlay() {
		return firstYearOfPlay;
	}

	public void setFirstYearOfPlay(int firstYearOfPlay) {
		this.firstYearOfPlay = firstYearOfPlay;
	}
}