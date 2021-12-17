package com.mlb.demo.entity.people;

public class SplitData {
	private int gamesPlayed;

	// batting stats
	private int runs;
	private int homeRuns;
	private int hits;
	private String avg;
	private int atBats;
	private String obp;
	private String ops;
	private int stolenBases;
	private int rbi;

	// pitching stats
	private int gamesStarted;
	private int strikeOuts;
	private String era;
	private String inningsPitched;
	private int wins;
	private int losses;
	private int saves;
	private String whip;

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	// batting
	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public int getAtBats() {
		return atBats;
	}

	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	public String getObp() {
		return obp;
	}

	public void setObp(String obp) {
		this.obp = obp;
	}

	public String getOps() {
		return ops;
	}

	public void setOps(String ops) {
		this.ops = ops;
	}

	public int getStolenBases() {
		return stolenBases;
	}

	public void setStolenBases(int stolenBases) {
		this.stolenBases = stolenBases;
	}

	public int getRbi() {
		return rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	// pitching
	public int getStrikeOuts() {
		return strikeOuts;
	}

	public int getGamesStarted() {
		return gamesStarted;
	}

	public void setGamesStarted(int gamesStarted) {
		this.gamesStarted = gamesStarted;
	}

	public void setStrikeOuts(int strikeOuts) {
		this.strikeOuts = strikeOuts;
	}

	public String getEra() {
		return era;
	}

	public void setEra(String era) {
		this.era = era;
	}

	public String getInningsPitched() {
		return inningsPitched;
	}

	public void setInningsPitched(String inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getSaves() {
		return saves;
	}

	public void setSaves(int saves) {
		this.saves = saves;
	}

	public String getWhip() {
		return whip;
	}

	public void setWhip(String whip) {
		this.whip = whip;
	}
}