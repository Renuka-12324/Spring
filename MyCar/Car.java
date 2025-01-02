package com.example.MyCar;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}
