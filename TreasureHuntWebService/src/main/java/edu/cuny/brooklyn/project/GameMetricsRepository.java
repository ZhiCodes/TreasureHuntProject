package edu.cuny.brooklyn.project;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface GameMetricsRepository extends CrudRepository<GameMetrics, String> {
	public GameMetrics findByName(String name);

	public List<GameMetrics> findAll();
}