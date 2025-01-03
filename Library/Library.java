package com.example.Library;

import org.springframework.stereotype.Component;

@Component
public class Library {
    private Book book;

    public Library(Book book){
        this.book = book;
    }

    public void displayBook(){
        System.out.println("Library has the following book:");
        book.info();
    }
}
