package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Bank bank = new Bank("National bank of Australia");

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","Izzet",100);
        bank.addCustomer("Adelaide","Tugba",200);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);

        bank.addCustomerTransaction("Adelaide","Izzet",50.75);
        bank.addCustomerTransaction("Adelaide","Tugba",70.23);
        bank.addCustomerTransaction("Adelaide","Mike",60.23);



    bank.listCustomers("Adelaide",false);
    }




}