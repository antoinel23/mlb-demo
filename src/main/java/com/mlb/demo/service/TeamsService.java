package com.mlb.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mlb.demo.entity.team.TeamWrapper;

@Service
public class TeamsService {

	@Value("${mlb.api}")
	private String basePath;

	public TeamWrapper getTeamsDataFromAPI() {
		String uri = basePath + "/teams?sportId=1";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<TeamWrapper> result = restTemplate.getForEntity(uri, TeamWrapper.class);
		return result.getBody();
	}
}