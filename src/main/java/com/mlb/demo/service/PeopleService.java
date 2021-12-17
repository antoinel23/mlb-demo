package com.mlb.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mlb.demo.entity.people.PeopleWrapper;

@Service
public class PeopleService {

	@Value("${mlb.api}")
	private String basePath;

	public PeopleWrapper getStatsDataFromAPI(int id) {
		String uri = basePath + "/people/" + id + "?hydrate=stats(group=[hitting,pitching],type=[yearByYear])";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<PeopleWrapper> result = restTemplate.getForEntity(uri, PeopleWrapper.class);
		return result.getBody();
	}
}