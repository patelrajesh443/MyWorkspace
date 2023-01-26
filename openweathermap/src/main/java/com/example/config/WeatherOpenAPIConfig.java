package com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherOpenAPIConfig {
    @Bean
    public OpenAPI springShopOpenAPI(final @Value("${spring.application.name}") String applicationName) {
        return new OpenAPI().info(new Info().title(applicationName).description(applicationName));
    }
}
