package com.mlb.demo.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mlb.demo.entity.leaderboards.LeaderboardsWrapper;
import com.mlb.demo.entity.roster.Person;

@Service
public class LeaderboardsService {

	public Map<Person, Float> getLeaderboardsData(String basePath) {
		RestTemplate restTemplate = new RestTemplate();
		LeaderboardsWrapper leaderboardsWrapper = new LeaderboardsWrapper();

		String result = restTemplate.getForObject(basePath, String.class);
		List<String> csvLines = new LinkedList<String>(Arrays.asList(result.split("\n")));

		// removing columns names (first line of the csv file)
		csvLines.remove(0);

		for (int i = 0; i < csvLines.size(); i++) {
			String[] currentLine = csvLines.get(i).split(",");
			Person leader = new Person();

			String lastName = currentLine[0];
			String firstName = currentLine[1];
			int id = Integer.parseInt(currentLine[2]);
			Float value = Float.parseFloat(currentLine[4]);

			leader.setFullName(lastName + ", " + firstName);
			leader.setId(id);
			leaderboardsWrapper.add(leader, value);
		}

		return leaderboardsWrapper.getLeaders();
	}
}