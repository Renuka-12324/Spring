package com.example.Library;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;

    public Book(String title){
        this.title = title;
    }

    public void info(){
        System.out.println("Book Title: "+title);
    }
}
