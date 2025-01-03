package com.example.Bank;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private String accountNumber;

    public Account(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void displayDetails(){
        System.out.println("Account Number: "+ accountNumber);
    }
}
