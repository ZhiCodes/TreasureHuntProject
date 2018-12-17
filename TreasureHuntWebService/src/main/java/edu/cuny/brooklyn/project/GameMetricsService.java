package edu.cuny.brooklyn.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameMetricsService {

	@Autowired
	private final GameMetricsRepository gameMetricsRepository;
	
	
	@Autowired
	public GameMetricsService(GameMetricsRepository gameMetricsRepository) {
		this.gameMetricsRepository = gameMetricsRepository;
	}
	
	public void saveGameMetrics(GameMetrics gameMetrics) {
		gameMetricsRepository.save(gameMetrics);
	}
	
	public GameMetrics findGameMetricsByName(String name) {
		GameMetrics gameMetrics = gameMetricsRepository.findByName(name);
		return gameMetrics;
	}

	public List<GameMetrics> findAll() {
		return gameMetricsRepository.findAll();
	}
}