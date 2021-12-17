package com.mlb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mlb.demo.entity.team.TeamWrapper;
import com.mlb.demo.service.TeamsService;

@Controller
public class TeamController {

	@Autowired
	private TeamsService teamsService;
	private TeamWrapper teamWrapper;

	@GetMapping({ "/teams" })
	public String teams(Model model) {
		teamWrapper = teamsService.getTeamsDataFromAPI();

		model.addAttribute("teamList", teamWrapper.getTeams());

		return "teams";
	}

}