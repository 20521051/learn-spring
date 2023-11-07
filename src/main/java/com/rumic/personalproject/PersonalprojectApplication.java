package com.rumic.personalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PersonalprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalprojectApplication.class, args);
		System.out.println("[🖥️ Server] Server is running on: http://localhost:8080/");
		System.out.println("[📃 Document API] Document API is running on: http://localhost:8080/api-docs");
		System.out.println("[📃 Swagger UI] Swagger UI is running on:  http://localhost:8080/swagger-ui.html");
	}

}
