package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.simplilearn")
public class Phase5Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase5Application.class, args);
		System.err.println("Application running on port 8080");
	}

}
