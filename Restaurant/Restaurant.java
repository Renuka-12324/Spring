package com.example.Restaurant;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    private Chef chef;

    public Restaurant(Chef chef){
        this.chef = chef;

    }

    public void serveDish(){
        System.out.println("Restaurant is serving dish");
        chef.cook();
    }
}
