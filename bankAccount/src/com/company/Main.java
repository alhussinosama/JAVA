package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        - create a new class for a bank account.
        -create a fields for the account numbers , balance , customer name , email
           and phone numbers
         -create (getters a setters) for each field.
         -create 2 additional methods.
          1- to allow the customers to deposit funds / this should increament the balance field.
          2- to allow the customers to withdraw funds , this should deduct from the balance fiels.
          but not allow the withdrawal to complete if their are insufficient funds.
          -  create a various code in the main class .
          -confirm your code is working.

         */

        Account bobsAccount = new Account( "1235", 0.00 , " Jakob H" ,
                "jakon@gml.com" , "05525586");
        System.out.println( bobsAccount.getNumber());
        System.out.println( bobsAccount.getBalance());
        
        bobsAccount.withdrawal( 100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

    }
}
