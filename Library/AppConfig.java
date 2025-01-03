package com.example.Library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String bookTitle() {
        return "Spring Boot in Action";
    }
}


