package com.example.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "student1")
    public Student student1() {
        return new Student(102, "Renu", 22);
    }


    @Bean(name = "student2")
    public Student student2() {
        return new Student(100, "Vajra", 22);
    }
}
