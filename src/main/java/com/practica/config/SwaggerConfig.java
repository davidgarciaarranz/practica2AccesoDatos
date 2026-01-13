package com.practica.config;  // Asegúrate de usar el paquete correcto

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info().title("API de Ejemplo")
            .description("Descripción de la API de la aplicación hetero3")
            .version("1.0"));
    }
}
