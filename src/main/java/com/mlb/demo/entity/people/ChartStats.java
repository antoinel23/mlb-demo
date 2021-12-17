package com.mlb.demo.entity.people;

import java.util.ArrayList;
import java.util.List;

public class ChartStats {
	private List<String> labels;
	private List<String> data;

	public ChartStats() {
		labels = new ArrayList<String>();
		data = new ArrayList<String>();
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public void addSeason(String year, String number) {
		// The following condition make sure we only add the cumulative stat line if the player has been traded during the season
		if (labels.size() == 0 || !year.equals(labels.get(labels.size() - 1))) {
			labels.add(year);
			data.add(number);
		}
	}
}