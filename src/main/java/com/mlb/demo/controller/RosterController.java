package com.mlb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mlb.demo.entity.roster.RosterWrapper;
import com.mlb.demo.service.RosterService;

@Controller
public class RosterController {

	@Autowired
	private RosterService rosterService;
	private RosterWrapper rosterWrapper;

	@GetMapping(value = "/roster/{id}")
	public String roster(@PathVariable("id") int id, Model model) {
		rosterWrapper = rosterService.getRosterDataFromAPI(id);

		model.addAttribute("rosterList", rosterWrapper.getRoster());
		model.addAttribute("teamId", id);
		
		return "roster";
	}

}