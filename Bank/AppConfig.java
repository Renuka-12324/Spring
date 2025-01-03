package com.example.Bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String accountNumber() {
        return "12345678";
    }
}


