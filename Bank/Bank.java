package com.example.Bank;

import org.springframework.stereotype.Component;

@Component
public class Bank {
    private Account account;

    public Bank(Account account){
        this.account = account;
    }

    public void Transaction(){
        System.out.println("Processing transaction ");
        account.displayDetails();
    }
}
