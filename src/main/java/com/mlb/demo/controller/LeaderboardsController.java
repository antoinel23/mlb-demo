package com.mlb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mlb.demo.service.LeaderboardsService;

@Controller
public class LeaderboardsController {

	@Autowired
	private LeaderboardsService leaderboardsService;

	@Value("${baseballsavant.leader.batting}")
	private String basePathBatting;

	@Value("${baseballsavant.leader.pitching}")
	private String basePathPitching;

	@GetMapping({ "/leaderboards" })
	public String teams(Model model) {
		model.addAttribute("batting", leaderboardsService.getLeaderboardsData(basePathBatting));
		model.addAttribute("pitching", leaderboardsService.getLeaderboardsData(basePathPitching));

		return "leaderboards";
	}
}