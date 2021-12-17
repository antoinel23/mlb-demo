package com.mlb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mlb.demo.entity.people.ChartStats;
import com.mlb.demo.entity.people.People;
import com.mlb.demo.entity.people.PeopleWrapper;
import com.mlb.demo.entity.people.Splits;
import com.mlb.demo.entity.people.Stats;
import com.mlb.demo.service.PeopleService;

@Controller
public class PeopleController {

	@Autowired
	private PeopleService peopleService;
	private PeopleWrapper peopleWrapper;

	@GetMapping(value = "/player/{id}")
	public String people(@PathVariable("id") int id, Model model) {
		peopleWrapper = peopleService.getStatsDataFromAPI(id);

		People player = peopleWrapper.getPeople().get(0);
		List<Splits> battingStats = null;
		List<Splits> pitchingStats = null;
		ChartStats opsChart = new ChartStats();
		ChartStats whipChart = new ChartStats();

		if (player.getStats() != null) {
			for (int i = 0; i < player.getStats().size(); i++) {
				Stats stats = player.getStats().get(i);
				String splitsGroup = stats.getGroup().getDisplayName();
				switch (splitsGroup) {
				case "hitting":
					battingStats = stats.getSplits();
					if (battingStats.size() > 1) {
						for (int j = 0; j < battingStats.size(); j++) {
							Splits splits = battingStats.get(j);
							opsChart.addSeason(splits.getSeason(), splits.getStat().getOps());
						}
					}
					break;

				case "pitching":
					pitchingStats = stats.getSplits();
					if (pitchingStats.size() > 1) {
						for (int j = 0; j < pitchingStats.size(); j++) {
							Splits splits = pitchingStats.get(j);
							whipChart.addSeason(splits.getSeason(), splits.getStat().getWhip());
						}
					}
					break;
				}
			}
		}

		model.addAttribute("peopleInfo", player);
		model.addAttribute("battingStats", battingStats);
		model.addAttribute("pitchingStats", pitchingStats);
		model.addAttribute("opsChart", opsChart);
		model.addAttribute("whipChart", whipChart);

		return "people";
	}
}