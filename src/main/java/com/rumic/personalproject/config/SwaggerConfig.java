package com.rumic.personalproject.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Personal project",
                version = "1.0.0",
                description = "Personal project for Spring boot",
                termsOfService = "Rumic",
                contact = @Contact(
                        email = "rumicnguyen@gmail.com",
                        name = "Rumic Nguyen"
                )
        )
)
public class SwaggerConfig {
}
