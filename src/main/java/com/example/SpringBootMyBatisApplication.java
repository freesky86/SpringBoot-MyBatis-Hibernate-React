package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatisApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "This Spring Boot project will show you how to connect database with MyBatis!";
	}

}
