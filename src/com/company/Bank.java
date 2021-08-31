package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private String name;

    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;

        }
        return false;

    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch existingBranch  = findBranch(branchName);
        if (existingBranch != null){
            return  existingBranch.newCustomers(customerName,initialAmount);


        }
        return false;

    }

    public boolean addCustomerTransaction(String branchName,String customerName,double amount){
      Branch existingBranch =  findBranch(branchName);
      if (existingBranch != null){
          return existingBranch.addCustomerTransaction(customerName,amount);

      }
      return false;



    }

    private Branch findBranch(String name){
        for (int i=0;i<this.branches.size();i++){

              Branch checkedBranch = this.branches.get(i);

              if (checkedBranch.equals(name)){
                  return checkedBranch;
              }
        }
        return null;



    }

    public boolean listCustomers(String branchName,boolean showTransactions ){
       Branch existingBranch =  findBranch(branchName);
       if (existingBranch != null){
           System.out.println("Customers for branch " + existingBranch.getName());

           ArrayList<Customer> branchCustomers = existingBranch.getCustomers();

           for (int i = 0;i<branchCustomers.size();i++){
               Customer customers = branchCustomers.get(i);
               System.out.println("Customer " + customers.getName() +"[ " +(i+1)+ " ]");
               if(showTransactions) {

                   System.out.println("Transactions: ");
                   ArrayList<Double> transactions = customers.getTransactions();
                   for (int j=0; j<transactions.size();i++){
                       System.out.println("[" + (j+1) +" ]" +" Amount" + transactions.get(j)) ;

                   }


               }


           }
           return true;
           }else{
           return false;



       }


       }



    }















