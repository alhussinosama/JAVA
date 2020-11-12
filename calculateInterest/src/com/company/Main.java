package com.company;

public class Main {

    public static void main(String[] args) {
        for (double interestRate  = 2 ; interestRate < 9 ; interestRate ++ ){
            System.out.println( "1000  * " + interestRate + " = " + calcucalteInterest( 1000 , interestRate) );
        }

    }

    public static double calcucalteInterest( double amount , double interestRate) {
        return ( amount * ( interestRate / 100));

    }
}
