package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers ;

    public Branch(String name,Customer newCustomer) {
        this.name = name;
        this.customers = new ArrayList<Customer>();

    }

    public Branch(String name) {
        this.name = name;
    }

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomers(String customerName, double initialAmount){

      if (findCustomer(customerName) == null){
          this.customers.add(new Customer(customerName,initialAmount));
          return true;
      }
        System.out.println("customer already exists!");
       return false;

    }

    public boolean addCustomerTransaction(String customerName,double amount){
       Customer existingCustomer = findCustomer(customerName);
       if (existingCustomer != null ){
           existingCustomer.addTransaction(amount);
           System.out.println(amount + " added to the account of " + existingCustomer.getName());


           return true;
       }
        System.out.println("customer not found");
       return false;

    }

    private Customer findCustomer(String customerName){
        for (int i=0;i< this.customers.size();i++){

            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
