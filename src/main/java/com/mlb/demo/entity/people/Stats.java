package com.mlb.demo.entity.people;

import java.util.List;

public class Stats {
	private List<Splits> splits;
	private SplitsGroup group;

	public List<Splits> getSplits() {
		return splits;
	}

	public void setSplits(List<Splits> splits) {
		this.splits = splits;
	}

	public SplitsGroup getGroup() {
		return group;
	}

	public void setGroup(SplitsGroup group) {
		this.group = group;
	}
}