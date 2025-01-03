package com.example.Restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(RestaurantApplication.class, args);
		Restaurant restaurant = context.getBean(Restaurant.class);
		restaurant.serveDish();
	}

}
