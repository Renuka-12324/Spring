package com.example.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BankApplication.class, args);
		Bank bank = context.getBean(Bank.class);
		bank.Transaction();
	}

}
