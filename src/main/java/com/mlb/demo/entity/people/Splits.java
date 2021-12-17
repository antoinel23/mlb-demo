package com.mlb.demo.entity.people;

import com.mlb.demo.entity.team.Team;

public class Splits {
	private String season;
	private SplitData stat;
	private Team team;

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public SplitData getStat() {
		return stat;
	}

	public void setStat(SplitData stat) {
		this.stat = stat;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
}