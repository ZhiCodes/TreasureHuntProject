package edu.cuny.brooklyn.project;

import org.springframework.data.annotation.Id;


public class GameMetrics {
	@Id
	private String name;
	private Integer score;
	private Integer rounds;
	
	public GameMetrics(String name, Integer score, Integer rounds) {
		this.name = name;
		this.score = score;
		this.rounds = rounds;
	}
	
	public String getName() {
		return name;
	}

	public Integer getScore() {
		return score;
	}
	
	public Integer getRounds() {
		return rounds;
	}
}
