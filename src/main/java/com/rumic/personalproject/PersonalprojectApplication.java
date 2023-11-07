package com.rumic.personalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
public class PersonalprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalprojectApplication.class, args);
		System.out.println("[🖥️ Server] Server is running on: http://localhost:8080/");
		System.out.println("[📃 Document API] Document API is running on: http://localhost:8080/api-docs");
		System.out.println("[📃 Swagger UI] Swagger UI is running on:  http://localhost:8080/swagger-ui.html");
	}

}
