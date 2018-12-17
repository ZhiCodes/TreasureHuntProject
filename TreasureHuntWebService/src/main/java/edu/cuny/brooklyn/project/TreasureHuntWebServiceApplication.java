package edu.cuny.brooklyn.project;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
@SpringBootApplication
public class TreasureHuntWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreasureHuntWebServiceApplication.class, args);
	}
}