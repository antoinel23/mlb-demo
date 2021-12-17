package com.mlb.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mlb.demo.entity.roster.RosterWrapper;

@Service
public class RosterService {

	@Value("${mlb.api}")
	private String basePath;

	public RosterWrapper getRosterDataFromAPI(int id) {
		String uri = basePath + "/teams/" + id + "/roster";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<RosterWrapper> result = restTemplate.getForEntity(uri, RosterWrapper.class);
		return result.getBody();
	}
}