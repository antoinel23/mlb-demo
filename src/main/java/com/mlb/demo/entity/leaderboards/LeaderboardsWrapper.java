package com.mlb.demo.entity.leaderboards;

import java.util.HashMap;
import java.util.Map;

import com.mlb.demo.entity.roster.Person;

public class LeaderboardsWrapper {
	private Map<Person, Float> leaders;

	public LeaderboardsWrapper() {
		this.leaders = new HashMap<Person, Float>();
	}

	public void add(Person person, Float value) {
		this.leaders.put(person, value);
	}

	public Map<Person, Float> getLeaders() {
		return leaders;
	}

	public void setLeaders(Map<Person, Float> leaders) {
		this.leaders = leaders;
	}
}