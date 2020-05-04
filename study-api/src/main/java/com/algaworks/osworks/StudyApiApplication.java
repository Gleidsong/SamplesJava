package com.algaworks.osworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class StudyApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudyApiApplication.class, args);		
	}
}
