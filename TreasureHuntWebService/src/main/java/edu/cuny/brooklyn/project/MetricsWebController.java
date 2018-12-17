
package edu.cuny.brooklyn.project;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class MetricsWebController {
	private final GameMetricsService gameMetricsService;

	@Autowired
	public MetricsWebController(GameMetricsService gameMetricsService) {
		this.gameMetricsService = gameMetricsService;
	}
	
	@RequestMapping(value = "/addgamemetrics", method = RequestMethod.GET)
	public boolean addGameMetrics(@RequestParam("name") String name,
			@RequestParam("score") Integer score,
			@RequestParam("rounds") Integer rounds) {
		gameMetricsService.saveGameMetrics(
				new GameMetrics(name, score, rounds));
		return true;
	}
	
	@RequestMapping("/viewgamemetrics")
	public List<GameMetrics> viewGameMetrics() {
		List<GameMetrics> gm = gameMetricsService.findAll();
		if (gm == null) {
			return null;
		}
		return gm; 
	}
}