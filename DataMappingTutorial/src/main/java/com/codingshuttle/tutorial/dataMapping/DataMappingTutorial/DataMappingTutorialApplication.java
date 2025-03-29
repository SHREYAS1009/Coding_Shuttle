package com.codingshuttle.tutorial.dataMapping.DataMappingTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DataMappingTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMappingTutorialApplication.class, args);
	}

}
