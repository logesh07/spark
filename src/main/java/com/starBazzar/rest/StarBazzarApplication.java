package com.starBazzar.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//(exclude = { SecurityAutoConfiguration.class })
public class StarBazzarApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarBazzarApplication.class, args);
	}

}
