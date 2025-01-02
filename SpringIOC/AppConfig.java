package com.example.SpringIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "employee1")
    public Employee employee1() {
        Employee emp = new Employee();
        emp.setEid(101);
        emp.setEname("Renu");
        emp.setEadress("Bidar");
        return emp;
    }

    @Bean(name = "employee2")
    public Employee employee2() {
        Employee emp = new Employee();
        emp.setEid(102);
        emp.setEname("Anu");
        emp.setEadress("Bangalore");
        return emp;
    }
}
