package com.company;

public class Account {
    private String number ;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerphoneNumber;

    // 3-create the constructors
        public Account( String number, double balance , String customerName , String customerEmailAddress ,
                        String customerphoneNumber){
            System.out.println(" ccount construtor with parameters called ");
            this.number = number;
            this.balance = balance;
            this.customerName = customerName;
            this.customerEmailAddress = customerEmailAddress;
            // to call these parameters for custructores call them from the object in the main.
        }


    //2- create the methods
            public void deposit( double depositAmount){
                this.balance += depositAmount;
                System.out.println(" deposit of " + depositAmount + " made . new balance is " + this.balance);
            }
            public void withdrawal( double withdrwalaAmount) {
                if( this.balance - withdrwalaAmount <=0){
                    System.out.println(" only " + this.balance + " available. withdrawal not processed");
                }else{
                    balance -= withdrwalaAmount ;
                    System.out.println(" withdrwal of " + withdrwalaAmount + " processed . remaining balance =" + this.balance);
                }
            }



    //1-create get and set for each variable.


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerphoneNumber() {
        return customerphoneNumber;
    }

    public void setCustomerphoneNumber(String customerphoneNumber) {
        this.customerphoneNumber = customerphoneNumber;
    }
}
